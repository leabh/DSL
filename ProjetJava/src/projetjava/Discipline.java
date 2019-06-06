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
public class Discipline {

    private int id;
    private String nom;
    private ArrayList<Discipline> Liste = new ArrayList<>();

    public Discipline(int m_id,String m_nom) {
        id=m_id;
        nom = m_nom;
    }
    //Ajouter une Discipline à la liste

    public void ajouterListe(Discipline D) {

        Liste.add(D);
    }
     public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
     public ArrayList<Discipline> getDiscipline() 
    {
        return Liste;
    }

    public void setDiscipline(ArrayList<Discipline> m_Liste) 
    {
        m_Liste = Liste;
    }
     public String getNom() 
    {
        return nom;
    }

    public void setNom(String m_nom) 
    {
        m_nom = nom;
    }
}
