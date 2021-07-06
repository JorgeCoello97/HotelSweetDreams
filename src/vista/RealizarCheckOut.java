/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DetallesCobro;
import modelo.Recepcionista;

/**
 *
 * @author Pareja 2
 */
public class RealizarCheckOut extends JFrame {

    /**
     * Creates new form RealizarCheckOut
     *
     * @param recepcionista
     * @param VAnterior
     */
    public RealizarCheckOut(Recepcionista recepcionista, JFrame VAnterior) {
        initComponents();

        this.recepcionista = recepcionista;
        this.VAnterior = VAnterior;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCheckOut = new javax.swing.JPanel();
        panelCheckOutPrincipal = new javax.swing.JPanel();
        panelCheckOutPrincipalListado = new javax.swing.JPanel();
        panelCheckOutListado = new javax.swing.JPanel();
        panelCheckOutBuscarCliente = new javax.swing.JPanel();
        panelCheckOutPrincipalBuscarCliente = new javax.swing.JPanel();
        panelCheckOutClienteDNI = new javax.swing.JPanel();
        fieldCheckOutDNICliente = new javax.swing.JTextField();
        panelCheckOutBttnBuscar = new javax.swing.JPanel();
        bttnCheckOutBuscar = new javax.swing.JButton();
        scrollPaneCheckOutReservasOcupadas = new javax.swing.JScrollPane();
        tableCheckOutReservasOcupadas = new javax.swing.JTable();
        panelCheckOutOpciones = new javax.swing.JPanel();
        bttnCheckOutRealizarCheckOut = new javax.swing.JButton();
        bttnCheckOutAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 350));
        setSize(new java.awt.Dimension(500, 350));

        panelCheckOut.setBackground(new java.awt.Color(102, 102, 102));
        panelCheckOut.setPreferredSize(new java.awt.Dimension(500, 350));

        panelCheckOutPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        panelCheckOutPrincipal.setAlignmentX(0.0F);
        panelCheckOutPrincipal.setAlignmentY(0.0F);
        panelCheckOutPrincipal.setLayout(new java.awt.BorderLayout());

        panelCheckOutPrincipalListado.setBackground(new java.awt.Color(153, 153, 153));
        panelCheckOutPrincipalListado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panelCheckOutListado.setLayout(new java.awt.BorderLayout());

        panelCheckOutBuscarCliente.setBackground(new java.awt.Color(153, 153, 153));
        panelCheckOutBuscarCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelCheckOutBuscarCliente.setPreferredSize(new java.awt.Dimension(454, 73));

        panelCheckOutPrincipalBuscarCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelCheckOutPrincipalBuscarCliente.setPreferredSize(new java.awt.Dimension(454, 73));
        panelCheckOutPrincipalBuscarCliente.setLayout(new java.awt.BorderLayout());

        panelCheckOutClienteDNI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        panelCheckOutClienteDNI.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        panelCheckOutClienteDNI.setLayout(new java.awt.BorderLayout());

        fieldCheckOutDNICliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fieldCheckOutDNICliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCheckOutClienteDNI.add(fieldCheckOutDNICliente, java.awt.BorderLayout.CENTER);

        panelCheckOutPrincipalBuscarCliente.add(panelCheckOutClienteDNI, java.awt.BorderLayout.CENTER);

        bttnCheckOutBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bttnCheckOutBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar_32.png"))); // NOI18N
        bttnCheckOutBuscar.setText("BUSCAR");
        bttnCheckOutBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnCheckOutBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCheckOutBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCheckOutBttnBuscarLayout = new javax.swing.GroupLayout(panelCheckOutBttnBuscar);
        panelCheckOutBttnBuscar.setLayout(panelCheckOutBttnBuscarLayout);
        panelCheckOutBttnBuscarLayout.setHorizontalGroup(
            panelCheckOutBttnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
            .addGroup(panelCheckOutBttnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCheckOutBttnBuscarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bttnCheckOutBuscar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelCheckOutBttnBuscarLayout.setVerticalGroup(
            panelCheckOutBttnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
            .addGroup(panelCheckOutBttnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCheckOutBttnBuscarLayout.createSequentialGroup()
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addComponent(bttnCheckOutBuscar)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );

        panelCheckOutPrincipalBuscarCliente.add(panelCheckOutBttnBuscar, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout panelCheckOutBuscarClienteLayout = new javax.swing.GroupLayout(panelCheckOutBuscarCliente);
        panelCheckOutBuscarCliente.setLayout(panelCheckOutBuscarClienteLayout);
        panelCheckOutBuscarClienteLayout.setHorizontalGroup(
            panelCheckOutBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCheckOutPrincipalBuscarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );
        panelCheckOutBuscarClienteLayout.setVerticalGroup(
            panelCheckOutBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCheckOutPrincipalBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        panelCheckOutListado.add(panelCheckOutBuscarCliente, java.awt.BorderLayout.NORTH);

        tableCheckOutReservasOcupadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Habitacion", "DNI", "Nombre", "Dias", "Importe", "Estado", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCheckOutReservasOcupadas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableCheckOutReservasOcupadas.getTableHeader().setReorderingAllowed(false);
        scrollPaneCheckOutReservasOcupadas.setViewportView(tableCheckOutReservasOcupadas);
        if (tableCheckOutReservasOcupadas.getColumnModel().getColumnCount() > 0) {
            tableCheckOutReservasOcupadas.getColumnModel().getColumn(0).setResizable(false);
            tableCheckOutReservasOcupadas.getColumnModel().getColumn(1).setResizable(false);
            tableCheckOutReservasOcupadas.getColumnModel().getColumn(2).setResizable(false);
            tableCheckOutReservasOcupadas.getColumnModel().getColumn(3).setResizable(false);
            tableCheckOutReservasOcupadas.getColumnModel().getColumn(4).setResizable(false);
            tableCheckOutReservasOcupadas.getColumnModel().getColumn(5).setResizable(false);
            tableCheckOutReservasOcupadas.getColumnModel().getColumn(6).setResizable(false);
            tableCheckOutReservasOcupadas.getColumnModel().getColumn(6).setPreferredWidth(0);
        }

        panelCheckOutListado.add(scrollPaneCheckOutReservasOcupadas, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout panelCheckOutPrincipalListadoLayout = new javax.swing.GroupLayout(panelCheckOutPrincipalListado);
        panelCheckOutPrincipalListado.setLayout(panelCheckOutPrincipalListadoLayout);
        panelCheckOutPrincipalListadoLayout.setHorizontalGroup(
            panelCheckOutPrincipalListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCheckOutPrincipalListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCheckOutListado, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCheckOutPrincipalListadoLayout.setVerticalGroup(
            panelCheckOutPrincipalListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCheckOutPrincipalListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCheckOutListado, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelCheckOutPrincipal.add(panelCheckOutPrincipalListado, java.awt.BorderLayout.CENTER);

        panelCheckOutOpciones.setBackground(new java.awt.Color(153, 153, 153));
        panelCheckOutOpciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bttnCheckOutRealizarCheckOut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bttnCheckOutRealizarCheckOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checkout_32.png"))); // NOI18N
        bttnCheckOutRealizarCheckOut.setText("Realizar CheckOut");
        bttnCheckOutRealizarCheckOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnCheckOutRealizarCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCheckOutRealizarCheckOutActionPerformed(evt);
            }
        });

        bttnCheckOutAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver_32.png"))); // NOI18N
        bttnCheckOutAtras.setText("Atrás");
        bttnCheckOutAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnCheckOutAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCheckOutAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCheckOutOpcionesLayout = new javax.swing.GroupLayout(panelCheckOutOpciones);
        panelCheckOutOpciones.setLayout(panelCheckOutOpcionesLayout);
        panelCheckOutOpcionesLayout.setHorizontalGroup(
            panelCheckOutOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCheckOutOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnCheckOutAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(bttnCheckOutRealizarCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCheckOutOpcionesLayout.setVerticalGroup(
            panelCheckOutOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCheckOutOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCheckOutOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttnCheckOutRealizarCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttnCheckOutAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCheckOutPrincipal.add(panelCheckOutOpciones, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout panelCheckOutLayout = new javax.swing.GroupLayout(panelCheckOut);
        panelCheckOut.setLayout(panelCheckOutLayout);
        panelCheckOutLayout.setHorizontalGroup(
            panelCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCheckOutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCheckOutPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCheckOutLayout.setVerticalGroup(
            panelCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCheckOutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCheckOutPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnCheckOutBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCheckOutBuscarActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) tableCheckOutReservasOcupadas.getModel();
        tableModel.setRowCount(0);
        tableCheckOutReservasOcupadas.setModel(tableModel);
        
        String dni_cliente = fieldCheckOutDNICliente.getText();
        if (dni_cliente.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduzca un DNI del cliente", "Informacion", JOptionPane.ERROR_MESSAGE);
        } else {
            ArrayList reservasOcupadasUsuario = recepcionista.consultarReservasOcupadas(dni_cliente);
            if (reservasOcupadasUsuario.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se ha encontrado ninguna reserva ocupada con dicho DNI del cliente", "Informacion", JOptionPane.ERROR_MESSAGE);
            } else {
                for (Object reservaOcupada : reservasOcupadasUsuario) {

                    String cadena = reservaOcupada.toString();

                    String[] tokenizer = cadena.split(":");

                    tableModel.addRow(new Object[]{
                        tokenizer[0],
                        tokenizer[1],
                        tokenizer[2],
                        tokenizer[3],
                        tokenizer[4],
                        tokenizer[5],
                        reservaOcupada
                    });
                }
            }
        }
    }//GEN-LAST:event_bttnCheckOutBuscarActionPerformed

    private void bttnCheckOutRealizarCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCheckOutRealizarCheckOutActionPerformed
        int filas = tableCheckOutReservasOcupadas.getModel().getRowCount();
        if (filas == 0) {
            JOptionPane.showMessageDialog(this, "Primero busque el DNI del cliente", "Informacion", JOptionPane.ERROR_MESSAGE);
        } else {
            int seleccionadas = tableCheckOutReservasOcupadas.getSelectedRowCount();
            if (seleccionadas == 0) {
                JOptionPane.showMessageDialog(this, "Seleccione una reserva ocupada del listado", "Informacion", JOptionPane.ERROR_MESSAGE);
            } else {
                int indice_fila = tableCheckOutReservasOcupadas.getSelectedRow();

                Object reservaOcupadaSeleccionada = tableCheckOutReservasOcupadas.getValueAt(indice_fila, 6);

                DetallesCobro detalles = recepcionista.realizarCheckOut(reservaOcupadaSeleccionada);

                JOptionPane.showMessageDialog(this, "CheckOut realizado con éxito\nTarjeta Bancaria: " + detalles.tarjetaBancaria + "\nImporte a cobrar: " + detalles.importeCobro + " €", "Informacion", JOptionPane.INFORMATION_MESSAGE);

                dispose();
                VAnterior.setVisible(true);
            }
        }
    }//GEN-LAST:event_bttnCheckOutRealizarCheckOutActionPerformed

    private void bttnCheckOutAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCheckOutAtrasActionPerformed
        dispose();
        VAnterior.setVisible(true);
    }//GEN-LAST:event_bttnCheckOutAtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnCheckOutAtras;
    private javax.swing.JButton bttnCheckOutBuscar;
    private javax.swing.JButton bttnCheckOutRealizarCheckOut;
    private javax.swing.JTextField fieldCheckOutDNICliente;
    private javax.swing.JPanel panelCheckOut;
    private javax.swing.JPanel panelCheckOutBttnBuscar;
    private javax.swing.JPanel panelCheckOutBuscarCliente;
    private javax.swing.JPanel panelCheckOutClienteDNI;
    private javax.swing.JPanel panelCheckOutListado;
    private javax.swing.JPanel panelCheckOutOpciones;
    private javax.swing.JPanel panelCheckOutPrincipal;
    private javax.swing.JPanel panelCheckOutPrincipalBuscarCliente;
    private javax.swing.JPanel panelCheckOutPrincipalListado;
    private javax.swing.JScrollPane scrollPaneCheckOutReservasOcupadas;
    private static javax.swing.JTable tableCheckOutReservasOcupadas;
    // End of variables declaration//GEN-END:variables
private Recepcionista recepcionista;
    private JFrame VAnterior;
}
