/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pipe.jeu.dames;
import java.io.IOException;

/**
 *
 * @author felipelavila
 */
public class JeuDames {

    public static void main(String[] args) {
        Plan jeu = new Plan();
        int nombreDeCoups = 1;
        for (int i = 0; i < nombreDeCoups; i++) {
            jeu.jouerCoup(); 
            
        }
        jeu.enregistrerJeu("JeuSauve2");
        jeu.enregistrerJeu("JeuSauve3");
        try{
        jeu.ouvrirJeu();
        jeu.afficherJeu();
        } catch(IOException e){
            System.out.print("Excepetion OuvrirJeu"+e);
        }
    }
    
}
