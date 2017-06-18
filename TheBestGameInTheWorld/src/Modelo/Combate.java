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
    
    private Hostil enemigoActivo = Hostil.nuevoEnemigo();
    
    public Combate(Personaje personaje, Hostil hostil, PantallaJuego pantJuego, ControladorPersonaje controladorPersonaje) throws IOException {
        
        pantJuego.lblTextoHistoria.setText("<HTML><BODY>Encontras un " + enemigoActivo.getNombre() + ": <BR>" + enemigoActivo.getDescripcion() + "</BODY></HTML>");
        
        while (enemigoActivo.getVida() > 0 && controladorPersonaje.getPersonaje1().getVida() > 0) {
            defensaNPC(pantJuego);
            defensaPersonaje(pantJuego, controladorPersonaje);
        }
    }
    
    public int ataquePersonaje(ControladorPersonaje controladorPersonaje) {
        return controladorPersonaje.getPersonaje1().getRandom().nextInt(controladorPersonaje.getPersonaje1().getGolpeMax() - controladorPersonaje.getPersonaje1().getGolpeMin() + 1) + controladorPersonaje.getPersonaje1().getGolpeMin();
    }
    
    private void defensaPersonaje(PantallaJuego pantJuego, ControladorPersonaje controladorPersonaje) {
        
        int vidaPerActual = controladorPersonaje.getPersonaje1().getVida() - 3;
        controladorPersonaje.getPersonaje1().setVida(vidaPerActual);
        
        pantJuego.lblTextoHistoria.setText("El enemigo es golpeado por " + 3 + " de daño (Vida actual = " + vidaPerActual + ")");
        
        if (controladorPersonaje.getPersonaje1().getVida() <= 0) {
            pantJuego.lblTextoHistoria.setText("El enemigo ha muerto");
        }
    }
    
    public int ataqueNPC() {
        return enemigoActivo.getRandom().nextInt(enemigoActivo.getGolpeMax() - enemigoActivo.getGolpeMin() + 1) + enemigoActivo.getGolpeMin();
    }
    
    private void defensaNPC(PantallaJuego pantJuego) {

        int vidaNpcActual = enemigoActivo.getVida() - 5;
        enemigoActivo.setVida(vidaNpcActual);
        
        pantJuego.lblTextoHistoria.setText("El enemigo es golpeado por " + 5 + " de daño (Vida actual = " + vidaNpcActual + ")");
        
        if (enemigoActivo.getVida() <= 0) {
            pantJuego.lblTextoHistoria.setText("El enemigo ha muerto");
        }
    }
//    public static void quienAtaca() {
////FALTA AGREGAR EL PARAMETRO NIVEL Y DEFENSA PARA HACERLO MAS INTERESANTE EN LA TIRADA
//
//        int level = 1;
//
//        //Tiradas para ver quien ataca primero
//        int Personaje = (int) (Math.random() * 100) + 1 - level * 10;
//        int Hostil = (int) (Math.random() * 100) + 1;
//    }
}
