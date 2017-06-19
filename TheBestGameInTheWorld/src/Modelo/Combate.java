/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ControladorPersonaje;
import Menues.PantallaJuego;
import java.io.IOException;

/**
 *
 * @author prouser
 */
public class Combate {

    private final Hostil enemigoActivo = Hostil.nuevoEnemigo();
    private final Personaje personajeActivo = ControladorPersonaje.getPersonaje1();

    public Combate() {
    }

    public Combate(Personaje personaje, Hostil hostil, PantallaJuego pantJuego, ControladorPersonaje controladorPersonaje) throws IOException {

        pantJuego.btnSiguiente.setVisible(false);

        pantJuego.lblPrueba.setText("<HTML><BODY>De repente aparece " + enemigoActivo.getNombre() + "</BODY></HTML>");
    }

    public Hostil getEnemigoActivo() {
        return enemigoActivo;
    }

    public void pelea(PantallaJuego pantJuego, ControladorPersonaje controladorPersonaje) {

        ataquePersonaje(pantJuego);
        ataqueNPC(pantJuego);
    }

    private void ataqueNPC(PantallaJuego pantJuego) {

        int defensaPersonaje = (int) (Math.random() * personajeActivo.getDefensa());
        int golpeDelNpc = (int) (Math.random() * (enemigoActivo.getGolpeMax() - enemigoActivo.getGolpeMin() + 1) + enemigoActivo.getGolpeMin());
        int vidaPerActual = personajeActivo.getVida() - (golpeDelNpc - defensaPersonaje);
        
        personajeActivo.setVida(vidaPerActual);
        pantJuego.PbVida.setValue(vidaPerActual);
        pantJuego.lblDatosGolpeAlUsuario.setText("<HTML><BODY>El enemigo te ha golpeado por " + golpeDelNpc 
                + "<p>Te defendiste por " + defensaPersonaje
                + "<p>Tu vida actual = <font color=#ff0000><b>" + vidaPerActual + "</b></font> puntos.</BODY></HTML>");

        if (personajeActivo.getVida() <= 0) {
            pantJuego.btnSiguiente.setVisible(true);
            pantJuego.lblDatosGolpeAlUsuario.setText("Haz Muerto!");
        }
    }

    private void ataquePersonaje(PantallaJuego pantJuego) {
        
        int golpePersonaje = (int) (Math.random() * (personajeActivo.getGolpeMax() - personajeActivo.getGolpeMin() + 1) + personajeActivo.getGolpeMin());
        int vidaNpcActual = enemigoActivo.getVida() - golpePersonaje;
        
        enemigoActivo.setVida(vidaNpcActual);
        pantJuego.lblDatosGolpeAlNpc.setText("<HTML><BODY>El enemigo " + enemigoActivo.getNombre() + " es golpeado por " + golpePersonaje + "<p>Vida actual = <font color=#ff0000><b>" + vidaNpcActual + "</b></font> puntos.</BODY></HTML>");

        if (enemigoActivo.getVida() <= 0) {

            pantJuego.btnSiguiente.setVisible(true);
            pantJuego.btnAtacar.setVisible(false);
            pantJuego.btnHuir.setVisible(false);
            pantJuego.btnObservar.setVisible(false);

            int expActual = pantJuego.PbExperiencia.getValue();
            pantJuego.PbExperiencia.setValue(enemigoActivo.getExp() + expActual);

            subirNivel(pantJuego);

            pantJuego.lblDatosGolpeAlNpc.setText("<HTML><BODY><b><font color=#ff0000> El enemigo ha muerto y te ha otorgado " + enemigoActivo.getExp() + " puntos de experiencia.</font></b></BODY></HTML>");
        }
    }

    public void subirNivel(PantallaJuego pantJuego) {

        if (pantJuego.PbExperiencia.getValue() > 99) {

            int nivel = ControladorPersonaje.getPersonaje1().getNivel();

            ControladorPersonaje.getPersonaje1().setNivel(nivel + 1);
            ControladorPersonaje.getPersonaje1().setDefensa(ControladorPersonaje.getPersonaje1().getDefensa() + 3);
            ControladorPersonaje.getPersonaje1().setGolpeMax(ControladorPersonaje.getPersonaje1().getGolpeMax() + 4);
            ControladorPersonaje.getPersonaje1().setGolpeMin(ControladorPersonaje.getPersonaje1().getGolpeMin() + 2);

            pantJuego.PbExperiencia.setValue(0);

            pantJuego.lblNumeroNivel.setText(String.valueOf(ControladorPersonaje.getPersonaje1().getNivel()));
            pantJuego.lblNumeroDefensa1.setText(String.valueOf(ControladorPersonaje.getPersonaje1().getDefensa() + 3));
            pantJuego.lblNumeroGolpe.setText(String.valueOf(ControladorPersonaje.getPersonaje1().getGolpeMin() + 2) + " / " + String.valueOf(ControladorPersonaje.getPersonaje1().getGolpeMax() + 4));
        }
    }
}
