/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menues;

import Controlador.ControladorPersonaje;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static javax.swing.SwingConstants.VERTICAL;

/**
 *
 * @author prouser
 */
public class PantallaJuego extends javax.swing.JFrame {

    private final String ruta = System.getProperties().getProperty("user.dir");
    protected ControladorPersonaje controladorPersonaje;

    public PantallaJuego(ControladorPersonaje controladorPersonaje) {

        initComponents();

        this.getContentPane().setBackground(Color.BLACK);
        
        
        this.setSize(800 , 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(PantallaJuego.EXIT_ON_CLOSE);

        txtpHistoria.setForeground(Color.RED);

        txtpHistoria.setText("Felicitaciones " + controladorPersonaje.getPersonaje1().getClase() + " " + controladorPersonaje.getPersonaje1().getNombre()
                + "!, ya eres parte de esta historia... "
                + "Para comenzar basta con presionar el boton 'Siguiente >>' en"
                + " la parte inferior derecha de la pantalla, "
                + "esperamos que lo pases de lo mejor!... Suerte en la aventura...");

        lblNombre.setText(controladorPersonaje.getPersonaje1().getNombre());
        lblNumeroNivel.setText(String.valueOf(controladorPersonaje.getPersonaje1().getNivel()));
        lblNumeroDefensa1.setText(String.valueOf(controladorPersonaje.getPersonaje1().getDefensa()));
        lblNumeroGolpe.setText(String.valueOf(controladorPersonaje.getPersonaje1().getGolpeMin()) + "/" + String.valueOf(controladorPersonaje.getPersonaje1().getGolpeMax()));

        PbVida.setValue(controladorPersonaje.getPersonaje1().getVidaMax()); //Setea como maximo de la barra la vida actual del personaje
        PbVida.setMaximum(controladorPersonaje.getPersonaje1().getVidaMax());

        PbExperiencia.setValue(controladorPersonaje.getPersonaje1().getExpMin());

        txtpHistoria.setEditable(false);
        txtpHistoria.setBackground(Color.BLACK);
        txtpHistoria.setBorder(null);

        PbVida.setOrientation(VERTICAL);
        PbExperiencia.setOrientation(VERTICAL);

        btnAtacar.setVisible(false);
        btnHuir.setVisible(false);
        btnObservar.setVisible(false);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumeroPociones = new javax.swing.JLabel();
        btnRegenera = new javax.swing.JButton();
        lblCuracion = new javax.swing.JLabel();
        lblExperiencia = new javax.swing.JLabel();
        lblVida = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnAtacar = new javax.swing.JButton();
        btnHuir = new javax.swing.JButton();
        btnObservar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblfondoNombre = new javax.swing.JLabel();
        lblNumeroNivel = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblImagenPj = new javax.swing.JLabel();
        PbExperiencia = new javax.swing.JProgressBar();
        PbVida = new javax.swing.JProgressBar();
        lblDefensa = new javax.swing.JLabel();
        lblGolpe = new javax.swing.JLabel();
        lblNumeroGolpe = new javax.swing.JLabel();
        lblNumeroDefensa1 = new javax.swing.JLabel();
        btnGolpe = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtpHistoria = new javax.swing.JTextPane();
        lblFotos = new javax.swing.JLabel();
        lblImagenObjeto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        lblNumeroPociones.setBackground(new java.awt.Color(0, 0, 0));
        lblNumeroPociones.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroPociones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroPociones.setText("10");
        lblNumeroPociones.setOpaque(true);
        getContentPane().add(lblNumeroPociones);
        lblNumeroPociones.setBounds(760, 170, 20, 20);

        btnRegenera.setBackground(new java.awt.Color(255, 255, 255));
        btnRegenera.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnRegenera.setForeground(new java.awt.Color(255, 0, 0));
        btnRegenera.setText("+");
        btnRegenera.setBorderPainted(false);
        btnRegenera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegeneraActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegenera);
        btnRegenera.setBounds(700, 180, 50, 10);

        lblCuracion.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblCuracion.setForeground(new java.awt.Color(255, 255, 255));
        lblCuracion.setText("Curación");
        getContentPane().add(lblCuracion);
        lblCuracion.setBounds(700, 165, 60, 14);

        lblExperiencia.setBackground(new java.awt.Color(0, 0, 0));
        lblExperiencia.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblExperiencia.setForeground(new java.awt.Color(255, 255, 255));
        lblExperiencia.setText("Exp");
        getContentPane().add(lblExperiencia);
        lblExperiencia.setBounds(753, 350, 30, 20);

        lblVida.setBackground(new java.awt.Color(0, 0, 0));
        lblVida.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblVida.setForeground(new java.awt.Color(255, 255, 255));
        lblVida.setText("Vida");
        getContentPane().add(lblVida);
        lblVida.setBounds(700, 350, 30, 20);

        btnVolver.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(204, 204, 204));
        btnVolver.setText("Menú");
        btnVolver.setBorderPainted(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(720, 16, 60, 10);

        btnAtacar.setBackground(new java.awt.Color(51, 0, 0));
        btnAtacar.setForeground(new java.awt.Color(204, 0, 0));
        btnAtacar.setText("Atacar");
        btnAtacar.setBorderPainted(false);
        btnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtacar);
        btnAtacar.setBounds(500, 500, 80, 23);

