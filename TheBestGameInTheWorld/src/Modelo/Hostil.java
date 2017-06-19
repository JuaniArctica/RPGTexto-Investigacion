/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ControladorPersonaje;
import java.util.Random;

/**
 *
 * @author prouser
 */
public class Hostil {
    
    private static final Personaje personajeActivo = ControladorPersonaje.getPersonaje1();
    
    private String nombre;
    private String descripcion;
    private int vida;
    private int golpeMin;
    private int golpeMax;
    private int exp;
    private static Random random = new Random();

    public Hostil() {
    }
    
    public Hostil(String nombre, String descripcion, int vida, int golpeMin, int golpeMax, int exp) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.vida = vida;
        this.golpeMin = golpeMin;
        this.golpeMax = golpeMax;
        this.exp= exp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getGolpeMin() {
        return golpeMin;
    }

    public void setGolpeMin(int golpeMin) {
        this.golpeMin = golpeMin;
    }

    public int getGolpeMax() {
        return golpeMax;
    }

    public void setGolpeMax(int golpeMax) {
        this.golpeMax = golpeMax;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        Hostil.random = random;
    }

    
    public static Hostil nuevoEnemigo() {
        
        Hostil npcNivel1[] = new Hostil[3];
        Hostil npcNivel2[] = new Hostil[3];
        
        npcNivel1[0] = new Hostil("una sombra", "Muy oscuro para distingirlo, una sombra misteriosa se aproxima de forma amenazante lista para atacarte", 100, 12, 16, 50);
        npcNivel1[1] = new Hostil("un ladron", "De forma muy rapida, un hombre aparece con un arma exigiendo tus pertenencias", 100, 14, 18, 50);
        npcNivel1[2] = new Hostil("un ciruja", "Un hombre hambriento y debil aparece frente a ti sin nada mas que una navaja y una firme mirada en sus ojos", 100, 16, 20, 50);
        
        npcNivel2[0] = new Hostil("Maradona", "Tremendo drogon", 100, 22, 26, 70);
        npcNivel2[1] = new Hostil("Cristina", "Te quiere meter la mano al bolsillo, como no?", 100, 24, 28, 70);
        npcNivel2[2] = new Hostil("Maluma", "Alto hijo de puta", 100, 26, 30, 70);
        
        int rnd = (int) (Math.random() * npcNivel1.length);
        
        if (personajeActivo.getNivel() == 1) {
            return npcNivel1[rnd];
        } else if(personajeActivo.getNivel() == 2) {
            return npcNivel2[rnd];
        }
        return null;
    }
}
