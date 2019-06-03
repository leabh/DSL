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
public class Evaluation {

    private int id;
    private String appreciation;
    private double note;
    //clé secondaire : DetailBulletin.id

    public Evaluation(double m_note, String m_appreciation) {
        note = m_note;
        appreciation = m_appreciation;
    }
}
