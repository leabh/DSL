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
    private Classe classe;
    private Discipline discipline;
      // clé secondaire : Classe.id, Discipline.id, Personne.id
  
   public Enseignement(){}
    
   public Enseignement(int id)
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
        return classe;
    }

    public void setClasse(Classe c) 
    {
        classe = c;
    }
    
     public Discipline getDiscipline() 
    {
        return discipline;
    }

    public void setDiscipline(Discipline d) 
    {
        discipline = d;
    }
}
