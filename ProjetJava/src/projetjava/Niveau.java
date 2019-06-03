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
public class Niveau {

    private int id;
    private String nom;
    private ArrayList<Niveau> Liste = new ArrayList<>();

    /*  public  Niveau() {
   id=0;
    
}*/
    public Niveau(String m_nom) {
      
        nom = m_nom;
    }

    //ajouter un niveau à la liste des niveau
    public void NouveauNiveau(Niveau N) {
        Liste.add(N);
    }

}
