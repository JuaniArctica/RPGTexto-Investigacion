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

    Personaje personaje1 = new Personaje();

    public Personaje getPersonaje1() {
        return personaje1;
    }

    public void setPersonaje1(Personaje personaje1) {
        this.personaje1 = personaje1;
    }

    public void agregarValores(String nombre, String clase) {
        personaje1.setNombre(nombre);
        personaje1.setClase(clase);
        personaje1.setNivel(1);
        personaje1.setExpMax(20);
        personaje1.setExpMin(0);

        switch (personaje1.getClase()) {
            case "Detective":

                //Vida, defensa y golpe max min
                personaje1.setVidaMax(10);
                personaje1.setDefensa(10);
                personaje1.setGolpeMax(10);
                personaje1.setGolpeMin(5);
                break;
            case "Explorador":

                //Vida, defensa y golpe max min
                personaje1.setVidaMax(8);
                personaje1.setDefensa(12);
                personaje1.setGolpeMax(7);
                personaje1.setGolpeMin(6);
                break;
            default:

                //Vida, defensa y golpe max min
                personaje1.setVidaMax(12);
                personaje1.setDefensa(8);
                personaje1.setGolpeMax(12);
                personaje1.setGolpeMin(4);
                break;
        }
    }
}
