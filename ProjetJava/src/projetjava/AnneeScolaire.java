/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.ArrayList;

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
   private ArrayList<Trimestre> liste_t;
   
    public AnneeScolaire(int m_id, int m_anneedebut) {
        id=m_id;
        anneedebut = m_anneedebut;
        
    }
     public ArrayList<Trimestre> getListeT()
    {
        return liste_t;
    }
    
    public void setListeT(ArrayList<Trimestre> liste_t)
    {
        this.liste_t = liste_t;
    }
    
    //methode ajout trimestre
    public void addtrim(Trimestre t)
    {
        this.liste_t.add(t);
    }
    
    //methode suppression d'un trimestre
    public void supprtrim(Trimestre t)
    {
        this.liste_t.remove(t);
    }
    
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
    
    public int getAnneeDeb() 
    {
        return anneedebut;
    }

    public void setAnneeDeb(int anneedeb) 
    {
        this.anneedebut = anneedeb;
    }

    //calcul et affichage de la periode
    public void Periode() {
        int anneefin;
        anneefin = (anneedebut) + 1;
        System.out.println(anneedebut + "/" + anneefin);
    }
}
