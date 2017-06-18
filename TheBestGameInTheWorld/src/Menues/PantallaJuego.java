/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menues;

import Controlador.ControladorPersonaje;
import Modelo.Combate;
import Modelo.Hostil;
import Modelo.Personaje;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import static javax.swing.SwingConstants.VERTICAL;

/**
 *
 * @author prouser
 */
public class PantallaJuego extends javax.swing.JFrame {
    
    private final String ruta = System.getProperties().getProperty("user.dir");
    protected ControladorPersonaje controladorPersonaje;
    protected Hostil hostil;
    protected Personaje personaje;
    Combate combate = null;
    
    private final JFXPanel jfxPanel = new JFXPanel();
    Clip sonido = null;
    
    public PantallaJuego(ControladorPersonaje controladorPersonaje) {

        initComponents();

        lblmenu.setVisible(false);
        btnSalir.setVisible(false);
        btbConfiguraciones.setVisible(false);
        lblseguro.setVisible(false);
        btnSi.setVisible(false);
        btnVolveralJuego.setVisible(false);

        jPanel1.setSize(800, 600);
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(jfxPanel, BorderLayout.CENTER);

        //VIDEO
        Platform.runLater(() -> {
            File file = new File("src/Menues/Videos/pantallajuego.mp4");
            MediaPlayer oracleVid = new MediaPlayer(
                    new Media(file.toURI().toString())
            );

            //se añade video al jfxPanel
            jfxPanel.setScene(new Scene(new Group(new MediaView(oracleVid))));
            oracleVid.setVolume(1);//volumen
            oracleVid.setCycleCount(MediaPlayer.INDEFINITE);//repite video
            oracleVid.play();//play video
        });
        //FIN VIDEO    

        this.getContentPane().setBackground(Color.BLACK);

        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(PantallaJuego.EXIT_ON_CLOSE);

        lblTextoHistoria.setText("<HTML><BODY>Felicitaciones " + controladorPersonaje.getPersonaje1().getClase() + " " + controladorPersonaje.getPersonaje1().getNombre()
                + "!, ya eres parte de esta historia... "
                + "Para comenzar basta con presionar el boton SIGUIENTE en"
                + " la parte superior derecha del libro, "
                + "esperamos que lo pases de lo mejor!... Suerte en la aventura...</BODY></HTML>");
        
        lblNombre.setText(ControladorPersonaje.getPersonaje1().getNombre());
        lblNumeroNivel.setText(String.valueOf(controladorPersonaje.getPersonaje1().getNivel()));
        lblNumeroDefensa1.setText(String.valueOf(controladorPersonaje.getPersonaje1().getDefensa()));
        lblNumeroGolpe.setText(String.valueOf(ControladorPersonaje.getPersonaje1().getGolpeMin()) + "/" + String.valueOf(ControladorPersonaje.getPersonaje1().getGolpeMax()));

        PbVida.setForeground(Color.RED);
        PbVida.setValue(ControladorPersonaje.getPersonaje1().getVida()); //Setea como maximo de la barra la vida actual del personaje
        PbVida.setMaximum(ControladorPersonaje.getPersonaje1().getVidaMax());

        PbExperiencia.setValue(controladorPersonaje.getPersonaje1().getExp());

        PbVida.setOrientation(VERTICAL);

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

        jPanel1 = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        lblPrueba = new javax.swing.JLabel();
        lblFotos = new javax.swing.JLabel();
        lblNumeroPociones = new javax.swing.JLabel();
        lblCuracion = new javax.swing.JLabel();
        PbExperiencia = new javax.swing.JProgressBar();
        PbVida = new javax.swing.JProgressBar();
        termometro = new javax.swing.JLabel();
        lblNumeroDefensa1 = new javax.swing.JLabel();
        lblNumeroGolpe = new javax.swing.JLabel();
        lblNumeroNivel = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblAnotaciones = new javax.swing.JLabel();
        btnSi = new javax.swing.JButton();
        lblPluma = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btbConfiguraciones = new javax.swing.JButton();
        btnVolveralJuego = new javax.swing.JButton();
        lblseguro = new javax.swing.JLabel();
        lblmenu = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        btnAtacar = new javax.swing.JButton();
        btnHuir = new javax.swing.JButton();
        btnObservar = new javax.swing.JButton();
        lblBotiquin = new javax.swing.JLabel();
        lblFondoCuraciones = new javax.swing.JLabel();
        lblTextoHistoria = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblImagenObjeto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

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
        jPanel1.add(btnSiguiente);
        btnSiguiente.setBounds(510, 50, 140, 20);

        lblPrueba.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPrueba.setForeground(new java.awt.Color(255, 255, 255));
        lblPrueba.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrueba.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblPrueba);
        lblPrueba.setBounds(420, 360, 190, 120);

