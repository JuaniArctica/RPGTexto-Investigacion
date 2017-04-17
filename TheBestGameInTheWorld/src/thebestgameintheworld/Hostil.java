/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thebestgameintheworld;

/**
 *
 * @author prouser
 */
public class Hostil {
    
//ATRIBUTOS    
    private String Nombre;
    
    private int VidaMax;
    
    private int GolpeMax;
    
    private int GolpeMin;
    
    private int Defensa;

    private int Nivel;

    private int Experiencia;


//CONSTRUCTORES    
    public Hostil() {
    }

    public Hostil(String Nombre, int VidaMax, int GolpeMax, int GolpeMin, int Defensa, int Nivel, int Experiencia) {
        this.Nombre = Nombre;
        this.VidaMax = VidaMax;
        this.GolpeMax = GolpeMax;
        this.GolpeMin = GolpeMin;
        this.Defensa = Defensa;
        this.Nivel = Nivel;
        this.Experiencia = Experiencia;
    }
     
//METODOS
    public int getGolpeMin() {
        return GolpeMin;
    }

    public void setGolpeMin(int GolpeMin) {
        this.GolpeMin = GolpeMin;
    }

    public int getGolpeMax() {
        return GolpeMax;
    }

    public void setGolpeMax(int GolpeMax) {
        this.GolpeMax = GolpeMax;
    }
    
    public int getVidaMax() {
        return VidaMax;
    }

    public void setVidaMax(int VidaMax) {
        this.VidaMax = VidaMax;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public int getDefensa() {
        return Defensa;
    }

    public void setDefensa(int Defensa) {
        this.Defensa = Defensa;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }    
    
    public int getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(int Experiencia) {
        this.Experiencia = Experiencia;
    }    
    
    public int NpcGetEstado (){
        System.out.println("Nombre: "+ Hostil.this.getNombre()+" - Nivel "+ Hostil.this.getNivel());        
        System.out.println("Vida: "+ Hostil.this.getVidaMax());
        System.out.println("Golpe: "+ Hostil.this.getGolpeMin()+"/"+Hostil.this.getGolpeMax());
        System.out.println("Defensa: "+ Hostil.this.getDefensa());
        System.out.println("Otorga "+Hostil.this.getExperiencia()+" puntos de Experiencia.");
        return 0;
        
    }
   

}
