package com.poopers.proyectocriptografia.pantallas;

import com.poopers.proyectocriptografia.comunicacion.DetectorIP;
import com.poopers.proyectocriptografia.comunicacion.Servidor;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Este frame es usado como el servidor, como medio para la comunicación y
 * visualización de los archivos recibidos.
 */
public class ReceptorArchivoForm extends javax.swing.JFrame {

    /**
     * Creates new form ReceptorArchivoForm
     */
    public ReceptorArchivoForm() {
        initComponents();
        configure();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloEmisor = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jtfIPServidor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfIPAutoridad = new javax.swing.JTextField();
        btnComenzar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlstArchivosRecibidos = new javax.swing.JList<>();
        jpanelDetallesArchivo = new javax.swing.JPanel();
        jpanelContentDetalles = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfEstadoArchivo = new javax.swing.JTextField();
        jtfIdArchivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfRemitenteArchivo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 500));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setPreferredSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTituloEmisor.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        lblTituloEmisor.setText("Receptor de Archivos");
        jPanel1.add(lblTituloEmisor);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 20));

        jLabel2.setText("<html><strong>Instrucciones: </strong> <br>1. Ingresa en el emisor la IP del servidor.<br>2. Ingresa la IP de la autoridad certificadora<br> 3. Espera recibir los archivos");
        jLabel2.setMaximumSize(new java.awt.Dimension(800, 20));
        jPanel4.add(jLabel2);

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuración"));

        jLabel8.setText("IP servidor:");

        jtfIPServidor.setEditable(false);

        jLabel9.setText("IP de autoridad:");

        btnComenzar.setText("Comenzar");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jtfIPServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jtfIPAutoridad, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnComenzar, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jtfIPServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIPAutoridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComenzar))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, java.awt.BorderLayout.NORTH);

        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 0, 0, 0));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Recepción de archivos"));
        jPanel7.setLayout(new java.awt.GridLayout(1, 2));

        jScrollPane1.setViewportView(jlstArchivosRecibidos);

        jPanel7.add(jScrollPane1);

        jpanelDetallesArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles"));

        jLabel1.setText("Id del archivo: ");

        jtfEstadoArchivo.setEditable(false);

        jtfIdArchivo.setEditable(false);

        jLabel3.setText("Estado:");

        jLabel4.setText("Remitente:");

        jtfRemitenteArchivo.setEditable(false);

        javax.swing.GroupLayout jpanelContentDetallesLayout = new javax.swing.GroupLayout(jpanelContentDetalles);
        jpanelContentDetalles.setLayout(jpanelContentDetallesLayout);
        jpanelContentDetallesLayout.setHorizontalGroup(
            jpanelContentDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelContentDetallesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelContentDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelContentDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfIdArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(jtfEstadoArchivo)
                    .addComponent(jtfRemitenteArchivo))
                .addContainerGap())
        );
        jpanelContentDetallesLayout.setVerticalGroup(
            jpanelContentDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelContentDetallesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelContentDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfIdArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelContentDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEstadoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelContentDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfRemitenteArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpanelDetallesArchivoLayout = new javax.swing.GroupLayout(jpanelDetallesArchivo);
        jpanelDetallesArchivo.setLayout(jpanelDetallesArchivoLayout);
        jpanelDetallesArchivoLayout.setHorizontalGroup(
            jpanelDetallesArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelDetallesArchivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelContentDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelDetallesArchivoLayout.setVerticalGroup(
            jpanelDetallesArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelDetallesArchivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelContentDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.add(jpanelDetallesArchivo);

        jPanel6.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jtfIPServidor.setText(DetectorIP.detectarIP());
    }//GEN-LAST:event_formWindowOpened

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        if (jtfIPAutoridad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(ReceptorArchivoForm.this,
                    "Asegúrate de colocar la IP de la autoridad certificadora",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                servidor = new Servidor(jtfIPAutoridad.getText());
                servidor.setUploadStartedListener(new Servidor.UploadStartedListener() {
                    @Override
                    public void onUploadStart(int idArchivo) {
                        ArchivoRecibido nuevo = new ArchivoRecibido(idArchivo);
                        modeloArchivos.addElement(nuevo);
                    }
                });
                servidor.setUploadProgressListener(new Servidor.UploadProgressListener() {
                    @Override
                    public void onUploadProgress(int idArchivo, int bloques) {
                        for (int i = 0; i < modeloArchivos.size(); i++) {
                            ArchivoRecibido actual = modeloArchivos.getElementAt(i);
                            if (actual.getIdArchivo() == idArchivo) {
                                actual.setBloquesRecibidos(bloques);
                                break;
                            }
                        }
                    }
                });
                servidor.setUploadFinishedListener(new Servidor.UploadFinishedListener() {
                    @Override
                    public void onUploadFinish(int idArchivo, String entidadEmisora) {
                        for (int i = 0; i < modeloArchivos.size(); i++) {
                            ArchivoRecibido actual = modeloArchivos.getElementAt(i);
                            if (actual.getIdArchivo() == idArchivo) {
                                actual.setEntidadEmisora(entidadEmisora);
                                break;
                            }
                        }
                    }
                });
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            while (true) {
                                servidor.receiveMessage();
                            }
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(ReceptorArchivoForm.this,
                                    ex, "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }).start();
                btnComenzar.setEnabled(false);
            } catch (IOException ex) {
                Logger.getLogger(ReceptorArchivoForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnComenzarActionPerformed

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
            java.util.logging.Logger.getLogger(ReceptorArchivoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptorArchivoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptorArchivoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptorArchivoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceptorArchivoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComenzar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<ArchivoRecibido> jlstArchivosRecibidos;
    private javax.swing.JPanel jpanelContentDetalles;
    private javax.swing.JPanel jpanelDetallesArchivo;
    private javax.swing.JTextField jtfEstadoArchivo;
    private javax.swing.JTextField jtfIPAutoridad;
    private javax.swing.JTextField jtfIPServidor;
    private javax.swing.JTextField jtfIdArchivo;
    private javax.swing.JTextField jtfRemitenteArchivo;
    private javax.swing.JLabel lblTituloEmisor;
    // End of variables declaration//GEN-END:variables

    private Servidor servidor;
    private DefaultListModel<ArchivoRecibido> modeloArchivos;

    private void configure() {
        setLocationRelativeTo(null);
        setResizable(false);
        modeloArchivos = new DefaultListModel<>();
        jlstArchivosRecibidos.setModel(modeloArchivos);
        jtfIPAutoridad.setText(DetectorIP.detectarIP());
        addJlstArchivosRecibidosListSelectionListener();
        jpanelContentDetalles.setVisible(false);
    }

    private void addJlstArchivosRecibidosListSelectionListener() {
        jlstArchivosRecibidos.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    ArchivoRecibido archivo = jlstArchivosRecibidos.getSelectedValue();
                    if (archivo == null) {
                        jpanelContentDetalles.setVisible(false);
                    } else {
                        jpanelContentDetalles.setVisible(true);
                        jtfIdArchivo.setText(archivo.getIdArchivo() + "");
                        jtfEstadoArchivo.setText("Se recibieron "
                                + archivo.getBloquesRecibidos() + " bloques");
                        String entidad = null;
                        if (archivo.getEntidadEmisora() == null) {
                            entidad = "Aún no se determina";
                        } else {
                            entidad = archivo.getEntidadEmisora();
                        }
                        jtfRemitenteArchivo.setText(entidad);
                    }
                }
            }
        });
    }

    private class ArchivoRecibido {

        private int idArchivo;
        private int bloquesRecibidos;
        private String entidadEmisora;

        public ArchivoRecibido(int idArchivo) {
            this.idArchivo = idArchivo;
        }

        public int getIdArchivo() {
            return idArchivo;
        }

        public int getBloquesRecibidos() {
            return bloquesRecibidos;
        }

        public void setBloquesRecibidos(int bloquesRecibidos) {
            this.bloquesRecibidos = bloquesRecibidos;
        }

        public String getEntidadEmisora() {
            return entidadEmisora;
        }

        public void setEntidadEmisora(String entidadEmisora) {
            this.entidadEmisora = entidadEmisora;
        }

        @Override
        public String toString() {
            return "Archivo " + idArchivo;
        }
    }
}