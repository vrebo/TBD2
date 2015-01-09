/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.silo.vista.utilerias;

import org.jdesktop.swingx.JXTable;
import org.silo.utils.pdf.DataBaseHelper;
import org.silo.vista.componentes.ModelosDeTabla;
import org.silo.vista.componentes.MyTableModel;

/**
 *
 * @author VREBO
 */
public class PanelBitacora extends javax.swing.JPanel {

    /**
     * Creates new form PanelBitacora
     */
    public PanelBitacora() {
        initComponents();
        jXTable1.setColumnControlVisible(true);
        actualizarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jXTable1 = new org.jdesktop.swingx.JXTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Clientes", "Empleados", "Pel�culas", "Copias de pel�cula", "G�neros", "Ventas" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jXTable1);

        jLabel1.setText("Bit�cora de tabla:");

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione una tabla para ver el historial de acciones realizadas sobre esta.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1)))
                .addGap(11, 11, 11))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        actualizarTabla();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        actualizarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXTable jXTable1;
    // End of variables declaration//GEN-END:variables

    private void actualizarTabla(){
        if(jComboBox1.getSelectedIndex() == -1){
            return;
        }
        String opcion = (String) jComboBox1.getSelectedItem();
        MyTableModel modelo = null;
        DataBaseHelper dh = new DataBaseHelper();
        dh.crearConexion();
        switch (opcion) {
            case "Clientes":
                modelo = new ModelosDeTabla.LogClienteTableModel();
                modelo.setData(dh.getLogClienteData());
                break;
            case "Empleados":
                modelo = new ModelosDeTabla.LogEmpleadoTableModel();
                modelo.setData(dh.getLogEmpleadoData());
                break;
            case "Pel�culas":
                modelo = new ModelosDeTabla.LogPeliculaTableModel();
                modelo.setData(dh.getLogPeliculaData());
                break;
            case "Copias de pel�cula":
                modelo = new ModelosDeTabla.LogCopiaTableModel();
                modelo.setData(dh.getLogCopiaPeliculaData());
                break;
            case "G�neros":
                modelo = new ModelosDeTabla.LogGeneroTableModel();
                modelo.setData(dh.getLogGeneroData());
                break;
            case "Ventas":
                modelo = new ModelosDeTabla.LogVentaTableModel();
                modelo.setData(dh.getLogVentaData());
                break;
        }
        dh.cerrarConexion();
        jXTable1.setModel(modelo);
        jXTable1.setAutoResizeMode(JXTable.AUTO_RESIZE_ALL_COLUMNS);
    }
}