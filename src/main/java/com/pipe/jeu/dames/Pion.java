/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pipe.jeu.dames;

/**
 *
 * @author felipelavila
 */
public class Pion {
    private int x;
    private int y;
    private int couleur;
    public boolean isDama;

    public Pion(int x, int y, int couleur) {
        this.x = x;
        this.y = y;
        this.couleur = couleur;
        this.isDama = false; 
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCouleur() {
        return couleur;
    }
    public boolean isDame(){
        return this.isDama; 
    }
        

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }
    public void deplacer(String direction){
        if(this.couleur == 0){
            setY(this.y+1); 
            if(direction == "droite"){
                setX(this.x+1); 
            }
            else if(direction == "gauche"){
                setX(this.x-1);
            }
            if (this.y==9){
                this.isDama = true; 
            }
            
        }
        else{
            setY(this.y-1); 
            if(direction == "droite"){
                setX(this.x+1); 
            }
            else if(direction == "gauche"){
                setX(this.x-1);
            }
        }
        
        
    }
    
    
    
}
