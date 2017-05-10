/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author prouser
 */
public class Personaje extends Actores {

    //Atributos
    private int ExpMin;
    private int ExpMax;
    private String Clase;
    
    
    //Constructores
    public Personaje() {
    }

    public Personaje(int ExpMin, int ExpMax, String Clase, String Nombre, int VidaMax, int GolpeMax, int GolpeMin, int Defensa, int Nivel) {
        super(Nombre, VidaMax, GolpeMax, GolpeMin, Defensa, Nivel);
        this.ExpMin = ExpMin;
        this.ExpMax = ExpMax;
        this.Clase = Clase;
    }

    //Metodos
    public int getExpMax() {
        return ExpMax;
    }

    public void setExpMax(int ExpMax) {
        this.ExpMax = ExpMax;
    }

    public int getExpMin() {
        return ExpMin;
    }

    public void setExpMin(int ExpMin) {
        this.ExpMin = ExpMin;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String Clase) {
        this.Clase = Clase;
    }
}