        btnHuir.setBackground(new java.awt.Color(0, 51, 0));
        btnHuir.setForeground(new java.awt.Color(51, 204, 0));
        btnHuir.setText("Huir");
        btnHuir.setBorderPainted(false);
        getContentPane().add(btnHuir);
        btnHuir.setBounds(600, 500, 80, 23);

        btnObservar.setBackground(new java.awt.Color(0, 51, 51));
        btnObservar.setForeground(new java.awt.Color(0, 102, 204));
        btnObservar.setText("Ver");
        btnObservar.setBorderPainted(false);
        getContentPane().add(btnObservar);
        btnObservar.setBounds(700, 500, 80, 23);

        btnSiguiente.setBackground(new java.awt.Color(177, 151, 75));

        btnSiguiente.setText("Siguiente >>");
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente);
        btnSiguiente.setBounds(500, 530, 280, 20);

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Damian");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(700, 140, 80, 20);

        lblfondoNombre.setBackground(new java.awt.Color(0, 0, 0));
        lblfondoNombre.setOpaque(true);
        getContentPane().add(lblfondoNombre);
        lblfondoNombre.setBounds(700, 140, 80, 20);

        lblNumeroNivel.setBackground(new java.awt.Color(153, 153, 153));
        lblNumeroNivel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNumeroNivel.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroNivel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumeroNivel.setText("10");
        getContentPane().add(lblNumeroNivel);
        lblNumeroNivel.setBounds(750, 40, 30, 20);

        lblNivel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblNivel.setForeground(new java.awt.Color(255, 255, 255));
        lblNivel.setText("Nivel:");
        getContentPane().add(lblNivel);
        lblNivel.setBounds(700, 40, 68, 20);

        lblDescripcion.setBackground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(153, 153, 153))); // NOI18N
        lblDescripcion.setOpaque(true);
        getContentPane().add(lblDescripcion);
        lblDescripcion.setBounds(500, 390, 180, 100);

        lblImagenPj.setBackground(new java.awt.Color(0, 0, 0));
        lblImagenPj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenPj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/raininghelm.gif"))); // NOI18N
        lblImagenPj.setOpaque(true);
        lblImagenPj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImagenPjMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagenPjMouseClicked(evt);
            }
        });
        getContentPane().add(lblImagenPj);
        lblImagenPj.setBounds(700, 60, 80, 80);

        PbExperiencia.setForeground(new java.awt.Color(0, 102, 153));
        PbExperiencia.setToolTipText("");
        PbExperiencia.setValue(50);
        PbExperiencia.setBorderPainted(false);
        PbExperiencia.setStringPainted(true);
        getContentPane().add(PbExperiencia);
        PbExperiencia.setBounds(750, 260, 30, 90);

        PbVida.setForeground(new java.awt.Color(153, 0, 0));
        PbVida.setToolTipText("");
        PbVida.setValue(50);
        PbVida.setBorderPainted(false);
        PbVida.setStringPainted(true);
        PbVida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PbVidaMouseClicked(evt);
            }
        });
        getContentPane().add(PbVida);
        PbVida.setBounds(700, 260, 30, 90);

        lblDefensa.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblDefensa.setForeground(new java.awt.Color(255, 255, 255));
        lblDefensa.setText("Defensa:");
        getContentPane().add(lblDefensa);
        lblDefensa.setBounds(700, 202, 60, 14);

        lblGolpe.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblGolpe.setForeground(new java.awt.Color(255, 255, 255));
        lblGolpe.setText("Golpe:");
        getContentPane().add(lblGolpe);
        lblGolpe.setBounds(700, 233, 32, 14);

        lblNumeroGolpe.setBackground(new java.awt.Color(0, 0, 0));
        lblNumeroGolpe.setForeground(new java.awt.Color(204, 0, 0));
        lblNumeroGolpe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroGolpe.setText("10/50");
        lblNumeroGolpe.setOpaque(true);
        getContentPane().add(lblNumeroGolpe);
        lblNumeroGolpe.setBounds(740, 230, 40, 20);

        lblNumeroDefensa1.setBackground(new java.awt.Color(0, 0, 0));
        lblNumeroDefensa1.setForeground(new java.awt.Color(0, 102, 153));
        lblNumeroDefensa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroDefensa1.setText("3");
        lblNumeroDefensa1.setOpaque(true);
        getContentPane().add(lblNumeroDefensa1);
        lblNumeroDefensa1.setBounds(760, 200, 20, 20);

        btnGolpe.setBackground(new java.awt.Color(204, 0, 0));
        btnGolpe.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnGolpe.setForeground(new java.awt.Color(255, 255, 255));
        btnGolpe.setBorderPainted(false);
        btnGolpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGolpeActionPerformed(evt);
            }
        });
        getContentPane().add(btnGolpe);
        btnGolpe.setBounds(690, 16, 20, 10);

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setForeground(new java.awt.Color(153, 204, 0));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("");
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setAutoscrolls(true);

        txtpHistoria.setEditable(false);
        txtpHistoria.setBackground(new java.awt.Color(0, 0, 0));
        txtpHistoria.setBorder(null);
        txtpHistoria.setForeground(new java.awt.Color(255, 0, 0));
        txtpHistoria.setMargin(new java.awt.Insets(5, 5, 5, 5));
        txtpHistoria.setSelectionColor(new java.awt.Color(102, 255, 102));
        jScrollPane2.setViewportView(txtpHistoria);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 390, 460, 160);

        lblFotos.setBackground(new java.awt.Color(0, 0, 0));
        lblFotos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFotos.setOpaque(true);
        getContentPane().add(lblFotos);
        lblFotos.setBounds(40, 60, 610, 280);

        lblImagenObjeto.setBackground(new java.awt.Color(0, 0, 0));
        lblImagenObjeto.setOpaque(true);
        getContentPane().add(lblImagenObjeto);
        lblImagenObjeto.setBounds(700, 390, 80, 100);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(16, 40, 660, 320);

        jLabel3.setBackground(new java.awt.Color(255, 204, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/base.jpg"))); // NOI18N
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 370, 800, 210);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/barra.jpg"))); // NOI18N
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 10, 800, 20);

        lblFondo.setBackground(new java.awt.Color(102, 102, 102));
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/orig_92048.jpg"))); // NOI18N
        lblFondo.setOpaque(true);
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        MenuSalir menuSalir = new MenuSalir();

        menuSalir.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        incrementaTexto();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void PbVidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PbVidaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PbVidaMouseClicked

    private void btnGolpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGolpeActionPerformed

        golpe();
    }//GEN-LAST:event_btnGolpeActionPerformed

    int pociones = 10; // Damos 10 pociones iniciales

    private void btnRegeneraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegeneraActionPerformed

        lblNumeroPociones.setText(String.valueOf(pociones));

        if (pociones > 0) {

            pociones--;
            regenera();
        } else {

            lblDescripcion.setText("<html><font color=ff0000> No hay mas pociones!</font></html>");
        }
    }//GEN-LAST:event_btnRegeneraActionPerformed
   
    int contador = 0;
    
    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked

        contador++;

        System.out.println("Contador: " + contador);

        switch (contador) {
            case 1:
                lblFotos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/im5.jpeg")));
                break;
            case 2:
                lblFotos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/payaso.jpg")));
                break;
            case 3:
                lblFotos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/im4.jpg")));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed
 
    
    
    }//GEN-LAST:event_btnAtacarActionPerformed

    private void lblImagenPjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenPjMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImagenPjMouseClicked

    private void lblImagenPjMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenPjMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImagenPjMousePressed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PantallaJuego().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar PbExperiencia;
    public javax.swing.JProgressBar PbVida;
    private javax.swing.JButton btnAtacar;
    private javax.swing.JButton btnGolpe;
    private javax.swing.JButton btnHuir;
    private javax.swing.JButton btnObservar;
    private javax.swing.JButton btnRegenera;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCuracion;
    private javax.swing.JLabel lblDefensa;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblExperiencia;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFotos;
    private javax.swing.JLabel lblGolpe;
    private javax.swing.JLabel lblImagenObjeto;
    private javax.swing.JLabel lblImagenPj;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroDefensa1;
    private javax.swing.JLabel lblNumeroGolpe;
    private javax.swing.JLabel lblNumeroNivel;
    private javax.swing.JLabel lblNumeroPociones;
    private javax.swing.JLabel lblVida;
    private javax.swing.JLabel lblfondoNombre;
    private javax.swing.JTextPane txtpHistoria;
    // End of variables declaration//GEN-END:variables

    private void golpe() {

        int max = 5;
        int min = 1;
        PbVida.setValue((int) (PbVida.getValue() - Math.floor((Math.random() * max) + min)));
    }

    private void regenera() {

        int pociones = 10;

        int max = 3;
        int min = 1;

        if (pociones > 0) {

            PbVida.setValue((int) (PbVida.getValue() + Math.floor((Math.random() * max) + min)));
        } else {

            PbVida.setValue(PbVida.getValue() + 0);
        }
    }

    public void incrementaTexto() {

        txtpHistoria.setForeground(Color.WHITE);

        //Lectura de txt y set en lblHistoria
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(ruta + "//archivo.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            linea = br.readLine();

            String acu = "";

            String datosSeparados[] = linea.split("<s>");
            String datoLimpio = datosSeparados[contador];

            acu += datoLimpio;

            String replace = acu.replace("NPC", "Preparate para el combate!! Criatura Nivel ");

            txtpHistoria.setText(replace);

            if (acu.contains("NPC")) {

                txtpHistoria.setForeground(Color.RED);

                btnAtacar.setVisible(true);
                btnHuir.setVisible(true);
                btnObservar.setVisible(true);
            } else {

                txtpHistoria.setForeground(Color.WHITE);

                btnAtacar.setVisible(false);
                btnHuir.setVisible(false);
                btnObservar.setVisible(false);
            }

            if (datoLimpio.contains("NPC1")) {

                System.out.println("Llamamos combate con Npc Nivel 1");
            } else {
            }

        } catch (IOException e) {
        } finally {
            
            try {
                if (null != fr) {
                    fr.close();

                }
            } catch (IOException e2) {
            }
        }
    }


    
   
       
}
