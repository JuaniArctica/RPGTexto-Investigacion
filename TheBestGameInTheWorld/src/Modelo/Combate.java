/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ControladorPersonaje;
import Menues.PantallaJuego;
/**
 *
 * @author prouser
 */
public class Combate {

    private ControladorPersonaje refControlador;
    private PantallaJuego refPantallaJuego; 
    
//ATRIBUTOS    
    private int Dados;
    private int Golpear;
    private int Defender;

//CONSTRUCTORES    
    public Combate(ControladorPersonaje controladorPersonaje) {
    }

    public Combate(int Dados, int Golpear, int Defender) {
        this.Dados = Dados;
        this.Golpear = Golpear;
        this.Defender = Defender;
    }

//METODOS
    public int getDefender() {
        return Defender;
    }

    public void setDefender(int Defender) {
        this.Defender = Defender;
    }

    public int getGolpear() {
        return Golpear;
    }

    public void setGolpear(int Golpear) {
        this.Golpear = Golpear;
    }

    public int getDados() {
        return Dados;
    }

    public void setDados(int Dados) {
        this.Dados = Dados;
    }

   public static void quienAtaca() {
//FALTA AGREGAR EL PARAMETRO NIVEL Y DEFENSA PARA HACERLO MAS INTERESANTE EN LA TIRADA
//NO PUDE TRAER EL getNivel ni getDefensa

        int level = 1;


                //Tiradas para ver quien ataca primero
                int Personaje = (int) (Math.random() * 100) + 1 - level * 10;
                int Hostil = (int) (Math.random() * 100) + 1;
                
                if (Personaje < Hostil) {

                    System.out.println("Tiras " + Personaje + " Contra " + Hostil + " de tu rival.");
                    System.out.println("Ataca Primero Personaje");
                    System.out.println("Le Pegaste ");
                   // UsuarioAtaca();

                } else {
                    
                    System.out.println("Tiras: " + Personaje + " Contra: " + Hostil + " de tu rival.");
                    System.out.println("Ataca Primero Hostil");
                    System.out.println("Te pego ");
                    //NpcAtaca();

                }
    }

    public void UsuarioAtaca(ControladorPersonaje controladorPersonaje) {

        int danio;
    
        //NO ESTA TRAYENDO LOS VALORES DE GOLPE MINIMO Y MAXIMO!!!!!
        danio = (int) (Math.random() * controladorPersonaje.getPersonaje1().getGolpeMax() + controladorPersonaje.getPersonaje1().getGolpeMin());

        System.out.println(danio + controladorPersonaje.getPersonaje1().getClase());

        //FALTA CODEAR RESTAR VIDA A NPC
    }

    public void NpcAtaca() {

         int a = 3;
         
        System.out.println(""); 
         
        //FALTA CODEAR RESTAR VIDA A USUARIO      
    }

}
