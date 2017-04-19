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
public class NpcList {

    private int elegido;

    public NpcList() {
    }

    public NpcList(int elegido) {
        this.elegido = elegido;
    }

    public int getElegido() {
        return elegido;
    }

    public void setElegido(int elegido) {
        this.elegido = elegido;
    }

    public int listaNpcHostil() {

        //NPC CONSTRUCTOR: Nombre, VidaMax, GolpeMax, GolpeMin, Defensa, Nivel, Exp
        Hostil arrayNpc[] = new Hostil[6];

        //NPC LVL 1
        arrayNpc[0] = new Hostil("Asesino", 5, 3, 2, 2, 1, 7);
        arrayNpc[1] = new Hostil("Bandido", 7, 6, 2, 3, 1, 9);
        arrayNpc[2] = new Hostil("Lanpc.listaNpcHostil();dron", 9, 6, 4, 4, 1, 11);
        //NPC LVL 2      
        arrayNpc[3] = new Hostil("Sombra", 15, 7, 4, 5, 2, 15);
        arrayNpc[4] = new Hostil("Perro Salvaje", 20, 8, 6, 7, 2, 18);
        arrayNpc[5] = new Hostil("Meretriz", 25, 9, 8, 2, 2, 23);

        int rnd = (int) (Math.random() * arrayNpc.length);

        System.out.println(arrayNpc[rnd].NpcGetEstado());
        return 0;

    }

}
