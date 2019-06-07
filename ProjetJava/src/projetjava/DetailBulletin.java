/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lea
 */
public class DetailBulletin {

    private int id;
    private String appreciation;
    private int nbNotes;
    private ArrayList<Evaluation> evaluations;
    private Enseignement E;
//clé secondaire :  Bulletin.id, Enseignement.id
    
    public DetailBulletin(int m_id, String m_appreciation,int m_nbNotes,ArrayList<Evaluation> m_evaluations) {
        id=m_id;
        appreciation = m_appreciation;
        m_evaluations=new ArrayList(nbNotes);
        evaluations=m_evaluations;
        
    }
    
    
    // je me suis un peu trompé avec le main
    public DetailBulletin(){
    Evaluation newEval;
    double note;
    String appreciationE;
    
    for (int i=0; i<nbNotes; i++)
    { Scanner saisieUtilisateur = new Scanner(System.in);
    System.out.println("Veuillez saisir une note :");
    note=saisieUtilisateur.nextDouble(); 
     System.out.println("Veuillez saisir une appréciation :");
    appreciationE=saisieUtilisateur.next();
    newEval=new Evaluation(note,appreciationE);
// si on doit rajouter id, id=taille tableau avec toutes les evalutions
        evaluations.add(newEval);
    }
    
    }
    
    //methode pour calculer la moyenne
    public double Moyenne(){
        double moyenne;
        double tampon=0;
    for (int i=0; i<evaluations.size() ; i++)
    {
        tampon=tampon+evaluations.get(i).getNote();
    }
    moyenne=tampon/evaluations.size();
    return moyenne;
    }
    
     public ArrayList<Evaluation> gettabeval() 
    {
        return evaluations;
    }

    public void settabeval(ArrayList<Evaluation> m_evaluations) 
    {
       evaluations =  m_evaluations;
    }
     public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
     public int getNbNote() 
    {
        return nbNotes;
    }

    public void setNbNote(int m_nbNotes) 
    {
        nbNotes =  m_nbNotes;
    }
    
     public String getAppreciation() 
    {
        return appreciation;
    }

    public void setAppreciation(String appreciation) 
    {
        this.appreciation = appreciation;
    }
    
}
