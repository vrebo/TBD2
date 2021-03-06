/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.silo.vista.catalogos.forms;

import java.util.Date;
import org.silo.modelos.bo.Cliente;

/**
 *
 * @author VREBO
 */
public class FormularioCliente extends javax.swing.JPanel implements Form<Cliente> {

    /**
     * Creates new form FormularioCliente
     */
    public FormularioCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanel1 = new org.silo.vista.componentes.ImagePanel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new org.jdesktop.swingx.JXTextField();
        apPaterno = new org.jdesktop.swingx.JXTextField();
        apMaterno = new org.jdesktop.swingx.JXTextField();
        fechaRegistro = new javax.swing.JSpinner();
        fechaNacimiento = new javax.swing.JSpinner();

        setMinimumSize(new java.awt.Dimension(420, 300));
        setPreferredSize(new java.awt.Dimension(420, 300));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(imagePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        id.setEditable(false);
        add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, -1));

        jLabel3.setText("ID:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, -1));

        jLabel1.setText("Fecha de nacimiento:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 110, -1));

        jLabel2.setText("Fecha de registro:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, -1));

        nombre.setPrompt("Nombre");
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, -1));

        apPaterno.setPrompt("Apellido Paterno");
        add(apPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, -1));

        apMaterno.setToolTipText("Apellido Materno");
        apMaterno.setPrompt("Apellido Materno");
        add(apMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, -1));

        fechaRegistro.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.YEAR));
        fechaRegistro.setEditor(new javax.swing.JSpinner.DateEditor(fechaRegistro, "dd/MM/yyyy"));
        fechaRegistro.setEnabled(false);
        add(fechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 100, -1));

        fechaNacimiento.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.YEAR));
        fechaNacimiento.setEditor(new javax.swing.JSpinner.DateEditor(fechaNacimiento, "dd/MM/yyyy"));
        add(fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 100, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXTextField apMaterno;
    private org.jdesktop.swingx.JXTextField apPaterno;
    private javax.swing.JSpinner fechaNacimiento;
    private javax.swing.JSpinner fechaRegistro;
    private javax.swing.JTextField id;
    private org.silo.vista.componentes.ImagePanel imagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private org.jdesktop.swingx.JXTextField nombre;
    // End of variables declaration//GEN-END:variables

    private Cliente data = new Cliente();

    @Override
    public Cliente getData() {
        data.setIdCliente(id.getText());
        data.setNombre(nombre.getText());
        data.setApellidoPaterno(apPaterno.getText());
        data.setApellidoMaterno(apMaterno.getText());
        data.setFechaNacimiento((Date) fechaNacimiento.getValue());
        data.setFechaRegistro(new Date());
        data.setImagen(imagePanel1.getData());

        return data;
    }

    @Override
    public void setData(Cliente data) {
        this.data = data;
        updateData();
    }

    @Override
    public void updateData() {
        id.setText(data.getIdCliente());
        nombre.setText(data.getNombre());
        apPaterno.setText(data.getApellidoPaterno());
        apMaterno.setText(data.getApellidoMaterno());
        fechaNacimiento.setValue(data.getFechaNacimiento());
        fechaRegistro.setValue(data.getFechaRegistro());
        imagePanel1.setData(data.getImagen());
    }

    @Override
    public void cleanData() {
        Date now = new Date();
        id.setText("C" + now.getTime());
        nombre.setText("");
        apPaterno.setText("");
        apMaterno.setText("");
        fechaNacimiento.setValue(new Date());
        fechaRegistro.setValue(new Date());
        imagePanel1.cleanData();
    }

}
