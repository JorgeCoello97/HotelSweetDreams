package vista;

import javax.swing.JFrame;
import modelo.GestorHotel;
import modelo.Recepcionista;

public class VentanaRecepcionista extends JFrame {

    public VentanaRecepcionista(Recepcionista recepcionista, GestorHotel gestorHotel, JFrame VAnterior) {
        initComponents();
        this.VAnterior = VAnterior;
        this.recepcionista = recepcionista;
        this.gestorHotel = gestorHotel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRecepcionista = new javax.swing.JPanel();
        panelPrincipalRecepcionista = new javax.swing.JPanel();
        panelPrincipalRecepcionistaOperaciones = new javax.swing.JPanel();
        panelRecepcionistaOperaciones = new javax.swing.JPanel();
        bttnVentanaRecepcionistaConsultarListadoHabitaciones = new javax.swing.JButton();
        bttnVentanaRecepcionistaCancelarReserva = new javax.swing.JButton();
        bttnVentanaRecepcionistaRealizarCheckIn = new javax.swing.JButton();
        bttnVentanaRecepcionistaRealizarCheckOut = new javax.swing.JButton();
        panelRecepcionistaOpcionCerrarSesion = new javax.swing.JPanel();
        bttnVentanaRecepcionistaCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL - RECEPCIONISTAS");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/recepcionista_64.png")).getImage());
        setResizable(false);
        setSize(new java.awt.Dimension(500, 250));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelRecepcionista.setBackground(new java.awt.Color(102, 102, 102));
        panelRecepcionista.setPreferredSize(new java.awt.Dimension(500, 250));

        panelPrincipalRecepcionista.setBackground(new java.awt.Color(102, 102, 102));
        panelPrincipalRecepcionista.setAlignmentX(0.0F);
        panelPrincipalRecepcionista.setAlignmentY(0.0F);
        panelPrincipalRecepcionista.setLayout(new java.awt.BorderLayout());

        panelPrincipalRecepcionistaOperaciones.setBackground(new java.awt.Color(153, 153, 153));
        panelPrincipalRecepcionistaOperaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panelRecepcionistaOperaciones.setLayout(new java.awt.GridLayout(2, 2, 1, 1));

        bttnVentanaRecepcionistaConsultarListadoHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listado_habitaciones_32.png"))); // NOI18N
        bttnVentanaRecepcionistaConsultarListadoHabitaciones.setText("Consultar Listado Habitaciones");
        bttnVentanaRecepcionistaConsultarListadoHabitaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnVentanaRecepcionistaConsultarListadoHabitaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bttnVentanaRecepcionistaConsultarListadoHabitaciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bttnVentanaRecepcionistaConsultarListadoHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnVentanaRecepcionistaConsultarListadoHabitacionesActionPerformed(evt);
            }
        });
        panelRecepcionistaOperaciones.add(bttnVentanaRecepcionistaConsultarListadoHabitaciones);

        bttnVentanaRecepcionistaCancelarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar_reserva_32.png"))); // NOI18N
        bttnVentanaRecepcionistaCancelarReserva.setText("Cancelar Reserva");
        bttnVentanaRecepcionistaCancelarReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnVentanaRecepcionistaCancelarReserva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bttnVentanaRecepcionistaCancelarReserva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bttnVentanaRecepcionistaCancelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnVentanaRecepcionistaCancelarReservaActionPerformed(evt);
            }
        });
        panelRecepcionistaOperaciones.add(bttnVentanaRecepcionistaCancelarReserva);

        bttnVentanaRecepcionistaRealizarCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checkin_32.png"))); // NOI18N
        bttnVentanaRecepcionistaRealizarCheckIn.setText("Realizar CheckIn");
        bttnVentanaRecepcionistaRealizarCheckIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnVentanaRecepcionistaRealizarCheckIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bttnVentanaRecepcionistaRealizarCheckIn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bttnVentanaRecepcionistaRealizarCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnVentanaRecepcionistaRealizarCheckInActionPerformed(evt);
            }
        });
        panelRecepcionistaOperaciones.add(bttnVentanaRecepcionistaRealizarCheckIn);

        bttnVentanaRecepcionistaRealizarCheckOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checkout_32.png"))); // NOI18N
        bttnVentanaRecepcionistaRealizarCheckOut.setText("Realizar CheckOut");
        bttnVentanaRecepcionistaRealizarCheckOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnVentanaRecepcionistaRealizarCheckOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bttnVentanaRecepcionistaRealizarCheckOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bttnVentanaRecepcionistaRealizarCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnVentanaRecepcionistaRealizarCheckOutActionPerformed(evt);
            }
        });
        panelRecepcionistaOperaciones.add(bttnVentanaRecepcionistaRealizarCheckOut);

        javax.swing.GroupLayout panelPrincipalRecepcionistaOperacionesLayout = new javax.swing.GroupLayout(panelPrincipalRecepcionistaOperaciones);
        panelPrincipalRecepcionistaOperaciones.setLayout(panelPrincipalRecepcionistaOperacionesLayout);
        panelPrincipalRecepcionistaOperacionesLayout.setHorizontalGroup(
            panelPrincipalRecepcionistaOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalRecepcionistaOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRecepcionistaOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPrincipalRecepcionistaOperacionesLayout.setVerticalGroup(
            panelPrincipalRecepcionistaOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalRecepcionistaOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRecepcionistaOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPrincipalRecepcionista.add(panelPrincipalRecepcionistaOperaciones, java.awt.BorderLayout.PAGE_START);

        panelRecepcionistaOpcionCerrarSesion.setBackground(new java.awt.Color(153, 153, 153));
        panelRecepcionistaOpcionCerrarSesion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bttnVentanaRecepcionistaCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bttnVentanaRecepcionistaCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout_32.png"))); // NOI18N
        bttnVentanaRecepcionistaCerrarSesion.setText("Cerrar Sesión");
        bttnVentanaRecepcionistaCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnVentanaRecepcionistaCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnVentanaRecepcionistaCerrarSesionActionPerformed(evt);
            }
        });
        panelRecepcionistaOpcionCerrarSesion.add(bttnVentanaRecepcionistaCerrarSesion);

        panelPrincipalRecepcionista.add(panelRecepcionistaOpcionCerrarSesion, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout panelRecepcionistaLayout = new javax.swing.GroupLayout(panelRecepcionista);
        panelRecepcionista.setLayout(panelRecepcionistaLayout);
        panelRecepcionistaLayout.setHorizontalGroup(
            panelRecepcionistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRecepcionistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipalRecepcionista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRecepcionistaLayout.setVerticalGroup(
            panelRecepcionistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecepcionistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipalRecepcionista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRecepcionista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRecepcionista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnVentanaRecepcionistaConsultarListadoHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnVentanaRecepcionistaConsultarListadoHabitacionesActionPerformed
        ConsultarHabitacionesDisponibles consultarHabitacionesDisponibles = new ConsultarHabitacionesDisponibles(recepcionista, this);
        setVisible(false);
        consultarHabitacionesDisponibles.setLocationRelativeTo(null);
        consultarHabitacionesDisponibles.setVisible(true);
    }//GEN-LAST:event_bttnVentanaRecepcionistaConsultarListadoHabitacionesActionPerformed

    private void bttnVentanaRecepcionistaCancelarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnVentanaRecepcionistaCancelarReservaActionPerformed
        CancelarReserva cancelarReserva = new CancelarReserva(recepcionista, this);

        setVisible(false);
        cancelarReserva.setLocationRelativeTo(null);
        cancelarReserva.setVisible(true);
    }//GEN-LAST:event_bttnVentanaRecepcionistaCancelarReservaActionPerformed

    private void bttnVentanaRecepcionistaRealizarCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnVentanaRecepcionistaRealizarCheckInActionPerformed
        RealizarCheckIn realizarCheckIn = new RealizarCheckIn(recepcionista, this);

        setVisible(false);
        realizarCheckIn.setLocationRelativeTo(null);
        realizarCheckIn.setVisible(true);
    }//GEN-LAST:event_bttnVentanaRecepcionistaRealizarCheckInActionPerformed

    private void bttnVentanaRecepcionistaRealizarCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnVentanaRecepcionistaRealizarCheckOutActionPerformed
        RealizarCheckOut realizarCheckOut = new RealizarCheckOut(recepcionista, this);

        setVisible(false);
        realizarCheckOut.setLocationRelativeTo(null);
        realizarCheckOut.setVisible(true);
    }//GEN-LAST:event_bttnVentanaRecepcionistaRealizarCheckOutActionPerformed

    private void bttnVentanaRecepcionistaCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnVentanaRecepcionistaCerrarSesionActionPerformed
        dispose();

        VAnterior.setLocationRelativeTo(null);
        VAnterior.setVisible(true);
    }//GEN-LAST:event_bttnVentanaRecepcionistaCerrarSesionActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        gestorHotel.salir();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnVentanaRecepcionistaCancelarReserva;
    private javax.swing.JButton bttnVentanaRecepcionistaCerrarSesion;
    private javax.swing.JButton bttnVentanaRecepcionistaConsultarListadoHabitaciones;
    private javax.swing.JButton bttnVentanaRecepcionistaRealizarCheckIn;
    private javax.swing.JButton bttnVentanaRecepcionistaRealizarCheckOut;
    private javax.swing.JPanel panelPrincipalRecepcionista;
    private javax.swing.JPanel panelPrincipalRecepcionistaOperaciones;
    private javax.swing.JPanel panelRecepcionista;
    private javax.swing.JPanel panelRecepcionistaOpcionCerrarSesion;
    private javax.swing.JPanel panelRecepcionistaOperaciones;
    // End of variables declaration//GEN-END:variables
    private JFrame VAnterior;
    private Recepcionista recepcionista;
    private GestorHotel gestorHotel;
}