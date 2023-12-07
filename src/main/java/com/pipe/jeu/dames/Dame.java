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

    public Dame(int x, int y, int couleur) {
        super(x, y, couleur);
        this.isDama = true;

    }

    public void deplacer(String horizontal, String vertical) {
        if (vertical == "u") {
            setX(this.getY() + 1);
        } else if (vertical == "d") {
            setX(this.getY() - 1);
        }
        
        
        if (horizontal == "r") {
            setX(this.getX() + 1);
        } else if (horizontal == "l") {
            setX(this.getX() - 1);
        }

    }

}
