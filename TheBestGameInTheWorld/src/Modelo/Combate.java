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
    
    Hostil hostil1 = new Hostil("Lobo", "Un feroz lobo sediento de sangre", 100, 15, 18);
    Hostil hostil2 = new Hostil("Gallina", "Una pequeña y adorable gallinita... verdad?", 100, 22, 24);
    
    public Combate(Personaje personaje, Hostil hostil, PantallaJuego pantJuego) throws IOException {
        
        pantJuego.lblTextoHistoria.setText("<HTML><BODY>Encontras un " + hostil1.getNombre() + ": <BR>" + hostil1.getDescripcion() + "</BODY></HTML>");
        
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
