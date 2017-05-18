/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thebestgameintheworld;

import Menues.Reso;
import java.awt.GraphicsDevice;



/**
 *
 * @author prouser
 */


public class ProyectoJuego {

                  
    public static void main(String[] args, GraphicsDevice device) {            
       
        Reso ventana = new Reso(device);
        ventana.setVisible(true);
        
    }
}
