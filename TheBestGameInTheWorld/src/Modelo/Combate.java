/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author prouser
 */
public class Combate {
    
//ATRIBUTOS    
    private int Dados;
    private int Golpear;
    private int Defender;

//CONSTRUCTORES    
    public Combate() {
    }

    public Combate(int Dados, int Golpear, int Defender) {
        this.Dados = Dados;
        this.Golpear = Golpear;
        this.Defender = Defender;
    }

//METODOS
    public int getDefender() {
        return Defender;
    }

    public void setDefender(int Defender) {
        this.Defender = Defender;
    }

    public int getGolpear() {
        return Golpear;
    }

    public void setGolpear(int Golpear) {
        this.Golpear = Golpear;
    }

    public int getDados() {
        return Dados;
    }

    public void setDados(int Dados) {
        this.Dados = Dados;
    }

    public void quienAtaca() {
//FALTA AGREGAR EL PARAMETRO NIVEL Y DEFENSA PARA HACERLO MAS INTERESANTE EN LA TIRADA
//NO PUDE TRAER EL getNivel ni getDefensa

        int level = 1;

        String cOpcion;
        int opcion;
        String cOpcion2;
        int opcion2;

        JOptionPane.showMessageDialog(null, "Encontraste Rival");

        do {
            cOpcion = JOptionPane.showInputDialog(null, "Deseas:\n\nPelear =1\nHuir =2\nVer Npc =3");
            opcion = Integer.parseInt(cOpcion);
        } while (opcion >= 3 && opcion <= 1);

        switch (opcion) {
            case 1:

                //Tiradas para ver quien ataca primero
                int Personaje = (int) (Math.random() * 100) + 1 - level * 10;
                int Hostil = (int) (Math.random() * 100) + 1;
                if (Personaje < Hostil) {

                    System.out.println("Tiras " + Personaje + " Contra " + Hostil + " de tu rival.");
                    System.out.println("Ataca Primero Personaje");
                    System.out.println("Le Pegaste ");
                    UsuarioAtaca();

                } else {
                    System.out.println("Tiras: " + Personaje + " Contra: " + Hostil + " de tu rival.");
                    System.out.println("Ataca Primero Hostil");
                    System.out.println("Te pego ");
                    NpcAtaca();

                }
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Te tomaste el palo");
                break;

            case 3:
                //traer estado npc
                NpcList npc = new NpcList();
                System.out.println(npc.listaNpcHostil());

                quienAtaca();

        }
    }

    public void UsuarioAtaca() {

        Personaje pj1 = new Personaje();

        int danio;

        //NO ESTA TRAYENDO LOS VALORES DE GOLPE MINIMO Y MAXIMO!!!!!
        danio = (int) (Math.random() * pj1.getGolpeMax()) + pj1.getGolpeMin();

        System.out.println(danio);

        //FALTA CODEAR RESTAR VIDA A NPC
    }

    public void NpcAtaca() {

        Hostil arrayObjetos[] = new Hostil[6];

        //int danio = (int)(Math.random() * .getGolpeMax()) + pj1.getGolpeMin();
        // System.out.println(danio);
        //FALTA CODEAR RESTAR VIDA A USUARIO      
    }

}
