/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menues;

import javax.swing.JButton;
import javax.swing.JLabel;
import Controlador.ControladorPantallaJuego;
import Controlador.ControladorCrearPj;
/**
 *
 * @author prouser
 */
public class PantallaJuego extends javax.swing.JFrame {

    /**
     * Creates new form PantallaJuego
     */
    public PantallaJuego() {

        initComponents();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        
        lblHistoria.setText("<html><br>&nbsp;<font color=#ff0000><b>Felicitaciones! Has creado un personaje, comencemos la historia...</b></font><br></html>");

        txtNombre.setText("llama nombre");
        
        lblTextoIntro.setText("<html><br>&nbsp;<font color=#99FF99>Para vanzanzar con la historia basta con presionar<p>el boton siguiente, esperamos que lo pases de lo<p>mejor!... Suerte en la aventura!...</font><br></html>");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        btnAtacar = new javax.swing.JButton();
        btnHuir = new javax.swing.JButton();
        btnObservar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        lblHistoria = new javax.swing.JLabel();
        lblNumeroNivel = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblImagenObjeto = new javax.swing.JLabel();
        PbExperiencia = new javax.swing.JProgressBar();
        lblExperiencia = new javax.swing.JLabel();
        lblVida = new javax.swing.JLabel();
        PbVida = new javax.swing.JProgressBar();
        lblEnLaMira = new javax.swing.JLabel();
        lblDefensa = new javax.swing.JLabel();
        lblGolpe = new javax.swing.JLabel();
        lblNumeroGolpe = new javax.swing.JLabel();
        lblNumeroDefensa1 = new javax.swing.JLabel();
        lblTextoIntro = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        btnVolver.setText("Salir");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(680, 540, 70, 23);

        btnAtacar.setText("Atacar");
        getContentPane().add(btnAtacar);
        btnAtacar.setBounds(340, 540, 80, 23);

        btnHuir.setText("Huir");
        getContentPane().add(btnHuir);
        btnHuir.setBounds(440, 540, 80, 23);

        btnObservar.setText("Ver");
        getContentPane().add(btnObservar);
        btnObservar.setBounds(240, 540, 80, 23);

        btnSiguiente.setText("Siguiente >>");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente);
        btnSiguiente.setBounds(390, 40, 95, 23);

        lblHistoria.setBackground(new java.awt.Color(0, 0, 0));
        lblHistoria.setForeground(new java.awt.Color(255, 255, 255));
        lblHistoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHistoria.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblHistoria.setAutoscrolls(true);
        lblHistoria.setOpaque(true);
        getContentPane().add(lblHistoria);
        lblHistoria.setBounds(12, 88, 506, 437);

