/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.silo.vista.procesos;

import javax.swing.ImageIcon;
import org.silo.modelos.bo.Cliente;
import org.silo.modelos.bo.CopiaPelicula;
import org.silo.modelos.bo.Empleado;
import org.silo.modelos.bo.Venta;
import org.silo.modelos.servicios.ServiciosSILO;
import org.silo.vista.componentes.CopiaListModel;
import org.silo.vista.componentes.DetalleVentaTableModel;
import org.silo.vista.componentes.FilteredListModel;
import org.silo.vista.componentes.MyTableModel;

/**
 *
 * @author VREBO
 */
public class PanelVenta extends javax.swing.JPanel {

    private Venta venta;
    private CopiaPelicula copiaActual;
    private FilteredListModel filteredListModel;
    private MyTableModel modeloDetalleVenta;
    private CopiaListModel peliculasDisponibles;
    private boolean ventaValida = false, clienteValido = false;

    /**
     * Creates new form PanelVenta
     */
    public PanelVenta() {
        initComponents();
        venta = new Venta();
        System.out.println("Panel de venta creandose");
        _initComponents();
        updateDatosCopia();
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
        jXImageView1 = new org.jdesktop.swingx.JXImageView();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        searchField = new org.jdesktop.swingx.JXSearchField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        idCopia = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        folio = new org.jdesktop.swingx.JXTextField();
        cliente = new org.jdesktop.swingx.JXTextField();
        empleado = new org.jdesktop.swingx.JXTextField();
        jLabel4 = new javax.swing.JLabel();
        fechaRegistro = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new org.jdesktop.swingx.JXTable();
        btnEliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cambio = new javax.swing.JTextField();
        montoPago = new javax.swing.JTextField();
        recibido = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        idCliente = new org.jdesktop.swingx.JXTextField();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(405);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("B�squeda de copias"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jXImageView1Layout = new javax.swing.GroupLayout(jXImageView1);
        jXImageView1.setLayout(jXImageView1Layout);
        jXImageView1Layout.setHorizontalGroup(
            jXImageView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jXImageView1Layout.setVerticalGroup(
            jXImageView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel1.add(jXImageView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 140, 130));

        jLabel11.setText("C�digo:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, -1));

        jLabel12.setText("T�tulo:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, -1));

        jLabel13.setText("Precio:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 50, -1));

        searchField.setPrompt("Buscar");
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        jPanel1.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 160, -1));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnAgregar.setText("<");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        lista.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lista);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 230, 90));

        idCopia.setText("XXX");
        idCopia.setToolTipText("");
        jPanel1.add(idCopia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        titulo.setText("Lorem Ipsum");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        precio.setText("0.0");
        precio.setToolTipText("");
        jPanel1.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jSplitPane1.setRightComponent(jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Folio:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 41, -1));

        jLabel2.setText("Cliente:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 41, -1));

        jLabel3.setText("Atiende:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        folio.setText("Generado");
        jPanel2.add(folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 100, -1));

        cliente.setPrompt("Nombre ");
        jPanel2.add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 170, -1));

