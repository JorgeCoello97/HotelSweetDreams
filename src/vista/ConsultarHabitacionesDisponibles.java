/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datechooser.model.exeptions.IncompatibleDataExeption;
import datechooser.model.multiple.PeriodSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Recepcionista;

/**
 *
 * @author Pareja 1
 */
public class ConsultarHabitacionesDisponibles extends JFrame {

    /**
     * Creates new form ConsultarHabitacionesDisponibles
     *
     * @param recepcionista
     * @param VAnterior
     */
    public ConsultarHabitacionesDisponibles(Recepcionista recepcionista, JFrame VAnterior) {
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

        panelConsultarHabitaciones = new javax.swing.JPanel();
        panelConsultarHabitacionesPrincipal = new javax.swing.JPanel();
        panelConsultarHabitacionesPrincipalListado = new javax.swing.JPanel();
        panelConsultarHabitacionesListado = new javax.swing.JPanel();
        panelConsultarHabitacionesBuscarHabitacion = new javax.swing.JPanel();
        panelConsultarHabitacionesPrincipalBuscarHabitacion = new javax.swing.JPanel();
        panelConsultarHabitacionesBusquedaFiltrado = new javax.swing.JPanel();
        panelConsultarHabitacionesPrincipalBusquedaFiltrado = new javax.swing.JPanel();
        labelConsultarHabitacionesFechaEntrada = new javax.swing.JLabel();
        dateChooserFechaEntrada = new datechooser.beans.DateChooserCombo();
        labelConsultarHabitacionesNumDias = new javax.swing.JLabel();
        fieldConsultarHabitacionesNumeroHabitaciones = new javax.swing.JTextField();
        labelConsultarHabitacionesFiltrado = new javax.swing.JLabel();
        comboBoxConsultarHabitacionesTipos = new javax.swing.JComboBox<>();
        panelConsultarHabitacionesBttnBuscar = new javax.swing.JPanel();
        bttnConsultarHabitacionesBuscar = new javax.swing.JButton();
        scrollPaneConsultarHabitaciones = new javax.swing.JScrollPane();
        tableConsultarHabitaciones = new javax.swing.JTable();
        panelConsultarHabitacionesOpciones = new javax.swing.JPanel();
        bttnConsultarHabitacionesReservar = new javax.swing.JButton();
        bttnConsultarHabitacionesAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(500, 450));

        panelConsultarHabitaciones.setBackground(new java.awt.Color(102, 102, 102));
        panelConsultarHabitaciones.setPreferredSize(new java.awt.Dimension(500, 450));

        panelConsultarHabitacionesPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        panelConsultarHabitacionesPrincipal.setAlignmentX(0.0F);
        panelConsultarHabitacionesPrincipal.setAlignmentY(0.0F);
        panelConsultarHabitacionesPrincipal.setPreferredSize(new java.awt.Dimension(480, 428));
        panelConsultarHabitacionesPrincipal.setLayout(new java.awt.BorderLayout());

        panelConsultarHabitacionesPrincipalListado.setBackground(new java.awt.Color(153, 153, 153));
        panelConsultarHabitacionesPrincipalListado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panelConsultarHabitacionesListado.setLayout(new java.awt.GridLayout(2, 1));

        panelConsultarHabitacionesBuscarHabitacion.setBackground(new java.awt.Color(153, 153, 153));
        panelConsultarHabitacionesBuscarHabitacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelConsultarHabitacionesBuscarHabitacion.setPreferredSize(new java.awt.Dimension(454, 73));

        panelConsultarHabitacionesPrincipalBuscarHabitacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelConsultarHabitacionesPrincipalBuscarHabitacion.setPreferredSize(new java.awt.Dimension(454, 73));
        panelConsultarHabitacionesPrincipalBuscarHabitacion.setLayout(new java.awt.BorderLayout());

        panelConsultarHabitacionesBusquedaFiltrado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSQUEDA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        panelConsultarHabitacionesBusquedaFiltrado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        panelConsultarHabitacionesBusquedaFiltrado.setRequestFocusEnabled(false);
        panelConsultarHabitacionesBusquedaFiltrado.setVerifyInputWhenFocusTarget(false);
        panelConsultarHabitacionesBusquedaFiltrado.setLayout(new java.awt.BorderLayout());

        panelConsultarHabitacionesPrincipalBusquedaFiltrado.setLayout(new java.awt.GridLayout(3, 2, 0, 15));

        labelConsultarHabitacionesFechaEntrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConsultarHabitacionesFechaEntrada.setText("Fecha de Entrada:");
        panelConsultarHabitacionesPrincipalBusquedaFiltrado.add(labelConsultarHabitacionesFechaEntrada);

