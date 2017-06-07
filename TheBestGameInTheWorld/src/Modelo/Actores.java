/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Juani
 */
public abstract class Actores {
    
    //Atributos
    protected String Nombre;
    protected int Vida;
    protected int GolpeMax;
    protected int GolpeMin;
    protected int Defensa;
    protected int Nivel;

    public Actores() {
    }

    public Actores(String Nombre, int Vida, int GolpeMax, int GolpeMin, int Defensa, int Nivel) {
        this.Nombre = Nombre;
        this.Vida = Vida;
        this.GolpeMax = GolpeMax;
        this.GolpeMin = GolpeMin;
        this.Defensa = Defensa;
        this.Nivel = Nivel;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getVida() {
        return Vida;
    }

    public void setVidaMax(int VidaMax) {
        this.Vida = VidaMax;
    }

    public int getGolpeMax() {
        return GolpeMax;
    }

    public void setGolpeMax(int GolpeMax) {
        this.GolpeMax = GolpeMax;
    }

    public int getGolpeMin() {
        return GolpeMin;
    }

    public void setGolpeMin(int GolpeMin) {
        this.GolpeMin = GolpeMin;
    }

    public int getDefensa() {
        return Defensa;
    }

    public void setDefensa(int Defensa) {
        this.Defensa = Defensa;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }
}
