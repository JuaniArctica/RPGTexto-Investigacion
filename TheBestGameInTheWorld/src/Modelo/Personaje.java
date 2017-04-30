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

//ATRIBUTOS    
    private int ExpMin;
    private int ExpMax;
    private String Clase;

//CONSTRUCTORES    
    public Personaje() {
    }

    public Personaje(int ExpMin, int ExpMax, String Clase, String Nombre, int VidaMax, int GolpeMax, int GolpeMin, int Defensa, int Nivel) {
        super(Nombre, VidaMax, GolpeMax, GolpeMin, Defensa, Nivel);
        this.ExpMin = ExpMin;
        this.ExpMax = ExpMax;
        this.Clase = Clase;
    }

//METODOS
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

    public void agregarValores(String nombre, String clase) {
        this.setNombre(nombre);
        this.setClase(clase);
        this.setNivel(1);
        this.setExpMax(20);
        this.setExpMin(0);

        if (this.getClase().equals("Detective")) {
            //vida, defensa y golpe max min
            this.setVidaMax(10);
            this.setDefensa(10);
            this.setGolpeMax(10);
            this.setGolpeMin(5);

        } else if (this.getClase().equals("Explorador")) {
            //vida, defensa y golpe max min
            this.setVidaMax(8);
            this.setDefensa(12);
            this.setGolpeMax(7);
            this.setGolpeMin(6);

        } else {
            //vida, defensa y golpe max min
            this.setVidaMax(12);
            this.setDefensa(8);
            this.setGolpeMax(12);
            this.setGolpeMin(4);
        }

//        System.out.println("nombre del pj: "+this.getNombre());
//        System.out.println("clase del pj: "+this.getClase());
//        System.out.println("nivel del pj: "+this.getNivel());
//        System.out.println("Vida: "+ this.getVidaMax());
// 
//        System.out.println(Personaje.super.getVidaMax());
    }
}
