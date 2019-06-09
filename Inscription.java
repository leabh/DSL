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
public class Inscription {

    private int id;
    //clé secondaire : Classe.id, Personne.id
    private Classe C;
    //private ArrayList<Bulletin> bulletins = new ArrayList<>();
    
    public Inscription(){}
    
    public Inscription(int id)
    {
        this.id = id;
    }

 public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
     
    public Classe getClasse() 
    {
        return C;
    }

    public void setClasse(Classe m_C) 
    {
        C = m_C;
    }
    
    /*public ArrayList<Bulletin> getBulletin()
    {
        return bulletins;
    }
    
    public void setBulletin(ArrayList<Bulletin> bulletins)
    {
        this.bulletins = bulletins;
    }
        
     public void addBulletin(Bulletin b) {
        bulletins.add(b);
    }
*/
}
