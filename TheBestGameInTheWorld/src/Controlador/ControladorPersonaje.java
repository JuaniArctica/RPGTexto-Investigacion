/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Personaje;

/**
 *
 * @author federico
 */
public class ControladorPersonaje {

    public static Personaje personaje1 = new Personaje();

    public static Personaje getPersonaje1() {
        return personaje1;
    }

    public void setPersonaje1(Personaje personaje1) {
        this.personaje1 = personaje1;
    }

    public  void agregarValores(String nombre, String clase) {
        
        personaje1.setNombre(nombre);
        personaje1.setClase(clase);
        personaje1.setNivel(1);
        personaje1.setExpMax(20);
        personaje1.setExp(0);
        personaje1.setPociones(10);
               
        switch (personaje1.getClase()) {
            case "Detective":

                //Vida, defensa y golpe max min
                personaje1.setVidaMax(100);
                personaje1.setVida(100);
                personaje1.setDefensa(8);
                personaje1.setGolpeMax(14);
                personaje1.setGolpeMin(10);
                break;
            case "Arqueologo":

                //Vida, defensa y golpe max min
                personaje1.setVidaMax(80);
                personaje1.setVida(80);
                personaje1.setDefensa(6);
                personaje1.setGolpeMax(18);
                personaje1.setGolpeMin(14);
                break;
            case "Policia":
                    
                //Vida, defensa y golpe max min
                personaje1.setVidaMax(120);
                personaje1.setVida(120);
                personaje1.setDefensa(10);
                personaje1.setGolpeMax(10);
                personaje1.setGolpeMin(6);
                break;
            default:
                throw new AssertionError();
        }
    }
}
