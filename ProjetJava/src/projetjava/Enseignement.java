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
public class Enseignement {

    private int id;
    private Personne P;
    private Discipline D;
    private Classe C;
      // clé secondaire : Classe.id, Discipline.id, Personne.id
     public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
     public Personne getPersonne() 
    {
        return P;
    }

    public void setPersonne(Personne m_P) 
    {
        m_P = P;
    }
    public Classe getClasse() 
    {
        return C;
    }

    public void setClasse(Classe m_C) 
    {
        m_C = C;
    }
    
     public Discipline getDiscipline() 
    {
        return D;
    }

    public void setDiscipline(Discipline m_D) 
    {
        m_D = D;
    }
    
    
}
