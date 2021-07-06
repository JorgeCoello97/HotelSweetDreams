/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.DetallesTarifas;
import modelo.Supervisor;

/**
 *
 * @author Pareja 3s
 */
public class ModificarTarifas extends JFrame {

    /**
     * Creates new form ModificarTarifas
     *
     * @param supervisor
     * @param detallesTarifas
     * @param VAnterior
     */
    public ModificarTarifas(Supervisor supervisor, DetallesTarifas detallesTarifas, JFrame VAnterior) {
        initComponents();

        this.supervisor = supervisor;
        this.VAnterior = VAnterior;
        this.fieldTarifasActualIndividual.setText(String.valueOf(detallesTarifas.precioSimple));
        this.fieldTarifasActualDoble.setText(String.valueOf(detallesTarifas.precioDoble));
        this.fieldTarifasActualDobleMatrimonio.setText(String.valueOf(detallesTarifas.precioMatrimonio));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTarifas = new javax.swing.JPanel();
        panelTarifasPrincipal = new javax.swing.JPanel();
        panelTarifasPrincipalContenido = new javax.swing.JPanel();
        panelTarifasContenido = new javax.swing.JPanel();
        panelTarifasContenidoTitulo = new javax.swing.JPanel();
        labelTarifasTitulo = new javax.swing.JLabel();
        panelTarifasContenidoCuerpo = new javax.swing.JPanel();
        panelTarifasContenidoCuerpoActual = new javax.swing.JPanel();
        panelTarifasContenidoActual = new javax.swing.JPanel();
        labelTarifasActualIndividual = new javax.swing.JLabel();
        fieldTarifasActualIndividual = new javax.swing.JTextField();
        labelTarifasActualDoble = new javax.swing.JLabel();
        fieldTarifasActualDoble = new javax.swing.JTextField();
        labelTarifasActualDobleMatrimonio = new javax.swing.JLabel();
        fieldTarifasActualDobleMatrimonio = new javax.swing.JTextField();
        panelTarifasContenidoCuerpoModificacion = new javax.swing.JPanel();
        panelTarifasContenidoModificacion = new javax.swing.JPanel();
        labelTarifasModificacionIndividual = new javax.swing.JLabel();
        fieldTarifasModificacionIndividual = new javax.swing.JTextField();
        labelTarifasModificacionDoble = new javax.swing.JLabel();
        fieldTarifasModificacionDoble = new javax.swing.JTextField();
        labelTarifasModificacionDobleMatrimonio = new javax.swing.JLabel();
        fieldTarifasModificacionDobleMatrimonio = new javax.swing.JTextField();
        panelTarifasOpciones = new javax.swing.JPanel();
        bttnTarifasAplicar = new javax.swing.JButton();
        bttnTarifasAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(500, 350));

        panelTarifas.setBackground(new java.awt.Color(102, 102, 102));
        panelTarifas.setPreferredSize(new java.awt.Dimension(500, 350));

        panelTarifasPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        panelTarifasPrincipal.setAlignmentX(0.0F);
        panelTarifasPrincipal.setAlignmentY(0.0F);
        panelTarifasPrincipal.setLayout(new java.awt.BorderLayout());

        panelTarifasPrincipalContenido.setBackground(new java.awt.Color(153, 153, 153));
        panelTarifasPrincipalContenido.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panelTarifasContenido.setLayout(new java.awt.BorderLayout());

        panelTarifasContenidoTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelTarifasContenidoTitulo.setPreferredSize(new java.awt.Dimension(454, 73));

        labelTarifasTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTarifasTitulo.setText("MODIFICACIÓN TARIFAS");