        lblFotos.setBackground(new java.awt.Color(0, 0, 0));
        lblFotos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblFotos);
        lblFotos.setBounds(410, 60, 230, 400);

        lblNumeroPociones.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNumeroPociones.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroPociones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroPociones.setText("10");
        jPanel1.add(lblNumeroPociones);
        lblNumeroPociones.setBounds(70, 500, 20, 20);

        lblCuracion.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblCuracion.setForeground(new java.awt.Color(255, 255, 255));
        lblCuracion.setText("Curaciones");
        jPanel1.add(lblCuracion);
        lblCuracion.setBounds(12, 503, 60, 14);

        PbExperiencia.setBackground(new java.awt.Color(0, 0, 0));
        PbExperiencia.setForeground(new java.awt.Color(153, 153, 153));
        PbExperiencia.setToolTipText("");
        PbExperiencia.setValue(50);
        PbExperiencia.setBorderPainted(false);
        jPanel1.add(PbExperiencia);
        PbExperiencia.setBounds(120, 460, 240, 10);

        PbVida.setForeground(new java.awt.Color(204, 0, 0));
        PbVida.setToolTipText("");
        PbVida.setValue(50);
        PbVida.setBorderPainted(false);
        PbVida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PbVida.setName(""); // NOI18N
        PbVida.setOpaque(true);
        PbVida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PbVidaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PbVidaMouseExited(evt);
            }
        });
        jPanel1.add(PbVida);
        PbVida.setBounds(37, 243, 8, 140);

        termometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/vida.png"))); // NOI18N
        termometro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                termometroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                termometroMouseExited(evt);
            }
        });
        jPanel1.add(termometro);
        termometro.setBounds(20, 170, 50, 260);

        lblNumeroDefensa1.setBackground(new java.awt.Color(0, 0, 0));
        lblNumeroDefensa1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblNumeroDefensa1.setForeground(new java.awt.Color(0, 102, 153));
        lblNumeroDefensa1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNumeroDefensa1.setText("3");
        jPanel1.add(lblNumeroDefensa1);
        lblNumeroDefensa1.setBounds(720, 462, 20, 20);

        lblNumeroGolpe.setBackground(new java.awt.Color(0, 0, 0));
        lblNumeroGolpe.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNumeroGolpe.setForeground(new java.awt.Color(204, 0, 0));
        lblNumeroGolpe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNumeroGolpe.setText("10/50");
        jPanel1.add(lblNumeroGolpe);
        lblNumeroGolpe.setBounds(720, 435, 40, 20);

        lblNumeroNivel.setBackground(new java.awt.Color(153, 153, 153));
        lblNumeroNivel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNumeroNivel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNumeroNivel.setText("10");
        jPanel1.add(lblNumeroNivel);
        lblNumeroNivel.setBounds(720, 406, 30, 20);

        lblNombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre.setText("Damian");
        jPanel1.add(lblNombre);
        lblNombre.setBounds(720, 378, 80, 20);

        lblAnotaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/anotaciones.png"))); // NOI18N
        jPanel1.add(lblAnotaciones);
        lblAnotaciones.setBounds(580, 320, 220, 190);

        btnSi.setBackground(new java.awt.Color(51, 102, 0));
        btnSi.setForeground(new java.awt.Color(255, 255, 255));
        btnSi.setText("Si");
        btnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiActionPerformed(evt);
            }
        });
        jPanel1.add(btnSi);
        btnSi.setBounds(490, 570, 50, 23);

        lblPluma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/plumachica.png"))); // NOI18N
        lblPluma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlumaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPlumaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPlumaMouseExited(evt);
            }
        });
        jPanel1.add(lblPluma);
        lblPluma.setBounds(504, 450, 296, 150);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(10, 570, 120, 23);

        btbConfiguraciones.setText("Configuraciones");
        btbConfiguraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbConfiguracionesActionPerformed(evt);
            }
        });
        jPanel1.add(btbConfiguraciones);
        btbConfiguraciones.setBounds(10, 540, 120, 23);

        btnVolveralJuego.setText("Volver al Juego");
        btnVolveralJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolveralJuegoActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolveralJuego);
        btnVolveralJuego.setBounds(140, 570, 150, 23);

        lblseguro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblseguro.setForeground(new java.awt.Color(255, 255, 255));
        lblseguro.setText("Seguro quieres salir del Juego?");
        jPanel1.add(lblseguro);
        lblseguro.setBounds(295, 570, 210, 25);

        lblmenu.setBackground(new java.awt.Color(0, 0, 0));
        lblmenu.setOpaque(true);
        jPanel1.add(lblmenu);
        lblmenu.setBounds(0, 533, 800, 67);

        lblDescripcion.setBackground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(153, 153, 153))); // NOI18N
        lblDescripcion.setOpaque(true);
        jPanel1.add(lblDescripcion);
        lblDescripcion.setBounds(120, 540, 400, 50);

        btnAtacar.setBackground(new java.awt.Color(51, 0, 0));
        btnAtacar.setForeground(new java.awt.Color(204, 0, 0));
        btnAtacar.setText("Atacar");
        btnAtacar.setBorderPainted(false);
        btnAtacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtacarMouseClicked(evt);
            }
        });
        btnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtacar);
        btnAtacar.setBounds(110, 500, 80, 23);

        btnHuir.setBackground(new java.awt.Color(0, 51, 0));
        btnHuir.setForeground(new java.awt.Color(51, 204, 0));
        btnHuir.setText("Huir");
        btnHuir.setBorderPainted(false);
        jPanel1.add(btnHuir);
        btnHuir.setBounds(200, 500, 80, 23);

        btnObservar.setBackground(new java.awt.Color(0, 51, 51));
        btnObservar.setForeground(new java.awt.Color(0, 102, 204));
        btnObservar.setText("Ver");
        btnObservar.setBorderPainted(false);
        jPanel1.add(btnObservar);
        btnObservar.setBounds(290, 500, 80, 23);

        lblBotiquin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/botiquin.png"))); // NOI18N
        lblBotiquin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotiquinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBotiquinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBotiquinMouseExited(evt);
            }
        });
        jPanel1.add(lblBotiquin);
        lblBotiquin.setBounds(-20, 380, 118, 120);

        lblFondoCuraciones.setBackground(new java.awt.Color(0, 0, 0));
        lblFondoCuraciones.setOpaque(true);
        jPanel1.add(lblFondoCuraciones);
        lblFondoCuraciones.setBounds(10, 500, 80, 20);

        lblTextoHistoria.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTextoHistoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTextoHistoria.setToolTipText("");
        lblTextoHistoria.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblTextoHistoria);
        lblTextoHistoria.setBounds(130, 60, 230, 370);

        jLabel1.setText("Experiencia");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(124, 445, 80, 14);

        lblImagenObjeto.setBackground(new java.awt.Color(0, 0, 0));
        lblImagenObjeto.setOpaque(true);
        jPanel1.add(lblImagenObjeto);
        lblImagenObjeto.setBounds(700, 380, 80, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        incrementaTexto();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void PbVidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PbVidaMouseClicked

    }//GEN-LAST:event_PbVidaMouseClicked

    int pociones = 10; // Damos 10 pociones iniciales

    int contador = 0;

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
        contador++;

        System.out.println("Contador: " + contador);

        switch (contador) {
            case 1:
                lblFotos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/imagen1.png")));
                break;
            case 2:
                lblFotos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/imagen1.png")));
                break;
            case 3:
                lblFotos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/imagen2.png")));
                break;
            case 4:
                lblFotos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/imagen3.png")));
                break;       
                
            default:
                break;
        }
    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed
        
        combate.pelea(this, controladorPersonaje);
    }//GEN-LAST:event_btnAtacarActionPerformed

    private void lblBotiquinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotiquinMouseEntered
        lblBotiquin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/botiquin2.png")));
        lblDescripcion.setText("<html><font color=00FF00> Click para usar botiquin, esto regenerará tu salud...</font></html>");
    }//GEN-LAST:event_lblBotiquinMouseEntered

    private void lblBotiquinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotiquinMouseExited
        lblBotiquin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/botiquin.png")));
        lblDescripcion.setText("");
    }//GEN-LAST:event_lblBotiquinMouseExited

    private void lblPlumaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlumaMouseEntered
        lblPluma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/pluma.png")));
        lblDescripcion.setText("<html><font color=00FF00> Ingresa al menu del juego...</font></html>");
    }//GEN-LAST:event_lblPlumaMouseEntered

    private void lblPlumaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlumaMouseExited
        lblPluma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menues/Imagenes/plumachica.png")));
        lblDescripcion.setText("");
    }//GEN-LAST:event_lblPlumaMouseExited

    private void lblBotiquinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotiquinMouseClicked
        lblNumeroPociones.setText(String.valueOf(pociones));

        if (pociones > 0) {
            
            pociones--;
            regenera();
            
        } else {

            lblDescripcion.setText("<html><font color=ff0000> No hay mas pociones!</font></html>");
        }
    }//GEN-LAST:event_lblBotiquinMouseClicked

    private void lblPlumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlumaMouseClicked
        lblmenu.setVisible(true);
        btnSalir.setVisible(true);
        btbConfiguraciones.setVisible(true);
        lblDescripcion.setVisible(false);
        btnVolveralJuego.setVisible(true);
    }//GEN-LAST:event_lblPlumaMouseClicked

    private void termometroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_termometroMouseEntered
        lblDescripcion.setText("<html><font color=FF0000>Muestra la vida de tu personaje.</font></html>");
    }//GEN-LAST:event_termometroMouseEntered

    private void PbVidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PbVidaMouseExited

    }//GEN-LAST:event_PbVidaMouseExited

    private void termometroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_termometroMouseExited
        lblDescripcion.setText("");
    }//GEN-LAST:event_termometroMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            sonido = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sonido.open(AudioSystem.getAudioInputStream(new File("src/Menues/Sonidos/juego.wav")));
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        FloatControl gainControl = (FloatControl) sonido.getControl(FloatControl.Type.MASTER_GAIN);
        gainControl.setValue(-10.0f); //BAJAMOS EL VOLUMEN ORIGINAL 10 deciveles
        sonido.start();
        sonido.loop(sonido.LOOP_CONTINUOUSLY);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus

    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void btbConfiguracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbConfiguracionesActionPerformed

    }//GEN-LAST:event_btbConfiguracionesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        lblseguro.setVisible(true);
        btbConfiguraciones.setVisible(false);
        btnSi.setVisible(true);
        btnVolveralJuego.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVolveralJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolveralJuegoActionPerformed
        lblmenu.setVisible(false);
        btnSalir.setVisible(false);
        btbConfiguraciones.setVisible(false);
        lblseguro.setVisible(false);
        btnSi.setVisible(false);
        btnVolveralJuego.setVisible(false);
        lblDescripcion.setVisible(true);
    }//GEN-LAST:event_btnVolveralJuegoActionPerformed

    private void btnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiActionPerformed
        try {
            Main pantalla = new Main();

            pantalla.setVisible(true);
            sonido.stop();

            this.dispose();
        } catch (LineUnavailableException | URISyntaxException | UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(PantallaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSiActionPerformed

    private void btnAtacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtacarMouseClicked
 
    }//GEN-LAST:event_btnAtacarMouseClicked

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
    public javax.swing.JProgressBar PbExperiencia;
    public javax.swing.JProgressBar PbVida;
    private javax.swing.JButton btbConfiguraciones;
    public javax.swing.JButton btnAtacar;
    public javax.swing.JButton btnHuir;
    public static javax.swing.JButton btnObservar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSi;
    public static javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVolveralJuego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAnotaciones;
    private javax.swing.JLabel lblBotiquin;
    private javax.swing.JLabel lblCuracion;
    public javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFondoCuraciones;
    private javax.swing.JLabel lblFotos;
    private javax.swing.JLabel lblImagenObjeto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroDefensa1;
    private javax.swing.JLabel lblNumeroGolpe;
    private javax.swing.JLabel lblNumeroNivel;
    private javax.swing.JLabel lblNumeroPociones;
    private javax.swing.JLabel lblPluma;
    public javax.swing.JLabel lblPrueba;
    public javax.swing.JLabel lblTextoHistoria;
    private javax.swing.JLabel lblmenu;
    private javax.swing.JLabel lblseguro;
    private javax.swing.JLabel termometro;
    // End of variables declaration//GEN-END:variables

    private void golpe() {

        int max = 12;
        int min = 10;
        PbVida.setValue((int) (PbVida.getValue() - Math.floor((Math.random() * max) + min)));
    }

    private void regenera() {


        int max = 20;
        int min = 18;

        if (ControladorPersonaje.getPersonaje1().getPociones() > 0) {
            
            //Control para que la vida del usuario no pueda pasar de su maximo
            if (ControladorPersonaje.getPersonaje1().getVida()>=ControladorPersonaje.getPersonaje1().getVidaMax()){
                ControladorPersonaje.getPersonaje1().setVida(ControladorPersonaje.getPersonaje1().getVidaMax());
                
                lblDescripcion.setText("Te has curado totalmente");
            

            }else{                
                
                ControladorPersonaje.getPersonaje1().setVida((int) (PbVida.getValue() + Math.floor((Math.random() * max) + min)));
                PbVida.setValue((int) (PbVida.getValue() + Math.floor((Math.random() * max) + min)));

            }

        } else {

            PbVida.setValue(PbVida.getValue() + 0);
        }
    }
int bandera = 0;
    public void incrementaTexto() {

        //Lectura de txt y set en txtpHistoria
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            //Apertura del fichero y creacion de BufferedReader para poder
            //hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(ruta + "//archivo.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            //Lectura del fichero
            String linea;
            linea = br.readLine();

            String acu = "";

            String datosSeparados[] = linea.split("<s>");
            String datoLimpio = datosSeparados[contador];

            acu += datoLimpio;

            String replace = acu.replace("NPC", "Preparate para el combate!");

            //ETIQUETAS HTML PARA MULTILINEA AUTOMATICO EN LABEL
            lblTextoHistoria.setText("<HTML><BODY>" + replace + "</BODY></HTML>");

            if (acu.contains("NPC") && bandera<1) {
                
                combate = new Combate(personaje, hostil, this, controladorPersonaje);
                bandera++;
                
                lblTextoHistoria.setForeground(Color.RED);

                btnAtacar.setVisible(true);
                btnHuir.setVisible(true);
                btnObservar.setVisible(true);
            
            } else {
                bandera=0;
                lblTextoHistoria.setForeground(Color.BLACK);

                lblPrueba.setText("");
                lblDescripcion.setText("");
                        
                btnAtacar.setVisible(false);
                btnHuir.setVisible(false);
                btnObservar.setVisible(false);
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
