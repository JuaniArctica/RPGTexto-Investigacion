/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Menues.PantallaJuego;

/**
 *
 * @author prouser
 */
public class Combate {
    
    private Personaje refPersonaje;
    private Hostil refHostil;
    private PantallaJuego refPantJuego;
    
    private int Dados;
    
    public int getDados() {
        return Dados;
    }

    public void setDados(int Dados) {
        this.Dados = Dados;
    }
    
    public void Batalla() {
        refHostil.nuevoEnemigo();
        
        refPantJuego.lblTextoHistoria.setText("Encontras un " + refHostil.getNombre());
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
