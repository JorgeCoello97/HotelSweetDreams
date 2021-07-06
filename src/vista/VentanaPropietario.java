package vista;

import javax.swing.JFrame;
import modelo.Propietario;

public class VentanaPropietario extends JFrame {

    public VentanaPropietario(Propietario propietario, JFrame VAnterior) {
        initComponents();
        this.VAnterior = VAnterior;
        this.propietario = propietario;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPropietario = new javax.swing.JPanel();
        panelPrincipalPropietario = new javax.swing.JPanel();
        panelPrincipalPropietarioOperaciones = new javax.swing.JPanel();
        panelPropietarioOperaciones = new javax.swing.JPanel();
        bttnConsultarBeneficios = new javax.swing.JButton();
        panelPropietarioOpcionCerrarSesion = new javax.swing.JPanel();
        bttnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL - PROPIETARIO/A");
        setAlwaysOnTop(true);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/propietario_64.png")).getImage());
        setResizable(false);
        setSize(new java.awt.Dimension(500, 200));

        panelPropietario.setBackground(new java.awt.Color(102, 102, 102));
        panelPropietario.setPreferredSize(new java.awt.Dimension(500, 172));

        panelPrincipalPropietario.setBackground(new java.awt.Color(102, 102, 102));
        panelPrincipalPropietario.setAlignmentX(0.0F);
        panelPrincipalPropietario.setAlignmentY(0.0F);
        panelPrincipalPropietario.setLayout(new java.awt.BorderLayout());

        panelPrincipalPropietarioOperaciones.setBackground(new java.awt.Color(153, 153, 153));
        panelPrincipalPropietarioOperaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bttnConsultarBeneficios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/beneficio_32.png"))); // NOI18N
        bttnConsultarBeneficios.setText("Consultar Beneficios");
        bttnConsultarBeneficios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnConsultarBeneficios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bttnConsultarBeneficios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bttnConsultarBeneficios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnConsultarBeneficiosActionPerformed(evt);
            }
        });
        panelPropietarioOperaciones.add(bttnConsultarBeneficios);

        javax.swing.GroupLayout panelPrincipalPropietarioOperacionesLayout = new javax.swing.GroupLayout(panelPrincipalPropietarioOperaciones);
        panelPrincipalPropietarioOperaciones.setLayout(panelPrincipalPropietarioOperacionesLayout);
        panelPrincipalPropietarioOperacionesLayout.setHorizontalGroup(
            panelPrincipalPropietarioOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalPropietarioOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPropietarioOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPrincipalPropietarioOperacionesLayout.setVerticalGroup(
            panelPrincipalPropietarioOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalPropietarioOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPropietarioOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPrincipalPropietario.add(panelPrincipalPropietarioOperaciones, java.awt.BorderLayout.CENTER);

        panelPropietarioOpcionCerrarSesion.setBackground(new java.awt.Color(153, 153, 153));
        panelPropietarioOpcionCerrarSesion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bttnCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bttnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout_32.png"))); // NOI18N
        bttnCerrarSesion.setText("Cerrar Sesión");
        bttnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCerrarSesionActionPerformed(evt);
            }
        });
        panelPropietarioOpcionCerrarSesion.add(bttnCerrarSesion);

        panelPrincipalPropietario.add(panelPropietarioOpcionCerrarSesion, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout panelPropietarioLayout = new javax.swing.GroupLayout(panelPropietario);
        panelPropietario.setLayout(panelPropietarioLayout);
        panelPropietarioLayout.setHorizontalGroup(
            panelPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPropietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipalPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPropietarioLayout.setVerticalGroup(
            panelPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPropietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipalPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnConsultarBeneficiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnConsultarBeneficiosActionPerformed
        ConsultarGanancias consultarGanancias = new ConsultarGanancias(propietario, this);
        setVisible(false);
        consultarGanancias.setLocationRelativeTo(null);
        consultarGanancias.setVisible(true);

    }//GEN-LAST:event_bttnConsultarBeneficiosActionPerformed

    private void bttnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCerrarSesionActionPerformed
        dispose();

        VAnterior.setLocationRelativeTo(null);
        VAnterior.setVisible(true);
    }//GEN-LAST:event_bttnCerrarSesionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnCerrarSesion;
    private javax.swing.JButton bttnConsultarBeneficios;
    private javax.swing.JPanel panelPrincipalPropietario;
    private javax.swing.JPanel panelPrincipalPropietarioOperaciones;
    private javax.swing.JPanel panelPropietario;
    private javax.swing.JPanel panelPropietarioOpcionCerrarSesion;
    private javax.swing.JPanel panelPropietarioOperaciones;
    // End of variables declaration//GEN-END:variables
    private JFrame VAnterior;
    private Propietario propietario;
}
