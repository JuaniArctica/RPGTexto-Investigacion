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
    
    private Personaje refPersonaje;
    private PantallaJuego refPantJuego;
    
    private final String nombre;
    private final String descripcion;
    private int vida;
    private final int golpeMin;
    private final int golpeMax;
    private final static Random random = new Random();

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
    
    
    public Hostil nuevoEnemigo() {
        
        int i;
        
        do {
            i = (int)(Math.random() * 3 + 1);
        } while (i == 0);
        
        switch (i) {
            case 1:
                return new Hostil("Lobo", "Un feroz lobo sediento de sangre", 100, 15, 18);
            case 2:
                return new Hostil("Gallina", "Una pequeña y adorable gallinita... verdad?", 100, 22, 24);
            default:
                return new Hostil("Orco", "Un enorme y feroz orco listo para atacar", 100, 16, 18);
        }
    }

    public String getVida() {
        return "Vida del enemigo: " + vida;
    }
    
    public boolean estaVivo() {
        return vida > 0;
    }
    
    public int ataque() {
        return random.nextInt(golpeMax - golpeMin + 1) + golpeMin;
    }
    
    public void defensa() {

        vida = vida - refPersonaje.ataque();
        refPantJuego.lblTextoHistoria.setText("    El enemigo es golpeado por " + refPersonaje.ataque() + " de daño (Vida actual = " + vida + ")");
        
        if (vida <= 0) {
            refPantJuego.lblTextoHistoria.setText("El enemigo ha muerto");
        }
    }
}
