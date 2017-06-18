/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Menues.PantallaJuego;
import java.io.IOException;

/**
 *
 * @author prouser
 */
public class Combate {
    
    Personaje personaje;
    PantallaJuego pantJuego;
    Hostil enemigoActivo = Hostil.nuevoEnemigo();
    
    public Combate(Hostil hostil, PantallaJuego pantJuego) throws IOException {
        
        pantJuego.lblTextoHistoria.setText("<HTML><BODY>Encontras un " + enemigoActivo.getNombre() + ": <BR>" + enemigoActivo.getDescripcion() + "</BODY></HTML>");
        
        while (personaje.estaVivo() && enemigoActivo.estaVivo()) {
            defensaNPC();
            //personaje.defensa(hostil);
        }
    }
    
    public int ataquePersonaje() {
        return personaje.getRandom().nextInt(personaje.getGolpeMax() - personaje.getGolpeMin() + 1) + personaje.getGolpeMin();
    }
    
    public void defensaNPC() {

        int a = enemigoActivo.getVida() - ataquePersonaje();
        pantJuego.lblTextoHistoria.setText("El enemigo es golpeado por " + ataquePersonaje() + " de daño (Vida actual = " + a + ")");
        
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
