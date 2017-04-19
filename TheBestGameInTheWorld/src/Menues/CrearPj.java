/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menues;

import javax.swing.JTextField;
import Controlador.ControladorCrearPj;
/**
 *
 * @author prouser
 */
public class CrearPj extends javax.swing.JFrame {
    
private ControladorCrearPj refControlador;    
    public CrearPj() {
        initComponents();
        this.setSize(800, 600);
        lblFondo.setSize(800, 600);
        lblImagenAvatar.setVisible(false);
        lblDescripcion.setVisible(false);
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        refControlador = new Controlador.ControladorCrearPj();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbClase = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        btnComenzar = new javax.swing.JButton();
        lblCreaPj = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblImagenAvatar = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblGolpe = new javax.swing.JLabel();
        lblSeleccionaClase2 = new javax.swing.JLabel();
        lblValor1 = new javax.swing.JLabel();
        lblValor2 = new javax.swing.JLabel();
        lblValor3 = new javax.swing.JLabel();
        lblDefensa = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblVida = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setTitle("The Best Game in the World");
        setBackground(new java.awt.Color(0, 0, 0));
        setName("The Best Game In the World"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        cmbClase.setBackground(new java.awt.Color(0, 0, 0));
        cmbClase.setFont(new java.awt.Font("TlwgMono", 1, 12)); // NOI18N
        cmbClase.setForeground(new java.awt.Color(255, 255, 255));
        cmbClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Detective", "Explorador", "Policia" }));
        cmbClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClaseActionPerformed(evt);
            }
        });
        getContentPane().add(cmbClase);
        cmbClase.setBounds(30, 260, 140, 27);

        btnVolver.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(680, 535, 80, 25);

        btnComenzar.setBackground(new java.awt.Color(0, 0, 0));
        btnComenzar.setForeground(new java.awt.Color(255, 255, 255));
        btnComenzar.setText("Comenzar");
        btnComenzar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComenzar);
        btnComenzar.setBounds(520, 535, 80, 25);

        lblCreaPj.setFont(new java.awt.Font("TlwgMono", 1, 36)); // NOI18N
        lblCreaPj.setForeground(new java.awt.Color(255, 255, 255));
        lblCreaPj.setText("Crea tu Personaje");
        getContentPane().add(lblCreaPj);
        lblCreaPj.setBounds(390, 20, 380, 40);

        lblNombre.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre.setFont(new java.awt.Font("TlwgMono", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText(" Nombre:");
        lblNombre.setOpaque(true);
        getContentPane().add(lblNombre);
        lblNombre.setBounds(30, 100, 100, 26);

        lblImagenAvatar.setBackground(new java.awt.Color(0, 0, 0));
        lblImagenAvatar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblImagenAvatar.setForeground(new java.awt.Color(255, 255, 255));
        lblImagenAvatar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(lblImagenAvatar);
        lblImagenAvatar.setBounds(540, 100, 230, 320);

        txtNombre.setFont(new java.awt.Font("TlwgMono", 2, 24)); // NOI18N
        txtNombre.setText(" ");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(30, 140, 290, 40);

        lblGolpe.setBackground(new java.awt.Color(0, 0, 0));
        lblGolpe.setFont(new java.awt.Font("TlwgMono", 1, 18)); // NOI18N
        lblGolpe.setForeground(new java.awt.Color(255, 255, 255));
        lblGolpe.setText(" Golpe:");
        lblGolpe.setOpaque(true);
        getContentPane().add(lblGolpe);
        lblGolpe.setBounds(30, 470, 100, 26);

        lblSeleccionaClase2.setBackground(new java.awt.Color(0, 0, 0));
        lblSeleccionaClase2.setFont(new java.awt.Font("TlwgMono", 1, 18)); // NOI18N
        lblSeleccionaClase2.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccionaClase2.setText(" Selecciona tu Clase: ");
        lblSeleccionaClase2.setOpaque(true);
        getContentPane().add(lblSeleccionaClase2);
        lblSeleccionaClase2.setBounds(30, 220, 250, 26);

        lblValor1.setBackground(new java.awt.Color(255, 255, 255));
        lblValor1.setFont(new java.awt.Font("TlwgMono", 1, 18)); // NOI18N
        lblValor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor1.setOpaque(true);
        getContentPane().add(lblValor1);
        lblValor1.setBounds(140, 390, 50, 26);

        lblValor2.setBackground(new java.awt.Color(255, 255, 255));
        lblValor2.setFont(new java.awt.Font("TlwgMono", 1, 18)); // NOI18N
        lblValor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor2.setOpaque(true);
        getContentPane().add(lblValor2);
        lblValor2.setBounds(140, 430, 50, 26);

        lblValor3.setBackground(new java.awt.Color(255, 255, 255));
        lblValor3.setFont(new java.awt.Font("TlwgMono", 1, 18)); // NOI18N
        lblValor3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor3.setOpaque(true);
        getContentPane().add(lblValor3);
        lblValor3.setBounds(140, 470, 70, 26);

        lblDefensa.setBackground(new java.awt.Color(0, 0, 0));
        lblDefensa.setFont(new java.awt.Font("TlwgMono", 1, 18)); // NOI18N
        lblDefensa.setForeground(new java.awt.Color(255, 255, 255));
        lblDefensa.setText(" Defensa:");
        lblDefensa.setOpaque(true);
        getContentPane().add(lblDefensa);
        lblDefensa.setBounds(30, 430, 100, 26);

        lblDescripcion.setBackground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setFont(new java.awt.Font("TlwgMono", 1, 12)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescripcion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        lblDescripcion.setOpaque(true);
        getContentPane().add(lblDescripcion);
        lblDescripcion.setBounds(540, 430, 230, 80);

        lblVida.setBackground(new java.awt.Color(0, 0, 0));
        lblVida.setFont(new java.awt.Font("TlwgMono", 1, 18)); // NOI18N
        lblVida.setForeground(new java.awt.Color(255, 255, 255));
        lblVida.setText(" Vida:");
        lblVida.setOpaque(true);
        getContentPane().add(lblVida);
        lblVida.setBounds(30, 390, 100, 26);

        lblFondo.setBackground(new java.awt.Color(0, 0, 0));
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/fondo1.jpg"))); // NOI18N
        lblFondo.setText("jLabel1");
        lblFondo.setOpaque(true);
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:

        Main jFrame = new Main();//"Frame2" es el nombre que  le pusiste a tu 2do jframe

        jFrame.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
    
        refControlador.agregarValores(txtNombre.getText(), cmbClase.getSelectedItem().toString());
            
        PantallaJuego bienvenida = new PantallaJuego();
        
        PantallaJuego jFrame = new PantallaJuego();//"Frame2" es el nombre que  le pusiste a tu 2do jframe

        jFrame.setVisible(true);

        this.dispose();


    }//GEN-LAST:event_btnComenzarActionPerformed

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    private void cmbClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClaseActionPerformed
        // TODO add your handling code here:

        if (cmbClase.getSelectedItem().equals("Detective")) {

            lblImagenAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/detective.jpg")));
            lblDescripcion.setText("<html><center>El Dective se caracteriza por<p>"
                    + " su astucia y su habilidad en <p>"
                    + " la pelea, es la clase más"
                    + " equilibrada del juego</center></html>");
            lblValor1.setText("10");
            lblValor2.setText("10");
            lblValor3.setText("5/10");
            lblImagenAvatar.setVisible(true);
            lblDescripcion.setVisible(true);            

        } else if (cmbClase.getSelectedItem().equals("Policia")) {

            lblImagenAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/policia.jpg")));
            lblDescripcion.setText("<html><center>Ser Policia no es fácil...<p>"
                    + "La fuerza es importante para<p>"
                    + " luchar contra las amenazas que<p>"
                    + " encontrarás en esta historia</center></html>");
            lblValor1.setText("12");
            lblValor2.setText("8");
            lblValor3.setText("4/12");
            lblImagenAvatar.setVisible(true);
            lblDescripcion.setVisible(true);            

        } else if (cmbClase.getSelectedItem().equals("Explorador")) {
            lblImagenAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/explorador.jpg")));
            lblDescripcion.setText("<html><center>Para explorar hay que ser ágil<p>"
                    + " y esa es una caracteristica<p>"
                    + " de esta clase. Defensivo por<p>"
                    + " naturaleza.</center></html>");
            lblValor1.setText("8");
            lblValor2.setText("12");
            lblValor3.setText("6/7");
            lblImagenAvatar.setVisible(true);
            lblDescripcion.setVisible(true);

        } else {

            lblImagenAvatar.setIcon(null);
            lblDescripcion.setText("");
            lblValor1.setText("");
            lblValor2.setText("");
            lblValor3.setText("");
            lblImagenAvatar.setVisible(false);
            lblDescripcion.setVisible(false);

        }


    }//GEN-LAST:event_cmbClaseActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
    


    }//GEN-LAST:event_txtNombreActionPerformed

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
            java.util.logging.Logger.getLogger(CrearPj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearPj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearPj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearPj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearPj().setVisible(true);

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbClase;
    private javax.swing.JLabel lblCreaPj;
    private javax.swing.JLabel lblDefensa;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGolpe;
    private javax.swing.JLabel lblImagenAvatar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSeleccionaClase2;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JLabel lblValor2;
    private javax.swing.JLabel lblValor3;
    private javax.swing.JLabel lblVida;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
