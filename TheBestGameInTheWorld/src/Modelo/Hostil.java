/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Menues.PantallaJuego;
import java.util.Random;

/**
 *
 * @author prouser
 */
public class Hostil {
    
    private Personaje personaje;
    private PantallaJuego pantJuego;
    
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

    public String getDescripcion() {
        return descripcion;
    }

    public int getGolpeMin() {
        return golpeMin;
    }

    public int getGolpeMax() {
        return golpeMax;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }
    
    public static Hostil nuevoEnemigo() {
        
        Hostil arrayNpc[] = new Hostil[3];
        
        arrayNpc[0] = new Hostil("Lobo", "Un feroz lobo sediento de sangre", 100, 15, 18);
        arrayNpc[1] = new Hostil("Gallina", "Una pequeña y adorable gallinita... verdad?", 100, 22, 24);
        arrayNpc[2] = new Hostil("Maradona", "El de la droga", 100, 50, 25);
        
        int rnd = (int) (Math.random() * arrayNpc.length);
        
        return arrayNpc[rnd];
    }
    
    public boolean estaVivo() {
        return vida > 0;
    }
    
    public int ataque() {
        return random.nextInt(golpeMax - golpeMin + 1) + golpeMin;
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
