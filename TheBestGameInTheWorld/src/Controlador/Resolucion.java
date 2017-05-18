/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.awt.GraphicsDevice;
import javax.swing.JFrame;


public class Resolucion extends JFrame {

    private final GraphicsDevice device;
    private boolean isFullScreenSupported = false;
    
    
    public Resolucion(final GraphicsDevice device) {
        this.device = device;
    }

    public void goFullScreen() {
        isFullScreenSupported = device.isFullScreenSupported();
        setUndecorated(isFullScreenSupported);
        setResizable(!isFullScreenSupported);
        if (isFullScreenSupported) {
            device.setFullScreenWindow(this);
            validate();
        } else {
            pack();
            setVisible(true);
        }
    }

}
