/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pipe.jeu.dames;

import java.util.ArrayList;

/**
 *
 * @author felipelavila
 */
public class Plan {
    private int[][] damier;
    private ArrayList<Pion> pions;

    public Plan(int[][] damier, ArrayList<Pion> pions) {
        this.damier = damier;
        this.pions = pions;
    }
    
    public Plan() {
        this.damier = new int[10][10];
        this.pions = new ArrayList<Pion>();
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
   
    
    
}