        empleado.setText("E1420254554140 Sheldon Cooper QQ");
        jPanel2.add(empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 310, -1));

        jLabel4.setText("Fecha:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        fechaRegistro.setText("dd/MM/yyyy");
        jPanel2.add(fechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel6.setText("Detalle venta");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jScrollPane1.setViewportView(tabla);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 340, 120));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jButton2.setText("Realizar venta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabel8.setText("Monto a pagar:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jLabel9.setText("Recibido:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 70, -1));

        jLabel10.setText("Cambio:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 70, -1));
        jPanel2.add(cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 80, -1));
        jPanel2.add(montoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 80, -1));

        recibido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recibidoActionPerformed(evt);
            }
        });
        jPanel2.add(recibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 80, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 350, 10));

        idCliente.setPrompt("ID");
        idCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idClienteActionPerformed(evt);
            }
        });
        jPanel2.add(idCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 130, -1));

        jSplitPane1.setLeftComponent(jPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (ventaValida && clienteValido) {
            venta.setFechaVenta(new java.util.Date());
            ServiciosSILO.getServicios().altaVenta(venta);
//            System.out.println("Venta");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        filteredListModel.setFilter((Object element)
                -> element.toString().toLowerCase()
                .contains(searchField.getText().toLowerCase()));
    }//GEN-LAST:event_searchFieldActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (peliculasDisponibles.getSize() != 0) {
            peliculasDisponibles.remove(copiaActual);
            venta.getDetalleVenta().add(copiaActual);
            modeloDetalleVenta.setData(venta.getDetalleVenta());
            venta.calculaNetoVenta();
            montoPago.setText(Double.toString(venta.getNetoVenta()));
            repaint();
            copiaActual = null;
            updateDatosCopia();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        Object o = lista.getSelectedValue();
        if (o instanceof CopiaPelicula) {
            copiaActual = (CopiaPelicula) o;
            updateDatosCopia();
        }
    }//GEN-LAST:event_listaMouseClicked

    private void recibidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recibidoActionPerformed
        // TODO add your handling code here:
        double rCambio = venta.getNetoVenta();
        double pago = Double.parseDouble(recibido.getText());
        rCambio = pago - rCambio;
        if (ventaValida = rCambio >= 0) {
            cambio.setText(rCambio + "");
        }
    }//GEN-LAST:event_recibidoActionPerformed

    private void idClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idClienteActionPerformed
        // TODO add your handling code here:
        String id = idCliente.getText();
        if (!id.isEmpty()) {
            Cliente c = ServiciosSILO.getServicios().buscaClientePorID(id);
            cliente.setText(c.getNombreCompleto());
            venta.setCliente(c);
            Empleado e = new Empleado();
            e.setIdEmpleado("E1420254554140");
            venta.setEmpleado(e);
            clienteValido = true;
        }
    }//GEN-LAST:event_idClienteActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int row = tabla.getSelectedRow();
        CopiaPelicula copia = venta.getDetalleVenta().get(row);
        modeloDetalleVenta.remove(row);
        venta.calculaNetoVenta();
        peliculasDisponibles.addElement(copia);
        montoPago.setText(Double.toString(venta.getNetoVenta()));
        repaint();
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField cambio;
    private org.jdesktop.swingx.JXTextField cliente;
    private org.jdesktop.swingx.JXTextField empleado;
    private javax.swing.JLabel fechaRegistro;
    private org.jdesktop.swingx.JXTextField folio;
    private org.jdesktop.swingx.JXTextField idCliente;
    private javax.swing.JLabel idCopia;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private org.jdesktop.swingx.JXImageView jXImageView1;
    private javax.swing.JList lista;
    private javax.swing.JTextField montoPago;
    private javax.swing.JLabel precio;
    private javax.swing.JTextField recibido;
    private org.jdesktop.swingx.JXSearchField searchField;
    private org.jdesktop.swingx.JXTable tabla;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void _initComponents() {
        //FIX
        fechaRegistro.setText(new java.util.Date().toString());
        initListaCopias();
        (modeloDetalleVenta = new DetalleVentaTableModel()).setData(venta.getDetalleVenta());
        tabla.setModel(modeloDetalleVenta);
    }

    private void updateDatosCopia() {
        if (copiaActual != null) {
            idCopia.setText(Long.toString(copiaActual.getIdCopiaPelicula()));
            titulo.setText(copiaActual.getPelicula().getTitulo());
            precio.setText("$" + copiaActual.getPrecio());
            jXImageView1.setImage(copiaActual.getPelicula().getImagen().getImagen().getImage());
        } else {
            idCopia.setText("XXXX");
            titulo.setText("Lorem ipsum");
            precio.setText("$ 0.0");
            jXImageView1.setImage(new ImageIcon("resources/images/Silo3-ico2.png").getImage());
        }
    }

    private void initListaCopias() {
        (peliculasDisponibles = new CopiaListModel()).
                setData(ServiciosSILO.getServicios().copiasDisponibles());
        filteredListModel = new FilteredListModel(peliculasDisponibles);
        lista.setModel(filteredListModel);
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

}
