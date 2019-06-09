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
public class DetailBulletin {

    private int id, idB, idE;
    private String appreciation;
    private ArrayList<Evaluation> evaluations = new ArrayList<>();
    private float moy;
//clé secondaire :  Bulletin.id, Enseignement.id
    
    public DetailBulletin(int id, String m_appreciation, int idB, int idE) {
        this.idB = idB;
        this.idE = idE;
        this.id = id;
        appreciation = m_appreciation;
    }
    
    public DetailBulletin(){}
    
    
     public ArrayList<Evaluation> getEval() 
    {
        return evaluations;
    }

    public void setEval(ArrayList<Evaluation> m_evaluations) 
    {
       evaluations =  m_evaluations;
    }
    
    public void AddEval(Evaluation e) 
    {
       evaluations.add(e);
    }
    
     public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
    
     public int getIdBulletin() 
    {
        return idB;
    }

    public void setIdBulletin(int idB) 
    {
        this.idB = idB;
    }
    
     public int getIdEnseignement() 
    {
        return idE;
    }

    public void setIdEnseignement(int idE) 
    {
        this.idE = idE;
    }
        
     public String getAppreciation() 
    {
        return appreciation;
    }

    public void setAppreciation(String appreciation) 
    {
        this.appreciation = appreciation;
    }
    
   /* public Enseignement getEnseignement() 
    {
        return e;
    }

    public void setEnseignement(Enseignement e) 
    {
        this.e = e;
    }*/
    
    public float moyenne(ArrayList<Evaluation> e)
    {
        double somme = 0;
        for (int i=0; i<e.size(); i++)
        {  
            somme += e.get(i).getNote();
        }
        
        moy = (float) somme/e.size();
        return moy;
    }
    
    public float getMoy() 
    {
        return moy;
    }

    public void setMoy(float moy) 
    {
        this.moy = moy;
    }
    
}
