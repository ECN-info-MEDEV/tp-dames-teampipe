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
    private int id;
    public boolean isDama;

    public Pion(int x, int y, int couleur, int id) {
        this.x = x;
        this.y = y;
        this.couleur = couleur;
        this.isDama = false;
        this.id = id;
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

    public boolean isDame() {
        return this.isDama;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    public void deplacer(String direction) {
        if (this.couleur == 0) {
            if (this.y + 1 < 10) {
                setY(this.y + 1);
            }
            if (direction.equals("r")) {
                if (this.x + 1 < 10) {
                    setX(this.x + 1);
                }
            } else if (direction.equals("l")) {
                if (this.x - 1 >= 0) {
                    setX(this.x - 1);
                }
            }
            if (this.y == 9) {
                this.isDama = true;
            }

        } else {
            if (this.y - 1 >= 0) {
                setY(this.y - 1);
            }
            if (direction.equals("r")) {
                if (this.x + 1 < 10) {
                    setX(this.x + 1);
                }
            } else if (direction.equals("l")) {
                if (this.x - 1 >= 10) {
                    setX(this.x - 1);
                }
            }
            if (this.y == 0) {
                this.isDama = true;
            }
        }

    }
    public void manger(Pion adversaire, Plan plan) {
        if(adversaire.getX()==this.getX()&&adversaire.getY()==this.getY()&&adversaire.getCouleur()!=this.getCouleur()){
            System.out.print(plan.getPions().size());
            plan.getPions().remove(adversaire);
        }
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIsDama() {
        return isDama;
    }

    public void setIsDama(boolean isDama) {
        this.isDama = isDama;
    }
    
    
}
