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
public class Niveau {

    private int id;
    private String nom;
    private ArrayList<Niveau> Liste = new ArrayList<>();

    /*  public  Niveau() {
   id=0;
    
}*/
    public Niveau(int m_id,String m_nom) {
      id=m_id;
        nom = m_nom;
    }

    //ajouter un niveau à la liste des niveau
    public void NouveauNiveau(Niveau N) {
        Liste.add(N);
    }
     public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
    
     public ArrayList<Niveau> getListe() 
    {
        return Liste;
    }

    public void setListe(ArrayList<Niveau> m_Liste) 
    {
       Liste = m_Liste;
    }
     public String getNom() 
    {
        return nom;
    }

    public void setNom(String m_nom) 
    {
        nom = m_nom;
    }

}
