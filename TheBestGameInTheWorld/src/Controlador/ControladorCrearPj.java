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
    public Personaje refPersonaje;

    public ControladorCrearPj(){
        refPersonaje = new Personaje();
    }
    
    public void agregarValores (String nombre, String clase){
    refPersonaje.setNombre(nombre);
    refPersonaje.setClase(clase);
    refPersonaje.setNivel(1);
    refPersonaje.setExpMax(20);
    refPersonaje.setExpMin(0);
    
        if (refPersonaje.getClase().equals("Detective")) {
             //vida, defensa y golpe max min
            refPersonaje.setVidaMax(10);
            refPersonaje.setDefensa(10);
            refPersonaje.setGolpeMax(10);
            refPersonaje.setGolpeMin(5);
            
        }else if(refPersonaje.getClase().equals("Explorador")){
            //vida, defensa y golpe max min
            refPersonaje.setVidaMax(8);
            refPersonaje.setDefensa(12);
            refPersonaje.setGolpeMax(7);
            refPersonaje.setGolpeMin(6);
        
        } else {
            //vida, defensa y golpe max min
            refPersonaje.setVidaMax(12);
            refPersonaje.setDefensa(8);
            refPersonaje.setGolpeMax(12);
            refPersonaje.setGolpeMin(4);
        }
    
        System.out.println("Nombre del pj: "+refPersonaje.getNombre());
        System.out.println("Clase del pj: "+refPersonaje.getClase());
        System.out.println("nivel del pj: "+refPersonaje.getNivel());
        System.out.println("Vida: "+ refPersonaje.getVidaMax());
        System.out.println("Ataque: "+refPersonaje.getGolpeMin()+"/"+refPersonaje.getGolpeMax());
    }
}
