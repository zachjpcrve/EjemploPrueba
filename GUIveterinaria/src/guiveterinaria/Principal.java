/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiveterinaria;

import java.util.Calendar;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
        PnlSecundario.setVisible(false);
        PnlHistoria.setVisible(false);
        PnlVerHistoria.setVisible(false);
        PnlMenu.setVisible(false);
        PnlVerHistoria.setVisible(false);
    }
    BancoDeHistorias banc= new BancoDeHistorias();
    private static int indice=0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        BtnSalir = new javax.swing.JButton();
        PnlSecundario = new javax.swing.JPanel();
        btnHistoria = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        PnlHistoria = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        DateFecha = new com.toedter.calendar.JDateChooser();
        txtNombProp = new javax.swing.JTextField();
        txtDirec = new javax.swing.JTextField();
        txtDistri = new javax.swing.JTextField();
        txtTelef = new javax.swing.JTextField();
        txtNombMsc = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        CmbSexo = new javax.swing.JComboBox();
        CmbEspecie = new javax.swing.JComboBox();
        PnlMenu = new javax.swing.JPanel();
        btnVerHistoria = new javax.swing.JButton();
        btnSalir2 = new javax.swing.JButton();
        PnlVerHistoria = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        LblNom = new javax.swing.JLabel();
        LblDir = new javax.swing.JLabel();
        LblDis = new javax.swing.JLabel();
        LblTf = new javax.swing.JLabel();
        LblNomMsc = new javax.swing.JLabel();
        LblEsp = new javax.swing.JLabel();
        LblRaza = new javax.swing.JLabel();
        LblSexo = new javax.swing.JLabel();
        LblColor = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        LblDia = new javax.swing.JLabel();
        LblMes = new javax.swing.JLabel();
        LblAño = new javax.swing.JLabel();
        BtnAceptar2 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        LblCodigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlPrincipal.setMaximumSize(new java.awt.Dimension(800, 600));
        PnlPrincipal.setMinimumSize(new java.awt.Dimension(600, 600));
        PnlPrincipal.setPreferredSize(new java.awt.Dimension(800, 600));
        PnlPrincipal.setLayout(null);

        jLabel1.setText("Nombre :");
        PnlPrincipal.add(jLabel1);
        jLabel1.setBounds(270, 230, 62, 22);

        btnAceptar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        PnlPrincipal.add(btnAceptar);
        btnAceptar.setBounds(430, 310, 80, 23);

        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        PnlPrincipal.add(txtNombre);
        txtNombre.setBounds(356, 221, 180, 40);

        BtnSalir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        PnlPrincipal.add(BtnSalir);
        BtnSalir.setBounds(310, 310, 80, 23);

        PnlSecundario.setMaximumSize(new java.awt.Dimension(800, 600));
        PnlSecundario.setMinimumSize(new java.awt.Dimension(800, 600));
        PnlSecundario.setPreferredSize(new java.awt.Dimension(800, 600));

        btnHistoria.setText("Crear Historia");
        btnHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriaActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout PnlSecundarioLayout = new org.jdesktop.layout.GroupLayout(PnlSecundario);
        PnlSecundario.setLayout(PnlSecundarioLayout);
        PnlSecundarioLayout.setHorizontalGroup(
            PnlSecundarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PnlSecundarioLayout.createSequentialGroup()
                .add(315, 315, 315)
                .add(btnHistoria, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 169, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(PnlSecundarioLayout.createSequentialGroup()
                .add(370, 370, 370)
                .add(btnSalir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        PnlSecundarioLayout.setVerticalGroup(
            PnlSecundarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PnlSecundarioLayout.createSequentialGroup()
                .add(174, 174, 174)
                .add(btnHistoria, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(28, 28, 28)
                .add(btnSalir))
        );

        PnlHistoria.setMaximumSize(new java.awt.Dimension(800, 600));
        PnlHistoria.setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel2.setText("DATOS : PROPIETARIO");

        jLabel3.setText("Nombre :");

        jLabel4.setText("Direccion :");

        jLabel5.setText("Distrito :");

        jLabel6.setText("Telefono :");

        jLabel7.setText("DATOS: MASCOTA");

        jLabel8.setText("Nombre :");

        jLabel9.setText("Especie :");

        jLabel10.setText("Raza :");

        jLabel11.setText("Sexo :");

        jLabel12.setText("Color :");

        jLabel13.setText("Fecha de Nacimiento :");

        txtNombProp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNombProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombPropActionPerformed(evt);
            }
        });

        txtDirec.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtDistri.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtTelef.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtNombMsc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtRaza.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtColor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        CmbSexo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Macho", "Hembra" }));
        CmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbSexoActionPerformed(evt);
            }
        });

        CmbEspecie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Perro", "Gato", "Ave", "Roedor" }));
        CmbEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbEspecieActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout PnlHistoriaLayout = new org.jdesktop.layout.GroupLayout(PnlHistoria);
        PnlHistoria.setLayout(PnlHistoriaLayout);
        PnlHistoriaLayout.setHorizontalGroup(
            PnlHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PnlHistoriaLayout.createSequentialGroup()
                .add(PnlHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, PnlHistoriaLayout.createSequentialGroup()
                        .add(250, 250, 250)
                        .add(PnlHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(PnlHistoriaLayout.createSequentialGroup()
                                .add(jLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(txtColor))
                            .add(PnlHistoriaLayout.createSequentialGroup()
                                .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(txtRaza))
                            .add(PnlHistoriaLayout.createSequentialGroup()
                                .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(txtNombMsc))
                            .add(PnlHistoriaLayout.createSequentialGroup()
                                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(txtNombProp))
                            .add(PnlHistoriaLayout.createSequentialGroup()
                                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(txtDirec))
                            .add(PnlHistoriaLayout.createSequentialGroup()
                                .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(txtDistri))
                            .add(PnlHistoriaLayout.createSequentialGroup()
                                .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(txtTelef))
                            .add(PnlHistoriaLayout.createSequentialGroup()
                                .add(jLabel13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 123, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(DateFecha, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                            .add(PnlHistoriaLayout.createSequentialGroup()
                                .add(PnlHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(PnlHistoriaLayout.createSequentialGroup()
                                        .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(CmbEspecie, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(PnlHistoriaLayout.createSequentialGroup()
                                        .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(CmbSexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(PnlHistoriaLayout.createSequentialGroup()
                                        .add(103, 103, 103)
                                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 154, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(0, 0, Short.MAX_VALUE))))
                    .add(PnlHistoriaLayout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(PnlHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(PnlHistoriaLayout.createSequentialGroup()
                                .add(btnCancelar)
                                .add(58, 58, 58)
                                .add(btnGuardar)))
                        .add(28, 28, 28)))
                .add(308, 308, 308))
        );
        PnlHistoriaLayout.setVerticalGroup(
            PnlHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PnlHistoriaLayout.createSequentialGroup()
                .add(29, 29, 29)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(PnlHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtNombProp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(PnlHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtDirec, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(PnlHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtDistri, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(PnlHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtTelef, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(PnlHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(PnlHistoriaLayout.createSequentialGroup()
                        .add(PnlHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtNombMsc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(PnlHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(CmbEspecie, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(PnlHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtRaza, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(PnlHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(CmbSexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(PnlHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtColor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(jLabel13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(DateFecha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(26, 26, 26)
                .add(PnlHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnCancelar)
                    .add(btnGuardar))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        PnlMenu.setMaximumSize(new java.awt.Dimension(800, 600));
        PnlMenu.setMinimumSize(new java.awt.Dimension(800, 600));
        PnlMenu.setPreferredSize(new java.awt.Dimension(800, 600));

        btnVerHistoria.setText("Ver Historia");
        btnVerHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerHistoriaActionPerformed(evt);
            }
        });

        btnSalir2.setText("Salir");
        btnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout PnlMenuLayout = new org.jdesktop.layout.GroupLayout(PnlMenu);
        PnlMenu.setLayout(PnlMenuLayout);
        PnlMenuLayout.setHorizontalGroup(
            PnlMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PnlMenuLayout.createSequentialGroup()
                .addContainerGap(349, Short.MAX_VALUE)
                .add(PnlMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, PnlMenuLayout.createSequentialGroup()
                        .add(btnVerHistoria, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 148, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(303, 303, 303))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, PnlMenuLayout.createSequentialGroup()
                        .add(btnSalir2)
                        .add(350, 350, 350))))
        );
        PnlMenuLayout.setVerticalGroup(
            PnlMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PnlMenuLayout.createSequentialGroup()
                .add(203, 203, 203)
                .add(btnVerHistoria, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(34, 34, 34)
                .add(btnSalir2)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        PnlVerHistoria.setMaximumSize(new java.awt.Dimension(800, 600));
        PnlVerHistoria.setMinimumSize(new java.awt.Dimension(800, 600));
        PnlVerHistoria.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel14.setText("DATOS: MASCOTA");

        jLabel15.setText("Distrito :");

        jLabel16.setText("Raza :");

        jLabel17.setText("Telefono :");

        jLabel18.setText("Sexo :");

        jLabel19.setText("Nombre :");

        jLabel20.setText("Color :");

        jLabel21.setText("Direccion :");

        jLabel22.setText("DATOS : PROPIETARIO");

        jLabel23.setText("Especie :");

        jLabel24.setText("Nombre :");

        LblNom.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        LblDir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        LblDis.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        LblTf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        LblNomMsc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        LblEsp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        LblRaza.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        LblSexo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        LblColor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel34.setText("Fecha de Nac :");

        jLabel35.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel35.setText("Dia");

        jLabel36.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel36.setText("Mes");

        jLabel37.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel37.setText("Año");

        LblDia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        LblMes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        LblAño.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        BtnAceptar2.setText("Aceptar");
        BtnAceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptar2ActionPerformed(evt);
            }
        });

        jLabel25.setText("N° HISTORIA CLINICA :");

        LblCodigo.setText("jLabel26");

        org.jdesktop.layout.GroupLayout PnlVerHistoriaLayout = new org.jdesktop.layout.GroupLayout(PnlVerHistoria);
        PnlVerHistoria.setLayout(PnlVerHistoriaLayout);
        PnlVerHistoriaLayout.setHorizontalGroup(
            PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PnlVerHistoriaLayout.createSequentialGroup()
                .add(273, 273, 273)
                .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(PnlVerHistoriaLayout.createSequentialGroup()
                        .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, PnlVerHistoriaLayout.createSequentialGroup()
                                .add(jLabel20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblColor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, PnlVerHistoriaLayout.createSequentialGroup()
                                .add(jLabel18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblSexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, PnlVerHistoriaLayout.createSequentialGroup()
                                .add(jLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblRaza, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, PnlVerHistoriaLayout.createSequentialGroup()
                                .add(jLabel23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblEsp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, PnlVerHistoriaLayout.createSequentialGroup()
                                .add(jLabel24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblNomMsc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, PnlVerHistoriaLayout.createSequentialGroup()
                                .add(jLabel15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblDis, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, PnlVerHistoriaLayout.createSequentialGroup()
                                .add(jLabel17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(LblTf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(PnlVerHistoriaLayout.createSequentialGroup()
                        .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(PnlVerHistoriaLayout.createSequentialGroup()
                                .add(105, 105, 105)
                                .add(jLabel35)
                                .add(18, 18, 18)
                                .add(jLabel36)
                                .add(18, 18, 18)
                                .add(jLabel37))
                            .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(LblDir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(PnlVerHistoriaLayout.createSequentialGroup()
                                        .add(jLabel25)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(LblCodigo))
                                    .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                        .add(PnlVerHistoriaLayout.createSequentialGroup()
                                            .add(jLabel19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(LblNom, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, PnlVerHistoriaLayout.createSequentialGroup()
                                            .add(103, 103, 103)
                                            .add(jLabel22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 154, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                            .add(PnlVerHistoriaLayout.createSequentialGroup()
                                .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(BtnAceptar2)
                                    .add(PnlVerHistoriaLayout.createSequentialGroup()
                                        .add(jLabel34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(LblDia)
                                        .add(18, 18, 18)
                                        .add(LblMes)))
                                .add(18, 18, 18)
                                .add(LblAño, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(0, 0, Short.MAX_VALUE))))
        );
        PnlVerHistoriaLayout.setVerticalGroup(
            PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PnlVerHistoriaLayout.createSequentialGroup()
                .add(28, 28, 28)
                .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel25)
                    .add(LblCodigo))
                .add(18, 18, 18)
                .add(jLabel22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblNom))
                .add(18, 18, 18)
                .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblDir))
                .add(18, 18, 18)
                .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblDis))
                .add(18, 18, 18)
                .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblTf))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblNomMsc))
                .add(18, 18, 18)
                .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblEsp))
                .add(18, 18, 18)
                .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblRaza))
                .add(18, 18, 18)
                .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblSexo))
                .add(18, 18, 18)
                .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblColor))
                .add(18, 18, 18)
                .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel35)
                    .add(jLabel36)
                    .add(jLabel37))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(PnlVerHistoriaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblDia)
                    .add(LblMes)
                    .add(LblAño))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(BtnAceptar2)
                .add(28, 28, 28))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PnlPrincipal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 763, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(PnlMenu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(PnlSecundario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(PnlHistoria, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(PnlVerHistoria, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PnlPrincipal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(PnlMenu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(PnlSecundario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(PnlHistoria, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(PnlVerHistoria, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        PnlSecundario.setVisible(false);
        PnlPrincipal.setVisible(true);
        txtNombre.setText(null);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int comprobacion;
        String nombre=txtNombre.getText().trim();
        comprobacion=banc.buscarNombre(nombre);
        if(comprobacion==0){
            JOptionPane.showMessageDialog(null, "Ud. no posee una historia en la clinica\nDebe registrarse para tener acceso a los diferentes servicios");
            PnlPrincipal.setVisible(false);
            PnlSecundario.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "UD. YA POSEE UNA HISTORIA CLINICA");
            PnlPrincipal.setVisible(false);
            PnlMenu.setVisible(true);
            indice=comprobacion-1;
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoriaActionPerformed
        PnlSecundario.setVisible(false);
        PnlHistoria.setVisible(true);
        txtColor.setText(null);
        txtDirec.setText(null);
        txtDistri.setText(null);
        txtNombMsc.setText(null);
        txtNombProp.setText(null);
        txtNombre.setText(null);
        txtRaza.setText(null);
        txtTelef.setText(null);
        
    }//GEN-LAST:event_btnHistoriaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String Nom=txtNombProp.getText().trim();
        String Dir=txtDirec.getText().trim();
        String Dis=txtDistri.getText().trim();
        String Val=txtTelef.getText().trim();
        int Tf=Integer.parseInt(Val);
        String NomMas=txtNombMsc.getText().trim();
        String esp=(String)CmbEspecie.getSelectedItem();
        String Rza=txtRaza.getText().trim();
        String Sx=(String)CmbSexo.getSelectedItem();
        String Clr=txtColor.getText().trim();
        int d=DateFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
        int m=DateFecha.getCalendar().get(Calendar.MONTH);
        int a=DateFecha.getCalendar().get(Calendar.YEAR);
        obtenerDatos(Nom, Dir, Dis, Tf, NomMas, esp, Rza, Sx, Clr, d, m, a);
        JOptionPane.showMessageDialog(null, "Guardado Con Exito");
        PnlHistoria.setVisible(false);
        PnlPrincipal.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void btnVerHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHistoriaActionPerformed
        PnlMenu.setVisible(false);
        String Val=Integer.toString(banc.MostrarCodigo(indice));
        LblCodigo.setText(Val);
        LblNom.setText(banc.MostrarNombreDueño(indice));
        LblDir.setText(banc.MostrarDireDueño(indice));
        LblDis.setText(banc.MostrarDistriDueño(indice));
        Val=Integer.toString(banc.MostarTelefono(indice));
        LblTf.setText(Val);
        LblNomMsc.setText(banc.MostrarNomMas(indice));
        LblEsp.setText(banc.MostrarEsp(indice));
        LblRaza.setText(banc.MostrarRaza(indice));
        LblSexo.setText(banc.MostrarSexo(indice));
        LblColor.setText(banc.MostrarColor(indice));
        Val=Integer.toString(banc.MostrarDia(indice));
        LblDia.setText(Val);
        Val=Integer.toString(banc.MostrarMes(indice));
        LblMes.setText(Val);
        Val=Integer.toString(banc.MostrarAño(indice));
        LblAño.setText(Val);
        PnlVerHistoria.setVisible(true);
        indice=0;
    }//GEN-LAST:event_btnVerHistoriaActionPerformed

    private void BtnAceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptar2ActionPerformed
        PnlVerHistoria.setVisible(false);
        PnlMenu.setVisible(true);
    }//GEN-LAST:event_BtnAceptar2ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        PnlHistoria.setVisible(false);
        PnlSecundario.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        PnlMenu.setVisible(false);
        PnlPrincipal.setVisible(true);
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void CmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbSexoActionPerformed

    }//GEN-LAST:event_CmbSexoActionPerformed

    private void CmbEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbEspecieActionPerformed

    }//GEN-LAST:event_CmbEspecieActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        PnlPrincipal.setVisible(false);
        System.exit(WIDTH);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void txtNombPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombPropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombPropActionPerformed
    void obtenerDatos(String Nom,String Dir,String Dis,int Tf,String NomMas,String esp,String Rza,String Sx,String Clr,int d,int m,int a){
        banc.crearHistoria(Nom,Dir,Dis,Tf,NomMas,esp,Rza,Sx,Clr,d,m,a);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar2;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox CmbEspecie;
    private javax.swing.JComboBox CmbSexo;
    private com.toedter.calendar.JDateChooser DateFecha;
    private javax.swing.JLabel LblAño;
    private javax.swing.JLabel LblCodigo;
    private javax.swing.JLabel LblColor;
    private javax.swing.JLabel LblDia;
    private javax.swing.JLabel LblDir;
    private javax.swing.JLabel LblDis;
    private javax.swing.JLabel LblEsp;
    private javax.swing.JLabel LblMes;
    private javax.swing.JLabel LblNom;
    private javax.swing.JLabel LblNomMsc;
    private javax.swing.JLabel LblRaza;
    private javax.swing.JLabel LblSexo;
    private javax.swing.JLabel LblTf;
    private javax.swing.JPanel PnlHistoria;
    private javax.swing.JPanel PnlMenu;
    private javax.swing.JPanel PnlPrincipal;
    private javax.swing.JPanel PnlSecundario;
    private javax.swing.JPanel PnlVerHistoria;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnHistoria;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JButton btnVerHistoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDirec;
    private javax.swing.JTextField txtDistri;
    private javax.swing.JTextField txtNombMsc;
    private javax.swing.JTextField txtNombProp;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTelef;
    // End of variables declaration//GEN-END:variables
}
