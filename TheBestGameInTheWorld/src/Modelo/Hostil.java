/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author prouser
 */
public class Hostil extends Actores {

    //Atributos
    private int Experiencia;

    //Constructores
    public Hostil() {
    }

    public Hostil(int Experiencia, String Nombre, int VidaMax, int GolpeMax, int GolpeMin, int Defensa, int Nivel) {
        super(Nombre, VidaMax, GolpeMax, GolpeMin, Defensa, Nivel);
        this.Experiencia = Experiencia;
    }

    //Metodos
    public int getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(int Experiencia) {
        this.Experiencia = Experiencia;
    }
}
