/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.silo.vista.catalogos.forms;

import java.util.Date;
import org.silo.modelos.bo.Empleado;

/**
 *
 * @author VREBO
 */
public class FormularioEmpleado extends javax.swing.JPanel implements Form<Empleado> {

    /**
     * Creates new form FormularioEmpleado
     */
    public FormularioEmpleado() {
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
        jLabel1 = new javax.swing.JLabel();
        id = new org.jdesktop.swingx.JXTextField();
        nombre = new org.jdesktop.swingx.JXTextField();
        apPaterno = new org.jdesktop.swingx.JXTextField();
        apMaterno = new org.jdesktop.swingx.JXTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        puesto = new javax.swing.JComboBox<String>();
        estado = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hEntrada = new javax.swing.JSpinner();
        hSalida = new javax.swing.JSpinner();
        sueldo = new org.jdesktop.swingx.JXTextField();
        fechaRegistro = new javax.swing.JSpinner();
        fechaNacimiento = new javax.swing.JSpinner();

        setMinimumSize(new java.awt.Dimension(420, 300));
        setPreferredSize(new java.awt.Dimension(420, 300));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(imagePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel1.setText("ID:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        id.setEditable(false);
        add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, -1));

        nombre.setPrompt("Nombre");
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, -1));

        apPaterno.setPrompt("Apellido Paterno");
        add(apPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, -1));

        apMaterno.setPrompt("Apellido Materno");
        add(apMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, -1));

        jLabel2.setText("Fecha de nacimiento:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel3.setText("Fecha de registro:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel4.setText("Puesto:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        puesto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vendedor", "Gerente" }));
        add(puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 90, -1));

        estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laborando", "Incapacitado", "Baja" }));
        add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 90, -1));

        jLabel5.setText("Condici�n laboral:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel6.setText("Hora de entrada:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        jLabel7.setText("Hora de salida");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        hEntrada.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MINUTE));
        hEntrada.setEditor(new javax.swing.JSpinner.DateEditor(hEntrada, "hh:mm a"));
        add(hEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 70, -1));

        hSalida.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MINUTE));
        hSalida.setEditor(new javax.swing.JSpinner.DateEditor(hSalida, "hh:mm a"));
        add(hSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 70, -1));
        add(sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 70, -1));

        fechaRegistro.setModel(new javax.swing.SpinnerDateModel());
        fechaRegistro.setEditor(new javax.swing.JSpinner.DateEditor(fechaRegistro, "dd/MM/yyyy"));
        fechaRegistro.setEnabled(false);
        add(fechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        fechaNacimiento.setModel(new javax.swing.SpinnerDateModel());
        fechaNacimiento.setEditor(new javax.swing.JSpinner.DateEditor(fechaNacimiento, "dd/MM/yyyy"));
        add(fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXTextField apMaterno;
    private org.jdesktop.swingx.JXTextField apPaterno;
    private javax.swing.JComboBox estado;
    private javax.swing.JSpinner fechaNacimiento;
    private javax.swing.JSpinner fechaRegistro;
    private javax.swing.JSpinner hEntrada;
    private javax.swing.JSpinner hSalida;
    private org.jdesktop.swingx.JXTextField id;
    private org.silo.vista.componentes.ImagePanel imagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private org.jdesktop.swingx.JXTextField nombre;
    private javax.swing.JComboBox<String> puesto;
    private org.jdesktop.swingx.JXTextField sueldo;
    // End of variables declaration//GEN-END:variables

    private Empleado data = new Empleado();
    
    @Override
    public Empleado getData() {
        data.setIdEmpleado(id.getText());
        data.setNombre(nombre.getText());
        data.setApellidoPaterno(apPaterno.getText());
        data.setApellidoMaterno(apMaterno.getText());
        data.setPuesto((String)puesto.getSelectedItem());
        data.setSueldo(Double.parseDouble(sueldo.getText()));
        data.setEstado((String)estado.getSelectedItem());
        data.setHoraEntrada((Date)hEntrada.getValue());
        data.setHoraSalida((Date)hSalida.getValue());
        data.setFechaNacimiento((Date)fechaNacimiento.getValue());
        data.setFechaRegistro((Date)fechaRegistro.getValue());
        data.setImagen(imagePanel1.getData());
        return data;
    }
    
    @Override
    public void setData(Empleado data) {
        this.data = data;
        updateData();
    }

    @Override
    public void updateData() {
        id.setText(data.getIdEmpleado());
        nombre.setText(data.getNombre());
        apPaterno.setText(data.getApellidoPaterno());
        apMaterno.setText(data.getApellidoMaterno());
        fechaNacimiento.setValue(data.getFechaNacimiento());
        fechaRegistro.setValue(data.getFechaRegistro());
        hEntrada.setValue(data.getHoraEntrada());
        hSalida.setValue(data.getHoraSalida());
        puesto.setSelectedItem(data.getPuesto());
        sueldo.setText(data.getSueldo() + "");
        estado.setSelectedItem(data.getEstado());
        imagePanel1.setData(data.getImagen());
    }

    @Override
    public void cleanData() {
        id.setText("E" + new Date().getTime());
        nombre.setText("");
        apPaterno.setText("");
        apMaterno.setText("");
        fechaNacimiento.setValue(new Date());
        fechaRegistro.setValue(new Date());
        hEntrada.setValue(new Date());
        hSalida.setValue(new Date());
        puesto.setSelectedIndex(0);
        sueldo.setText("");
        estado.setSelectedIndex(0);
        imagePanel1.cleanData();
    }
}