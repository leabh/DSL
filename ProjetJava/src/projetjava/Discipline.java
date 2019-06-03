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
public class Discipline {

    private int id;
    private String nom;
    private ArrayList<Discipline> Liste = new ArrayList<>();

    public Discipline(String m_nom) {
        nom = m_nom;
    }
    //Ajouter une Discipline à la liste

    public void ajouterListe(Discipline D) {

        Liste.add(D);
    }
}
