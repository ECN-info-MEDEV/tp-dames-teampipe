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
        try{
        jeu.enregistrerJeu("JeuSauve2");
        } catch(IOException e){ e.printStackTrace();}
        try{
        jeu.enregistrerJeu("JeuSauve3");
        } catch(IOException e){e.printStackTrace();}
        try{
        jeu.ouvrirJeu();
        jeu.afficherJeu();
        } catch(IOException e){
             e.printStackTrace();
        }
    }
    
}
