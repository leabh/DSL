/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Lea
 */
public class Bulletin {

    private int id;
    private int id_trimestre;
    private int id_inscription;
    private String appreciation;
    private AnneeScolaire A;
    private Trimestre T;
   // private HashMap<AnneeScolaire,Trimestre> Date;
    private ArrayList<DetailBulletin> DetailBulletin;
    
// clé secondaire : Trimestre.id, Inscription.id
    
    public Bulletin(int id, String m_appreciation, int id_trimestre, int id_inscription) {
        this.id = id;
        this.id_trimestre = id_trimestre;
        this.id_inscription = id_inscription;
        appreciation = m_appreciation;
        
    }
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
    
    public String getAppreciation() 
    {
        return appreciation;
    }

    public void setAppreciation(String appreciation) 
    {
        this.appreciation = appreciation;
    }
    
    public int getIdT() 
    {
        return id_trimestre;
    }

    public void setIdT(int id_trimestre) 
    {
        this.id_trimestre = id_trimestre;
    }
    
    public int getIdI() 
    {
        return id_inscription;
    }

    public void setIdI(int id_inscription) 
    {
        this.id_inscription = id_inscription;
    }
    public AnneeScolaire getAnneeScolaire() 
    {
        return A;
    }

    public void setAnneeScolaire(AnneeScolaire m_A) 
    {
        A = m_A;
    }
    public ArrayList<DetailBulletin> getDetailBulletin() 
    {
        return DetailBulletin;
    }

    public void setAnneeScolaire(ArrayList<DetailBulletin> m_DB) 
    {
        DetailBulletin = m_DB;
    }
    
}
