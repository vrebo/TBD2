/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.silo.vista.reportes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import org.silo.utils.pdf.PDFHelper;

/**
 *
 * @author VREBO
 */
public class GeneradorReporte extends javax.swing.JPanel {

    /**
     * Creates new form GeneradorReporte
     */
    private JPanel leftPanel;
    private JPanel rightPanel;
    private String rutaUltimoReporte;

    public GeneradorReporte() {
        initComponents();
    }

    public GeneradorReporte(JPanel leftPanel, JPanel rightPanel) {
        this.leftPanel = leftPanel;
        this.rightPanel = rightPanel;
        initComponents();
        _initComponents();
        installListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        generadorToolBar1 = new org.silo.vista.componentes.GeneradorToolBar();
        jPanel2 = new javax.swing.JPanel();
        reporteToolBar2 = new org.silo.vista.componentes.ReporteToolBar();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(200);

        jPanel1.setLayout(new java.awt.BorderLayout());

        generadorToolBar1.setRollover(true);
        jPanel1.add(generadorToolBar1, java.awt.BorderLayout.PAGE_START);

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        reporteToolBar2.setRollover(true);
        jPanel2.add(reporteToolBar2, java.awt.BorderLayout.PAGE_START);

        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.silo.vista.componentes.GeneradorToolBar generadorToolBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private org.silo.vista.componentes.ReporteToolBar reporteToolBar2;
    // End of variables declaration//GEN-END:variables

    private void _initComponents() {
        jPanel1.add(leftPanel, "Center");
        jPanel2.add(rightPanel, "Center");
    }

    private void installListeners() {
        generadorToolBar1.getCreateReport().addActionListener((ActionEvent e) -> {
            String nombre = ((PanelGenerador) leftPanel).getNombreReporte();
            System.out.println(nombre);
            PDFHelper pdf = new PDFHelper();
            switch (nombre) {
                case "reporte-clientes":
                    Date[] intervalo = ((PanelClientes) leftPanel).getData();
                    pdf.generarReporteRegistroMensualClientes(intervalo[0], intervalo[1]);
                    jPanel2.remove(rightPanel);
                    rutaUltimoReporte = pdf.getRuta();
                    rightPanel = new PanelPDF(rutaUltimoReporte);
                    jPanel2.add(rightPanel, "Center");
                    getParent().repaint();
                    break;
                case "reporte-empleado":
                    Object[] datosReporte = ((PanelEmpleados) leftPanel).getData();
                    boolean agrupar = (boolean) datosReporte[0];
                    System.out.println(agrupar);
                    if (agrupar) {
                        try {
                            pdf.generarReporteEmpleadosMensualEstado();
                        } catch (IOException ex) {
                            Logger.getLogger(GeneradorReporte.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        Date[] intervalo1 = (Date[])datosReporte[1];
                        pdf.generarReporteRegistroMensualEmpleados(intervalo1[0], intervalo1[1]);
                    }
                    jPanel2.remove(rightPanel);
                    rutaUltimoReporte = pdf.getRuta();
                    rightPanel = new PanelPDF(rutaUltimoReporte);
                    jPanel2.add(rightPanel, "Center");
                    getParent().repaint();
                    break;
            }
        });

        generadorToolBar1.getSaveReport().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jf = new JFileChooser();
                int opcion = jf.showSaveDialog(null);
                if (opcion == JFileChooser.APPROVE_OPTION) {
                    try {
                        File origen = new File(rutaUltimoReporte);
                        File destino = jf.getSelectedFile();
                        Files.copy(origen.toPath(), destino.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException ex) {
                        Logger.getLogger(GeneradorReporte.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        });
    }
}