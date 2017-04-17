/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojuego;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyectojuego.NpcList;
/**
 *
 * @author prouser
 */
public class ProyectoJuego {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    

   
    //PERSONAJE CONSTRUCTOR: Nombre, VidaMax, GolpeMax, GolpeMin, Defensa, Nivel, ExpMin, ExpMax 
    Personaje pj1 = new Personaje();
    pj1.setNombre(JOptionPane.showInputDialog("Ingrese un Nombre para su personaje:"));
    pj1.ElegirClase();
       
   
    
    Combate comb1 = new Combate();
    
    
    //SALIDAS DE PANTALLA
    
    System.out.println("-----------------------");
    pj1.NpcGetEstado();
    System.out.println("-----------------------");    

        
    comb1.quienAtaca();

    NpcList npc = new NpcList();
    
    npc.listaNpcHostil();
}


}
