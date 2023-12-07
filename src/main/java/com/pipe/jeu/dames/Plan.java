package com.pipe.jeu.dames;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author felipelavila
 */
public class Plan {
    private int[][] damier;
    private ArrayList<Pion> pions;
    private int joueurActuel;

    public Plan(int[][] damier, ArrayList<Pion> pions) {
        this.damier = damier;
        this.pions = pions;
    }
    
    public Plan() {
        this.damier = new int[10][10];
        this.pions = new ArrayList<Pion>();
        this.joueurActuel = 0;
        initialiserDamier();
        initialiserPions();
    }
    
    private void initialiserDamier() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i + j) % 2 == 1) {
                    this.damier[i][j] = 1; 
                } else {
                    this.damier[i][j] = 0;
                }
            }
        }
    }
    
    private void initialiserPions() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (this.damier[i][j] == 1 && i < 4) {
                    Pion pion = new Pion(i, j, 0); 
                    this.pions.add(pion); 
                }
                else if (this.damier[i][j] == 1 && i > 5) {
                    Pion pion = new Pion(i, j, 1); 
                    this.pions.add(pion); 
                }
                
            }
        }
    }
    
    public void jouerCoup() {
        Scanner sc = new Scanner(System.in);
        String tir = "";
        if (joueurActuel == 0) {
            System.out.println("Tour du joueur NOIR");
            //tir = sc.nextLine();
            joueurActuel = 1; 
            
        } else {
            System.out.println("Tour du joueur BLANC");
            //tir = sc.nextLine();
            joueurActuel = 0; 
        }
    }
    
    public void afficherJeu() {
        System.out.println("État actuel du jeu :");
        System.out.println("---------------------");
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                boolean pionPresent = false;
                for (Pion pion : pions) {
                    if (pion.getX() == i && pion.getY() == j) {
                        if(pion.getCouleur() == 1){
                            System.out.print(" N ");
                            pionPresent = true;
                        }else{
                            System.out.print(" B ");
                            pionPresent = true;
                        }
                        break;
                    }
                }
                if (!pionPresent) {
                    System.out.print(" - ");
                }
            }
            System.out.println(); 
        }
        System.out.println("---------------------");
    }
}
