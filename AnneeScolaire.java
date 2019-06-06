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
    private int anneedebut;
    private ArrayList<Trimestre> liste_t;
    
    
    public AnneeScolaire()
    {}
    
    public AnneeScolaire(int id, int m_anneedebut) {
        this.id = id;
        anneedebut = m_anneedebut;
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
        return id;
    }

    public void setAnneeDeb(int anneedeb) 
    {
        this.anneedebut = anneedeb;
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

    //calcul et affichage de la periode
    public void Periode() {
        int anneefin;
        anneefin = (anneedebut) + 1;
        System.out.println(anneedebut + "/" + anneefin);
    }
}
