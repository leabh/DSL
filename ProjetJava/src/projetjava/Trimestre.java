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
    private int debut;
    private int fin;
      //cle secondaire :  AnnéeScolaire.id

    /*  public  Trimestre() {
      numero=0;
      debut=0;
      fin=0;
    
}*/
    public Trimestre(int m_numero, int m_debut, int m_fin) {

        numero = m_numero;
        debut = m_debut;
        fin = m_fin;
    }
}