        javax.swing.GroupLayout panelTarifasContenidoTituloLayout = new javax.swing.GroupLayout(panelTarifasContenidoTitulo);
        panelTarifasContenidoTitulo.setLayout(panelTarifasContenidoTituloLayout);
        panelTarifasContenidoTituloLayout.setHorizontalGroup(
            panelTarifasContenidoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
            .addGroup(panelTarifasContenidoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelTarifasContenidoTituloLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(labelTarifasTitulo)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelTarifasContenidoTituloLayout.setVerticalGroup(
            panelTarifasContenidoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
            .addGroup(panelTarifasContenidoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelTarifasContenidoTituloLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(labelTarifasTitulo)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelTarifasContenido.add(panelTarifasContenidoTitulo, java.awt.BorderLayout.NORTH);

        panelTarifasContenidoCuerpo.setLayout(new java.awt.GridLayout(1, 2));

        panelTarifasContenidoActual.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACTUAL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        panelTarifasContenidoActual.setLayout(new java.awt.GridLayout(3, 2));

        labelTarifasActualIndividual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTarifasActualIndividual.setText("Individual:");
        panelTarifasContenidoActual.add(labelTarifasActualIndividual);

        fieldTarifasActualIndividual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldTarifasActualIndividual.setEnabled(false);
        panelTarifasContenidoActual.add(fieldTarifasActualIndividual);

        labelTarifasActualDoble.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTarifasActualDoble.setText("Doble:");
        panelTarifasContenidoActual.add(labelTarifasActualDoble);

        fieldTarifasActualDoble.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldTarifasActualDoble.setEnabled(false);
        panelTarifasContenidoActual.add(fieldTarifasActualDoble);

        labelTarifasActualDobleMatrimonio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTarifasActualDobleMatrimonio.setText("Doble Matrimonio:");
        panelTarifasContenidoActual.add(labelTarifasActualDobleMatrimonio);

        fieldTarifasActualDobleMatrimonio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldTarifasActualDobleMatrimonio.setEnabled(false);
        panelTarifasContenidoActual.add(fieldTarifasActualDobleMatrimonio);

        javax.swing.GroupLayout panelTarifasContenidoCuerpoActualLayout = new javax.swing.GroupLayout(panelTarifasContenidoCuerpoActual);
        panelTarifasContenidoCuerpoActual.setLayout(panelTarifasContenidoCuerpoActualLayout);
        panelTarifasContenidoCuerpoActualLayout.setHorizontalGroup(
            panelTarifasContenidoCuerpoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
            .addGroup(panelTarifasContenidoCuerpoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelTarifasContenidoCuerpoActualLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelTarifasContenidoActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelTarifasContenidoCuerpoActualLayout.setVerticalGroup(
            panelTarifasContenidoCuerpoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
            .addGroup(panelTarifasContenidoCuerpoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelTarifasContenidoCuerpoActualLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelTarifasContenidoActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        panelTarifasContenidoCuerpo.add(panelTarifasContenidoCuerpoActual);

        panelTarifasContenidoModificacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MODIFICACIÓN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        panelTarifasContenidoModificacion.setLayout(new java.awt.GridLayout(3, 2));

        labelTarifasModificacionIndividual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTarifasModificacionIndividual.setText("Individual:");
        panelTarifasContenidoModificacion.add(labelTarifasModificacionIndividual);

        fieldTarifasModificacionIndividual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelTarifasContenidoModificacion.add(fieldTarifasModificacionIndividual);

        labelTarifasModificacionDoble.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTarifasModificacionDoble.setText("Doble:");
        panelTarifasContenidoModificacion.add(labelTarifasModificacionDoble);

        fieldTarifasModificacionDoble.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelTarifasContenidoModificacion.add(fieldTarifasModificacionDoble);

        labelTarifasModificacionDobleMatrimonio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTarifasModificacionDobleMatrimonio.setText("Doble Matrimonio:");
        panelTarifasContenidoModificacion.add(labelTarifasModificacionDobleMatrimonio);

        fieldTarifasModificacionDobleMatrimonio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelTarifasContenidoModificacion.add(fieldTarifasModificacionDobleMatrimonio);

        javax.swing.GroupLayout panelTarifasContenidoCuerpoModificacionLayout = new javax.swing.GroupLayout(panelTarifasContenidoCuerpoModificacion);
        panelTarifasContenidoCuerpoModificacion.setLayout(panelTarifasContenidoCuerpoModificacionLayout);
        panelTarifasContenidoCuerpoModificacionLayout.setHorizontalGroup(
            panelTarifasContenidoCuerpoModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
            .addGroup(panelTarifasContenidoCuerpoModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelTarifasContenidoCuerpoModificacionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelTarifasContenidoModificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelTarifasContenidoCuerpoModificacionLayout.setVerticalGroup(
            panelTarifasContenidoCuerpoModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
            .addGroup(panelTarifasContenidoCuerpoModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelTarifasContenidoCuerpoModificacionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelTarifasContenidoModificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        panelTarifasContenidoCuerpo.add(panelTarifasContenidoCuerpoModificacion);

        panelTarifasContenido.add(panelTarifasContenidoCuerpo, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout panelTarifasPrincipalContenidoLayout = new javax.swing.GroupLayout(panelTarifasPrincipalContenido);
        panelTarifasPrincipalContenido.setLayout(panelTarifasPrincipalContenidoLayout);
        panelTarifasPrincipalContenidoLayout.setHorizontalGroup(
            panelTarifasPrincipalContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarifasPrincipalContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTarifasContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTarifasPrincipalContenidoLayout.setVerticalGroup(
            panelTarifasPrincipalContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarifasPrincipalContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTarifasContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelTarifasPrincipal.add(panelTarifasPrincipalContenido, java.awt.BorderLayout.CENTER);

        panelTarifasOpciones.setBackground(new java.awt.Color(153, 153, 153));
        panelTarifasOpciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bttnTarifasAplicar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bttnTarifasAplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confirmar_32.png"))); // NOI18N
        bttnTarifasAplicar.setText("Aplicar");
        bttnTarifasAplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnTarifasAplicar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bttnTarifasAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnTarifasAplicarActionPerformed(evt);
            }
        });

        bttnTarifasAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver_32.png"))); // NOI18N
        bttnTarifasAtras.setText("Atrás");
        bttnTarifasAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnTarifasAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnTarifasAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTarifasOpcionesLayout = new javax.swing.GroupLayout(panelTarifasOpciones);
        panelTarifasOpciones.setLayout(panelTarifasOpcionesLayout);
        panelTarifasOpcionesLayout.setHorizontalGroup(
            panelTarifasOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTarifasOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnTarifasAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                .addComponent(bttnTarifasAplicar)
                .addContainerGap())
        );
        panelTarifasOpcionesLayout.setVerticalGroup(
            panelTarifasOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarifasOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTarifasOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttnTarifasAplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttnTarifasAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTarifasPrincipal.add(panelTarifasOpciones, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout panelTarifasLayout = new javax.swing.GroupLayout(panelTarifas);
        panelTarifas.setLayout(panelTarifasLayout);
        panelTarifasLayout.setHorizontalGroup(
            panelTarifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarifasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTarifasPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTarifasLayout.setVerticalGroup(
            panelTarifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarifasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTarifasPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelTarifas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelTarifas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnTarifasAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnTarifasAplicarActionPerformed
        boolean errorTarifas = false;
        Pattern pattern = Pattern.compile("[1-9][0-9]+|[1-9][0-9]+.[1-9]");

        float precioSimple = 0;
        String valueSimple = fieldTarifasModificacionIndividual.getText();

        if (valueSimple.equals("")) {
            precioSimple = Float.parseFloat(fieldTarifasActualIndividual.getText());
        } else if (pattern.matcher(valueSimple).matches() == false) {
            JOptionPane.showMessageDialog(this, "Introduzca la tarifa Simple correctamente", "Informacion", JOptionPane.ERROR_MESSAGE);
            errorTarifas = true;
            fieldTarifasModificacionIndividual.setText("");
        } else {
            precioSimple = Float.parseFloat(fieldTarifasModificacionIndividual.getText());
        }

        float precioDoble = 0;
        String valueDoble = fieldTarifasModificacionDoble.getText();

        if (valueDoble.equals("")) {
            precioDoble = Float.parseFloat(fieldTarifasActualDoble.getText());
        } else if (pattern.matcher(valueDoble).matches() == false) {
            JOptionPane.showMessageDialog(this, "Introduzca la tarifa Doble correctamente", "Informacion", JOptionPane.ERROR_MESSAGE);
            errorTarifas = true;
            fieldTarifasModificacionDoble.setText("");
        } else {
            precioDoble = Float.parseFloat(fieldTarifasModificacionDoble.getText());
        }

        String valueMatrimonio = fieldTarifasModificacionDobleMatrimonio.getText();
        float precioMatrimonio = 0;

        if (valueMatrimonio.equals("")) {
            precioMatrimonio = Float.parseFloat(fieldTarifasActualDobleMatrimonio.getText());
        } else if (pattern.matcher(valueMatrimonio).matches() == false) {
            JOptionPane.showMessageDialog(this, "Introduzca la tarifa Matrimonio correctamente", "Informacion", JOptionPane.ERROR_MESSAGE);
            errorTarifas = true;
            fieldTarifasModificacionDobleMatrimonio.setText("");
        } else {
            precioMatrimonio = Float.parseFloat(fieldTarifasModificacionDobleMatrimonio.getText());
        }

        if (!errorTarifas) {
            DetallesTarifas precios = new DetallesTarifas(precioSimple, precioDoble, precioMatrimonio);

            supervisor.modificarTarifas(precios);

            dispose();
            VAnterior.setVisible(true);
            JOptionPane.showMessageDialog(this, "Se ha modificado las tarifas.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bttnTarifasAplicarActionPerformed

    private void bttnTarifasAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnTarifasAtrasActionPerformed
        dispose();
        VAnterior.setVisible(true);
    }//GEN-LAST:event_bttnTarifasAtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnTarifasAplicar;
    private javax.swing.JButton bttnTarifasAtras;
    private javax.swing.JTextField fieldTarifasActualDoble;
    private javax.swing.JTextField fieldTarifasActualDobleMatrimonio;
    private javax.swing.JTextField fieldTarifasActualIndividual;
    private javax.swing.JTextField fieldTarifasModificacionDoble;
    private javax.swing.JTextField fieldTarifasModificacionDobleMatrimonio;
    private javax.swing.JTextField fieldTarifasModificacionIndividual;
    private javax.swing.JLabel labelTarifasActualDoble;
    private javax.swing.JLabel labelTarifasActualDobleMatrimonio;
    private javax.swing.JLabel labelTarifasActualIndividual;
    private javax.swing.JLabel labelTarifasModificacionDoble;
    private javax.swing.JLabel labelTarifasModificacionDobleMatrimonio;
    private javax.swing.JLabel labelTarifasModificacionIndividual;
    private javax.swing.JLabel labelTarifasTitulo;
    private javax.swing.JPanel panelTarifas;
    private javax.swing.JPanel panelTarifasContenido;
    private javax.swing.JPanel panelTarifasContenidoActual;
    private javax.swing.JPanel panelTarifasContenidoCuerpo;
    private javax.swing.JPanel panelTarifasContenidoCuerpoActual;
    private javax.swing.JPanel panelTarifasContenidoCuerpoModificacion;
    private javax.swing.JPanel panelTarifasContenidoModificacion;
    private javax.swing.JPanel panelTarifasContenidoTitulo;
    private javax.swing.JPanel panelTarifasOpciones;
    private javax.swing.JPanel panelTarifasPrincipal;
    private javax.swing.JPanel panelTarifasPrincipalContenido;
    // End of variables declaration//GEN-END:variables
private Supervisor supervisor;
    private JFrame VAnterior;
}