        lblNumeroNivel.setBackground(new java.awt.Color(153, 153, 153));
        lblNumeroNivel.setFont(new java.awt.Font("TlwgMono", 1, 36)); // NOI18N
        lblNumeroNivel.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblNumeroNivel);
        lblNumeroNivel.setBounds(733, 35, 39, 35);

        lblNivel.setFont(new java.awt.Font("TlwgMono", 1, 18)); // NOI18N
        lblNivel.setForeground(new java.awt.Color(255, 255, 255));
        lblNivel.setText("Nivel:");
        getContentPane().add(lblNivel);
        lblNivel.setBounds(663, 44, 68, 24);

        lblDescripcion.setBackground(new java.awt.Color(51, 51, 51));
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        lblDescripcion.setOpaque(true);
        getContentPane().add(lblDescripcion);
        lblDescripcion.setBounds(580, 340, 202, 180);

        lblImagenObjeto.setBackground(new java.awt.Color(255, 255, 255));
        lblImagenObjeto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(lblImagenObjeto);
        lblImagenObjeto.setBounds(700, 250, 80, 80);

        PbExperiencia.setForeground(new java.awt.Color(0, 102, 102));
        PbExperiencia.setToolTipText("");
        PbExperiencia.setValue(35);
        PbExperiencia.setStringPainted(true);
        getContentPane().add(PbExperiencia);
        PbExperiencia.setBounds(560, 150, 210, 17);

        lblExperiencia.setForeground(new java.awt.Color(255, 255, 255));
        lblExperiencia.setText("Experiencia");
        getContentPane().add(lblExperiencia);
        lblExperiencia.setBounds(560, 130, 90, 14);

        lblVida.setFont(new java.awt.Font("TlwgMono", 1, 18)); // NOI18N
        lblVida.setForeground(new java.awt.Color(255, 255, 255));
        lblVida.setText("Vida");
        getContentPane().add(lblVida);
        lblVida.setBounds(30, 543, 51, 15);

        PbVida.setForeground(new java.awt.Color(102, 0, 0));
        PbVida.setValue(90);
        PbVida.setStringPainted(true);
        getContentPane().add(PbVida);
        PbVida.setBounds(80, 540, 140, 17);

        lblEnLaMira.setFont(new java.awt.Font("TlwgMono", 1, 16)); // NOI18N
        lblEnLaMira.setForeground(new java.awt.Color(255, 255, 255));
        lblEnLaMira.setText("En la Mira: ");
        getContentPane().add(lblEnLaMira);
        lblEnLaMira.setBounds(580, 310, 140, 21);

        lblDefensa.setForeground(new java.awt.Color(255, 255, 255));
        lblDefensa.setText("Defensa:");
        getContentPane().add(lblDefensa);
        lblDefensa.setBounds(560, 180, 70, 14);

        lblGolpe.setForeground(new java.awt.Color(255, 255, 255));
        lblGolpe.setText("Golpe:");
        getContentPane().add(lblGolpe);
        lblGolpe.setBounds(670, 180, 60, 14);

        lblNumeroGolpe.setBackground(new java.awt.Color(0, 0, 0));
        lblNumeroGolpe.setForeground(new java.awt.Color(204, 0, 0));
        lblNumeroGolpe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroGolpe.setText("10/50");
        lblNumeroGolpe.setOpaque(true);
        getContentPane().add(lblNumeroGolpe);
        lblNumeroGolpe.setBounds(720, 180, 55, 20);

        lblNumeroDefensa1.setBackground(new java.awt.Color(0, 0, 0));
        lblNumeroDefensa1.setForeground(new java.awt.Color(0, 153, 0));
        lblNumeroDefensa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroDefensa1.setText("50");
        lblNumeroDefensa1.setOpaque(true);
        getContentPane().add(lblNumeroDefensa1);
        lblNumeroDefensa1.setBounds(630, 180, 30, 20);

        lblTextoIntro.setForeground(new java.awt.Color(102, 255, 102));
        lblTextoIntro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTextoIntro.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblTextoIntro);
        lblTextoIntro.setBounds(10, 10, 370, 70);

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(560, 90, 230, 30);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/tablero.jpg"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnAtacar() {
        return btnAtacar;
    }

    public void setBtnAtacar(JButton btnAtacar) {
        this.btnAtacar = btnAtacar;
    }

    public JButton getBtnHuir() {
        return btnHuir;
    }

    public void setBtnHuir(JButton btnHuir) {
        this.btnHuir = btnHuir;
    }

    public JButton getBtnObservar() {
        return btnObservar;
    }

    public void setBtnObservar(JButton btnObservar) {
        this.btnObservar = btnObservar;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }

    public JLabel getLblHistoria() {
        return lblHistoria;
    }

    public void setLblHistoria(JLabel lblHistoria) {
        this.lblHistoria = lblHistoria;
    }

    public JLabel getLblNivel() {
        return lblNivel;
    }

    public void setLblNivel(JLabel lblNivel) {
        this.lblNivel = lblNivel;
    }



    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:

        Main jFrame = new Main();//"Frame2" es el nombre que  le pusiste a tu 2do jframe

        jFrame.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:

        lblTextoIntro.setVisible(false);
        lblHistoria.setText("<html><font color=#ffffff> <style= text-align: justify> <br>‘Todos los niños van al cielo’ le había dicho su madre poco tiempo"
                + " antes de morir, ‘y te prometo que yo también estaré ahí y cuidaré de tu hermanito."
                + " Y juntos vendremos a buscarte pronto’. Es difícil para un niño de seis años aceptar"
                + " que su madre ya no estará a su lado, pero más aún comprender que algo llamado muerte"
                + " sea el responsable de arrebatarle todo lo que le hacía bien: primero su hermanito, "
                + " que nunca llegó a nacer, y poquitísimo tiempo después a su madre.</style></font></html>");


    }//GEN-LAST:event_btnSiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar PbExperiencia;
    private javax.swing.JProgressBar PbVida;
    private javax.swing.JButton btnAtacar;
    private javax.swing.JButton btnHuir;
    private javax.swing.JButton btnObservar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblDefensa;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEnLaMira;
    private javax.swing.JLabel lblExperiencia;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGolpe;
    private javax.swing.JLabel lblHistoria;
    private javax.swing.JLabel lblImagenObjeto;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNumeroDefensa1;
    private javax.swing.JLabel lblNumeroGolpe;
    private javax.swing.JLabel lblNumeroNivel;
    private javax.swing.JLabel lblTextoIntro;
    private javax.swing.JLabel lblVida;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
