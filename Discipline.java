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
public class Discipline {

    private int id;
    private String nom;
    

    public Discipline(int m_id, String m_nom) {
        id = m_id;
        nom = m_nom;
        
    }

    public Discipline() {}

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
        nom = m_nom;
    }

}