        dateChooserFechaEntrada.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserFechaEntrada.setNothingAllowed(false);
    dateChooserFechaEntrada.setMinDate(Calendar.getInstance());
    dateChooserFechaEntrada.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
    GregorianCalendar c = new GregorianCalendar();
    c.add(Calendar.DAY_OF_MONTH, 1);
    PeriodSet s = new PeriodSet();
    s.add(c);
    try{
        this.dateChooserFechaEntrada.setDefaultPeriods(s);
    } catch(IncompatibleDataExeption e){
        e.printStackTrace();
    }
    panelConsultarHabitacionesPrincipalBusquedaFiltrado.add(dateChooserFechaEntrada);

    labelConsultarHabitacionesNumDias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    labelConsultarHabitacionesNumDias.setText("Nº de Dias:");
    panelConsultarHabitacionesPrincipalBusquedaFiltrado.add(labelConsultarHabitacionesNumDias);

    fieldConsultarHabitacionesNumeroHabitaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    panelConsultarHabitacionesPrincipalBusquedaFiltrado.add(fieldConsultarHabitacionesNumeroHabitaciones);

    labelConsultarHabitacionesFiltrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    labelConsultarHabitacionesFiltrado.setText("Filtrado:");
    panelConsultarHabitacionesPrincipalBusquedaFiltrado.add(labelConsultarHabitacionesFiltrado);

    comboBoxConsultarHabitacionesTipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simple", "Doble", "DobleMatrimonio" }));
    comboBoxConsultarHabitacionesTipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    panelConsultarHabitacionesPrincipalBusquedaFiltrado.add(comboBoxConsultarHabitacionesTipos);

    panelConsultarHabitacionesBusquedaFiltrado.add(panelConsultarHabitacionesPrincipalBusquedaFiltrado, java.awt.BorderLayout.CENTER);

    panelConsultarHabitacionesPrincipalBuscarHabitacion.add(panelConsultarHabitacionesBusquedaFiltrado, java.awt.BorderLayout.CENTER);

    panelConsultarHabitacionesBttnBuscar.setPreferredSize(new java.awt.Dimension(85, 149));

    bttnConsultarHabitacionesBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    bttnConsultarHabitacionesBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar_32.png"))); // NOI18N
    bttnConsultarHabitacionesBuscar.setText("BUSCAR");
    bttnConsultarHabitacionesBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    bttnConsultarHabitacionesBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    bttnConsultarHabitacionesBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    bttnConsultarHabitacionesBuscar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bttnConsultarHabitacionesBuscarActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout panelConsultarHabitacionesBttnBuscarLayout = new javax.swing.GroupLayout(panelConsultarHabitacionesBttnBuscar);
    panelConsultarHabitacionesBttnBuscar.setLayout(panelConsultarHabitacionesBttnBuscarLayout);
    panelConsultarHabitacionesBttnBuscarLayout.setHorizontalGroup(
        panelConsultarHabitacionesBttnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 85, Short.MAX_VALUE)
        .addGroup(panelConsultarHabitacionesBttnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultarHabitacionesBttnBuscarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bttnConsultarHabitacionesBuscar)
                .addGap(0, 0, Short.MAX_VALUE)))
    );
    panelConsultarHabitacionesBttnBuscarLayout.setVerticalGroup(
        panelConsultarHabitacionesBttnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 149, Short.MAX_VALUE)
        .addGroup(panelConsultarHabitacionesBttnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultarHabitacionesBttnBuscarLayout.createSequentialGroup()
                .addGap(0, 45, Short.MAX_VALUE)
                .addComponent(bttnConsultarHabitacionesBuscar)
                .addGap(0, 45, Short.MAX_VALUE)))
    );

    panelConsultarHabitacionesPrincipalBuscarHabitacion.add(panelConsultarHabitacionesBttnBuscar, java.awt.BorderLayout.EAST);

    javax.swing.GroupLayout panelConsultarHabitacionesBuscarHabitacionLayout = new javax.swing.GroupLayout(panelConsultarHabitacionesBuscarHabitacion);
    panelConsultarHabitacionesBuscarHabitacion.setLayout(panelConsultarHabitacionesBuscarHabitacionLayout);
    panelConsultarHabitacionesBuscarHabitacionLayout.setHorizontalGroup(
        panelConsultarHabitacionesBuscarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(panelConsultarHabitacionesPrincipalBuscarHabitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
    );
    panelConsultarHabitacionesBuscarHabitacionLayout.setVerticalGroup(
        panelConsultarHabitacionesBuscarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelConsultarHabitacionesBuscarHabitacionLayout.createSequentialGroup()
            .addComponent(panelConsultarHabitacionesPrincipalBuscarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );

    panelConsultarHabitacionesListado.add(panelConsultarHabitacionesBuscarHabitacion);

    tableConsultarHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Nº Habitacion", "Precio", "Tipo", ""
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    tableConsultarHabitaciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    tableConsultarHabitaciones.getTableHeader().setReorderingAllowed(false);
    scrollPaneConsultarHabitaciones.setViewportView(tableConsultarHabitaciones);
    if (tableConsultarHabitaciones.getColumnModel().getColumnCount() > 0) {
        tableConsultarHabitaciones.getColumnModel().getColumn(0).setResizable(false);
        tableConsultarHabitaciones.getColumnModel().getColumn(0).setPreferredWidth(150);
        tableConsultarHabitaciones.getColumnModel().getColumn(1).setResizable(false);
        tableConsultarHabitaciones.getColumnModel().getColumn(1).setPreferredWidth(150);
        tableConsultarHabitaciones.getColumnModel().getColumn(2).setResizable(false);
        tableConsultarHabitaciones.getColumnModel().getColumn(2).setPreferredWidth(150);
        tableConsultarHabitaciones.getColumnModel().getColumn(3).setResizable(false);
        tableConsultarHabitaciones.getColumnModel().getColumn(3).setPreferredWidth(0);
    }

    panelConsultarHabitacionesListado.add(scrollPaneConsultarHabitaciones);

    javax.swing.GroupLayout panelConsultarHabitacionesPrincipalListadoLayout = new javax.swing.GroupLayout(panelConsultarHabitacionesPrincipalListado);
    panelConsultarHabitacionesPrincipalListado.setLayout(panelConsultarHabitacionesPrincipalListadoLayout);
    panelConsultarHabitacionesPrincipalListadoLayout.setHorizontalGroup(
        panelConsultarHabitacionesPrincipalListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelConsultarHabitacionesPrincipalListadoLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(panelConsultarHabitacionesListado, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
            .addContainerGap())
    );
    panelConsultarHabitacionesPrincipalListadoLayout.setVerticalGroup(
        panelConsultarHabitacionesPrincipalListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelConsultarHabitacionesPrincipalListadoLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(panelConsultarHabitacionesListado, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
            .addContainerGap())
    );

    panelConsultarHabitacionesPrincipal.add(panelConsultarHabitacionesPrincipalListado, java.awt.BorderLayout.CENTER);

    panelConsultarHabitacionesOpciones.setBackground(new java.awt.Color(153, 153, 153));
    panelConsultarHabitacionesOpciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    bttnConsultarHabitacionesReservar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    bttnConsultarHabitacionesReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listado_habitaciones_32.png"))); // NOI18N
    bttnConsultarHabitacionesReservar.setText("Reservar");
    bttnConsultarHabitacionesReservar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    bttnConsultarHabitacionesReservar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bttnConsultarHabitacionesReservarActionPerformed(evt);
        }
    });

    bttnConsultarHabitacionesAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver_32.png"))); // NOI18N
    bttnConsultarHabitacionesAtras.setText("Atrás");
    bttnConsultarHabitacionesAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    bttnConsultarHabitacionesAtras.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bttnConsultarHabitacionesAtrasActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout panelConsultarHabitacionesOpcionesLayout = new javax.swing.GroupLayout(panelConsultarHabitacionesOpciones);
    panelConsultarHabitacionesOpciones.setLayout(panelConsultarHabitacionesOpcionesLayout);
    panelConsultarHabitacionesOpcionesLayout.setHorizontalGroup(
        panelConsultarHabitacionesOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultarHabitacionesOpcionesLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(bttnConsultarHabitacionesAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
            .addComponent(bttnConsultarHabitacionesReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    panelConsultarHabitacionesOpcionesLayout.setVerticalGroup(
        panelConsultarHabitacionesOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelConsultarHabitacionesOpcionesLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(panelConsultarHabitacionesOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(bttnConsultarHabitacionesReservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttnConsultarHabitacionesAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    panelConsultarHabitacionesPrincipal.add(panelConsultarHabitacionesOpciones, java.awt.BorderLayout.SOUTH);

    javax.swing.GroupLayout panelConsultarHabitacionesLayout = new javax.swing.GroupLayout(panelConsultarHabitaciones);
    panelConsultarHabitaciones.setLayout(panelConsultarHabitacionesLayout);
    panelConsultarHabitacionesLayout.setHorizontalGroup(
        panelConsultarHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelConsultarHabitacionesLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(panelConsultarHabitacionesPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    panelConsultarHabitacionesLayout.setVerticalGroup(
        panelConsultarHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelConsultarHabitacionesLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(panelConsultarHabitacionesPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 500, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelConsultarHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 450, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConsultarHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnConsultarHabitacionesBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnConsultarHabitacionesBuscarActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) tableConsultarHabitaciones.getModel();
        tableModel.setRowCount(0);
        tableConsultarHabitaciones.setModel(tableModel);

        ArrayList listado = new ArrayList();
        Calendar calendar = dateChooserFechaEntrada.getSelectedDate();
        Date fecha_seleccionada = calendar.getTime();

        if (fecha_seleccionada == null) {
            JOptionPane.showMessageDialog(this, "Seleccione una fecha de entrada", "Informacion", JOptionPane.ERROR_MESSAGE);
        } else {
            String num_dias = fieldConsultarHabitacionesNumeroHabitaciones.getText();
            if (num_dias.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Introduzca el número de dias", "Informacion", JOptionPane.ERROR_MESSAGE);
            } else {

                Pattern pattern = Pattern.compile("[1-9][0-9]*");
                if (pattern.matcher(num_dias).matches() == false) {
                    JOptionPane.showMessageDialog(this, "Introduzca el número de dias correctamente", "Informacion", JOptionPane.ERROR_MESSAGE);
                } else {
                    String tipo_habitacion = comboBoxConsultarHabitacionesTipos.getItemAt(comboBoxConsultarHabitacionesTipos.getSelectedIndex());
                    listado = recepcionista.consultarHabitacionesDisponibles(fecha_seleccionada, Integer.parseInt(num_dias), tipo_habitacion);

                    if (listado.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "No se ha encontrado ninguna habitacion disponible", "Informacion", JOptionPane.ERROR_MESSAGE);
                    } else {
                        for (Object habitacion : listado) {
                            String cadena = habitacion.toString();

                            String[] tokenizer = cadena.split(":");

                            tableModel.addRow(new Object[]{
                                tokenizer[0],
                                tokenizer[1],
                                tokenizer[2],
                                habitacion
                            });
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_bttnConsultarHabitacionesBuscarActionPerformed

    private void bttnConsultarHabitacionesReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnConsultarHabitacionesReservarActionPerformed
        int filas = tableConsultarHabitaciones.getModel().getRowCount();
        if (filas == 0) {
            JOptionPane.showMessageDialog(this, "Primero realice la busqueda", "Informacion", JOptionPane.ERROR_MESSAGE);
        } else {
            int seleccionadas = tableConsultarHabitaciones.getSelectedRowCount();
            if (seleccionadas == 0) {
                JOptionPane.showMessageDialog(this, "Seleccione una habitacion del listado", "Informacion", JOptionPane.ERROR_MESSAGE);
            } else {
                int indice_fila = tableConsultarHabitaciones.getSelectedRow();
                Object habitacion = tableConsultarHabitaciones.getValueAt(indice_fila, 3);

                ReservarHabitacion reservarHabitacion = new ReservarHabitacion(recepcionista, habitacion, this, VAnterior);

                setVisible(false);
                reservarHabitacion.setLocationRelativeTo(null);
                reservarHabitacion.setVisible(true);

            }
        }
    }//GEN-LAST:event_bttnConsultarHabitacionesReservarActionPerformed

    private void bttnConsultarHabitacionesAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnConsultarHabitacionesAtrasActionPerformed
        dispose();
        VAnterior.setVisible(true);
    }//GEN-LAST:event_bttnConsultarHabitacionesAtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnConsultarHabitacionesAtras;
    private javax.swing.JButton bttnConsultarHabitacionesBuscar;
    private javax.swing.JButton bttnConsultarHabitacionesReservar;
    private javax.swing.JComboBox<String> comboBoxConsultarHabitacionesTipos;
    private datechooser.beans.DateChooserCombo dateChooserFechaEntrada;
    private javax.swing.JTextField fieldConsultarHabitacionesNumeroHabitaciones;
    private javax.swing.JLabel labelConsultarHabitacionesFechaEntrada;
    private javax.swing.JLabel labelConsultarHabitacionesFiltrado;
    private javax.swing.JLabel labelConsultarHabitacionesNumDias;
    private javax.swing.JPanel panelConsultarHabitaciones;
    private javax.swing.JPanel panelConsultarHabitacionesBttnBuscar;
    private javax.swing.JPanel panelConsultarHabitacionesBuscarHabitacion;
    private javax.swing.JPanel panelConsultarHabitacionesBusquedaFiltrado;
    private javax.swing.JPanel panelConsultarHabitacionesListado;
    private javax.swing.JPanel panelConsultarHabitacionesOpciones;
    private javax.swing.JPanel panelConsultarHabitacionesPrincipal;
    private javax.swing.JPanel panelConsultarHabitacionesPrincipalBuscarHabitacion;
    private javax.swing.JPanel panelConsultarHabitacionesPrincipalBusquedaFiltrado;
    private javax.swing.JPanel panelConsultarHabitacionesPrincipalListado;
    private javax.swing.JScrollPane scrollPaneConsultarHabitaciones;
    private static javax.swing.JTable tableConsultarHabitaciones;
    // End of variables declaration//GEN-END:variables
private Recepcionista recepcionista;
    private JFrame VAnterior;
}