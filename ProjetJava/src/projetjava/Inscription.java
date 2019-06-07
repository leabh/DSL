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
    private Personne P;
    private Classe C;
    //clé secondaire : Classe.id, Personne.id
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
        P = m_P;
    }
    public Classe getClasse() 
    {
        return C;
    }

    public void setClasse(Classe m_C) 
    {
        C = m_C;
    }
}
