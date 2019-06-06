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
public class Trimestre {

    private int id;
    private int numero;
    private int id_annee;
    private int debut;
    private int fin;

    /*  public  Trimestre() {
      numero=0;
      debut=0;
      fin=0; }*/
    
    public Trimestre(int id, int m_numero, int m_debut, int m_fin) {
        this.id = id;
        numero = m_numero;
        debut = m_debut;
        fin = m_fin;
        
    }
    
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
    
    public int getNum() 
    {
        return numero;
    }

    public void setNum(int numero) 
    {
        this.numero = numero;
    }
    
    public int getDebut() 
    {
        return debut;
    }

    public void setDebut(int debut) 
    {
        this.debut = debut;
    }
    
    public int getFin() 
    {
        return fin;
    }

    public void setFin(int fin) 
    {
        this.fin = fin;
    }
    
    
}
