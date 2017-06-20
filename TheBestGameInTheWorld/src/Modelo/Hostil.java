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
        
        Hostil sombra[] = new Hostil[1];
        Hostil cultista[] = new Hostil[1];
        
        Hostil npcNivel1[] = new Hostil[3];
        Hostil npcNivel2[] = new Hostil[3];
        
        //NPC SOMBRA FORZADA
        sombra[0] = new Hostil("una sombra alada", "Cuando miras más de cerca lo que ves no es una sombra. "
                + "Hay un ser volando, una horripilante cara lisa sin boca ni nariz te mira, inexpresiva, su "
                + "cuerpo tiene superficies lisas y aceitosas como la piel de una ballena, unos desagradables "
                + "cuernos que se curvan hacia sí, alas de murciélago que no hacen ruido al batir, unas feas "
                + "patas prensiles, y colas con lengüetas que dan latigazos inquietantemente y sin necesidad.", 60, 9, 12, 50);
        
        
        //NPC CULTISTA FORZADO
        cultista[0] = new Hostil("Cultista", "Un hombre corpulento vistiendo unas túnicas negras con una gran "
                + "capucha oscureciendo la cara,aunque puedes ver su mirada, transmite una determinación que te "
                + "congela la sangre, en su mano porta una daga curvada, claramente está dispuesto a usarla.", 100, 22, 26, 70);
        

        
        int rnd = (int) (Math.random() * npcNivel1.length);
        
        if (personajeActivo.getNivel() == 1 && personajeActivo.getExp()==0) {
            return sombra[0];
        } else if(personajeActivo.getNivel() ==1 && personajeActivo.getExp()>0) {
            return cultista[0];
        }
        return null;
    }
}
