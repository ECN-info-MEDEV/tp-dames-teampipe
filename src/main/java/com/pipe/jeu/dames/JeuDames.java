/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pipe.jeu.dames;

/**
 *
 * @author felipelavila
 */
public class JeuDames {

    public static void main(String[] args) {
        Plan jeu = new Plan();
        int nombreDeCoups = 30;
        for (int i = 0; i < nombreDeCoups; i++) {
            jeu.jouerCoup(); 
            jeu.afficherJeu();
        }
        
    }
}
