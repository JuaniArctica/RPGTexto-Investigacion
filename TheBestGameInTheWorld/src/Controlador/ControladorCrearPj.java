/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Personaje;
/**
 *
 * @author Juani
 */
public class ControladorCrearPj {
    private Personaje refPersonaje;

    public ControladorCrearPj(){
        refPersonaje = new Personaje();
    }
    
    public void agregarValores (String nombre, String clase){
    refPersonaje.setNombre(nombre);
    refPersonaje.setClase(clase);
    
        System.out.println("nombre del pj: "+refPersonaje.getNombre());
        System.out.println("clase del pj: "+refPersonaje.getClase());
    }
}
