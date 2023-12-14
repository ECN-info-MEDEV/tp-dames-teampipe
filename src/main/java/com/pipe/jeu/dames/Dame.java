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
        if (dir == 0) {
            if (this.getY() + longueur < 10 && this.getX() - longueur >= 0) {
                this.setY(this.getY() + longueur);
                this.setX(this.getX() - longueur);
            }
        } else if (dir == 1) {
            if (this.getY() + longueur < 10 && this.getX() + longueur < 10) {
                this.setY(this.getY() + longueur);
                this.setX(this.getX() + longueur);
            }
        } else if (dir == 2) {
            if (this.getY() + longueur >= 0 && this.getX() + longueur < 10) {
                this.setY(this.getY() - longueur);
                this.setX(this.getX() + longueur);
            }
        } else if (dir == 3) {
            if (this.getY() - longueur >= 0 && this.getX() - longueur >= 0) {
                this.setY(this.getY() - longueur);
                this.setX(this.getX() - longueur);
            }
        }
    }

}
