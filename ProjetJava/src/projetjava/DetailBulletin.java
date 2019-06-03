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
public class DetailBulletin {

    private int id;
    private String appreciation;
//clé secondaire :  Bulletin.id, Enseignement.id
    
    public DetailBulletin(String m_appreciation) {
        appreciation = m_appreciation;
    }
}
