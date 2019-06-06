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
public class Classe {
  private int id;
  private String nom;
  private AnneeScolaire A;
  private Niveau N;
  //cle secondaire :  Ecole.id, Niveau.id, AnnéeScolaire.id
  public Classe(int m_id,String m_nom){
  id=m_id;
  nom=m_nom;
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
    public AnneeScolaire getAnneeScolaire() 
    {
        return A;
    }

    public void setAnneeScolaire(AnneeScolaire m_A) 
    {
        m_A = A;
    }
    public Niveau getNiveau() 
    {
        return N;
    }

    public void setNiveau(Niveau m_N) 
    {
        m_N = N;
    }
  
}
