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
    protected int VidaMax;
    protected int GolpeMax;
    protected int GolpeMin;
    protected int Defensa;
    protected int Nivel;

    public Actores() {
    }

    public Actores(String Nombre, int VidaMax, int GolpeMax, int GolpeMin, int Defensa, int Nivel) {
        this.Nombre = Nombre;
        this.VidaMax = VidaMax;
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

    public int getVidaMax() {
        return VidaMax;
    }

    public void setVidaMax(int VidaMax) {
        this.VidaMax = VidaMax;
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
