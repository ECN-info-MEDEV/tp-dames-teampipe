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

    
    public void deplacer(String horizontal, String vertical) {
        if (vertical.equals("u")) {
            this.setY((this.getY() + 1));
        } else if (vertical.equals("d")) {
            this.setY((this.getY() - 1));
        }
        
        
        if (horizontal.equals("r")) {
            this.setX((this.getX() + 1));         

        } else if (horizontal.equals("l")) {
            this.setX((this.getX() - 1));

        }
    }

}
