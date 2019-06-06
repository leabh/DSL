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
public class Bulletin {

    private int id;
    private String appreciation;
    private int id_trimestre;
    private int id_inscription;

    
    public Bulletin(){}
    
    public Bulletin(int id, String m_appreciation, int id_trimestre, int id_inscription) 
    {
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
}
