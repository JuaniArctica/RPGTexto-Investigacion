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
public class Hostil {
    
    private String nombre;
    private String descripcion;
    private int vida;
    private int golpeMin;
    private int golpeMax;
    private static Random random = new Random();

    public Hostil() {
    }
    
    public Hostil(String nombre, String descripcion, int vida, int golpeMin, int golpeMax) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.vida = vida;
        this.golpeMin = golpeMin;
        this.golpeMax = golpeMax;
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
        
        Hostil arrayNpc[] = new Hostil[3];
        
        arrayNpc[0] = new Hostil("Lobo", "Un feroz lobo sediento de sangre", 100, 1, 1);
        arrayNpc[1] = new Hostil("Gallina", "Una pequeña y adorable gallinita... verdad?", 100, 1, 1);
        arrayNpc[2] = new Hostil("Maradona", "El de la droga", 100, 1, 1);

        int rnd = (int) (Math.random() * arrayNpc.length);
        
        return arrayNpc[rnd];
    }
    
//    public void defensa() {
//
//        vida = vida - personaje.ataque();
//        pantJuego.lblTextoHistoria.setText("El enemigo es golpeado por " + personaje.ataque() + " de daño (Vida actual = " + vida + ")");
//        
//        if (vida <= 0) {
//            pantJuego.lblTextoHistoria.setText("El enemigo ha muerto");
//        }
//    }
}
