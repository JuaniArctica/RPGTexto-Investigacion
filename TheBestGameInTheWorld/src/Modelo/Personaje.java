/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Random;

/**
 *
 * @author prouser
 */
public class Personaje {
    
    //Atributos
    private String nombre;
    private int vidaMax;
    private int vida;
    private int pociones;
    private int golpeMax;
    private int golpeMin;
    private int defensa;
    private int nivel;
    private int expMax;
    private int exp;
    private String Clase;
    private final Random random = new Random();
    
    //Constructores    
    public Personaje() {
    }

    public Personaje(String nombre, int vidaMax, int vida, int pociones, int golpeMax, int golpeMin, int defensa, int nivel, int expMax, int exp, String Clase) {
        this.nombre = nombre;
        this.vidaMax = vidaMax;
        this.vida = vida;
        this.pociones = pociones;
        this.golpeMax = golpeMax;
        this.golpeMin = golpeMin;
        this.defensa = defensa;
        this.nivel = nivel;
        this.expMax = expMax;
        this.exp = exp;
        this.Clase = Clase;
    }
    
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPociones() {
        return pociones;
    }

    public void setPociones(int pociones) {
        this.pociones = pociones;
    }

    public int getGolpeMax() {
        return golpeMax;
    }

    public void setGolpeMax(int golpeMax) {
        this.golpeMax = golpeMax;
    }

    public int getGolpeMin() {
        return golpeMin;
    }

    public void setGolpeMin(int golpeMin) {
        this.golpeMin = golpeMin;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExpMax() {
        return expMax;
    }

    public void setExpMax(int expMax) {
        this.expMax = expMax;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    public Random getRandom() {
        return random;
    }
    
}
