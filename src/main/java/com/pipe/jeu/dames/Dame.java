/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pipe.jeu.dames;

/**
 *
 * @author felipelavila
 */
public class Dame extends Pion {

    public Dame(int x, int y, int couleur, int id) {
        super(x, y, couleur, id);
    }

public void deplacerDame(int dir, int longueur) {
    int newY = this.getY();
    int newX = this.getX();
    
    switch (dir) {
        case 0:
            if (newY + longueur < 10 && newX - longueur >= 0) {
                newY += longueur;
                newX -= longueur;
            }
            break;
            
        case 1:
            if (newY + longueur < 10 && newX + longueur < 10) {
                newY += longueur;
                newX += longueur;
            }
            break;
            
        case 2:
            if (newY - longueur >= 0 && newX + longueur < 10) {
                newY -= longueur;
                newX += longueur;
            }
            break;
            
        case 3:
            if (newY - longueur >= 0 && newX - longueur >= 0) {
                newY -= longueur;
                newX -= longueur;
            }
            break;
    }
    
    this.setY(newY);
    this.setX(newX);
}

}
