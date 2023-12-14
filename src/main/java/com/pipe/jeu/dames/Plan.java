package com.pipe.jeu.dames;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
                    Pion pion = new Pion(i, j, 0, pions.size()); 
                    this.pions.add(pion); 
                }
                else if (this.damier[i][j] == 1 && i > 5) {
                    Pion pion = new Pion(i, j, 1, pions.size()); 
                    this.pions.add(pion); 
                }
                
            }
        }
    }
    
    public void jouerCoup() {
        Scanner sc = new Scanner(System.in);
        String tir = "";
        afficherJeu();
        if (joueurActuel == 0) {
            System.out.println("Tour du joueur NOIR");
            tir = sc.nextLine();
            
            joueurActuel = 1; 
            
        } else {
            System.out.println("Tour du joueur BLANC");
            tir = sc.nextLine();
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
                            System.out.print( pion.getId());
                            pionPresent = true;
                        }else{
                            System.out.print(pion.getId());
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
    public void checkDames(){
        for (int i = 0; i < pions.size(); i++) {
            if (pions.get(i).isDame()){
                int x = pions.get(i).getX();
                int y = pions.get(i).getY();
                int c = pions.get(i).getCouleur();
                pions.remove(i);
                Dame dame = new Dame(x, y, c, 200);
                
            }
            
       }
    }  
   
    
    public void enregistrerJeu(String nombreArchivo) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(nombreArchivo+".txt")));

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    boolean pionPresent = false;
                    for (Pion pion : pions) {
                        if (pion.getX() == i && pion.getY() == j) {
                            if (pion.getCouleur() == 1) {
                                writer.write(" N ");
                                pionPresent = true;
                            } else {
                                writer.write(" B ");
                                pionPresent = true;
                            }
                            break;
                        }
                    }
                    if (!pionPresent) {
                        writer.write(" - ");
                    }
                }
                writer.write("\n");
            }
            System.out.println("Le jeu a été enregistré dans le fichier : " + nombreArchivo);
            writer.close();
        } catch (IOException e) {
            System.err.println("Erreur lors de l'enregistrement du jeu : " + e.getMessage());
        }
    }
    
    public void ouvrirJeu() {
        this.damier = new int[10][10];
        this.pions = new ArrayList<Pion>();
        this.joueurActuel = 0;
        File carpeta = new File(System.getProperty("user.dir"));
        System.out.println("Choisissez le jeu à charger.");
        File[] archivos = new File[0];
        if (carpeta.exists() && carpeta.isDirectory()) {
            archivos = carpeta.listFiles((dir, nombre) -> nombre.toLowerCase().endsWith(".txt"));
            if (archivos != null) {
                int i = 0;
                for (File archivo : archivos) {
                    System.out.println(i+". "+archivo.getName());
                    i++;
                }
            } else {
                System.out.println("El directorio especificado no existe o no es una carpeta.");
            }
        
        }
        Scanner sc = new Scanner(System.in);
        int num = -1;
        do{
            num = sc.nextInt();
            
        } while(num < 0 || num >= archivos.length);
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivos[num]));
            String linea;
            int i = 0, j = 0;
            while ((linea = br.readLine()) != null) {
                String[] parti = linea.split(" ");
                for(String a : parti){
                    if(a == "N"){
                        Pion pion = new Pion(i, j, 0, pions.size()); 
                        this.pions.add(pion); 
                    }
                    else if(a == "B"){
                        Pion pion = new Pion(i, j, 1, pions.size()); 
                        this.pions.add(pion); 
                    }
                    j++;
                }
                i++;
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            // The finally block always executes.
         }
        
    }
}
