/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

/**
 *
 * @author Lea
 */
public class AnneeScolaire {

    private int id;

    /*  public  AnneeScolaire() {
   id=0;
    
}*/
 /* public  AnneeScolaire(int m_id) {
   id=m_id;
/*}
    
    public void Periode(){
    int anneefin;
    anneefin=(id)+1;
    System.out.println(id + "/" + anneefin);
    }*/
    private int anneedebut;

    public AnneeScolaire(int m_anneedebut) {
        anneedebut = m_anneedebut;
    }

    //calcul et affichage de la periode
    public void Periode() {
        int anneefin;
        anneefin = (anneedebut) + 1;
        System.out.println(anneedebut + "/" + anneefin);
    }
}
