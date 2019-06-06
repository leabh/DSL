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
public class Personne {

    private int id;
    private String nom;
    private String prenom;
    private String type;
    private ArrayList<Bulletin> Bulletin= new ArrayList<>();

    public Personne(int m_id,String m_nom, String m_prenom, String m_type, ArrayList<Bulletin> m_bulletin) {
id=m_id;
        nom = m_nom;
        prenom = m_prenom;
        type = m_type;
        Bulletin = m_bulletin;
    }
    
     public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
     public String getNom() 
    {
        return nom;
    }

    public void setNom(String m_nom) 
    {
        m_nom = nom;
    }
     public String getPrenom() 
    {
        return prenom;
    }

    public void setPrenom(String m_prenom) 
    {
        m_prenom = prenom;
    }
     public String getType() 
    {
        return type;
    }

    public void setType(String m_type) 
    {
        m_type = type;
    }

}
