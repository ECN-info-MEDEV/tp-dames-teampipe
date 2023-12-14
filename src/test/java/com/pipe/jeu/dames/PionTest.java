/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.pipe.jeu.dames;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hudsonteixeira
 */
public class PionTest {
    
    public PionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of deplacer method, of class Pion.
     */
    @Test
    public void testDeplacer() {
        System.out.println("Test deplacer");
        /**
         * 
        //Peon Blanc
        String dirBL ="l";
        String dirBR ="r";
        Pion instanceB =  new Pion(0, 0, 0,1);
        instanceB.deplacer(dirBL);
        //check left up
        assertEquals(-1,instanceB.getX());
        assertEquals(1,instanceB.getY());
        //check right up
        instanceB.deplacer(dirBR);
        assertEquals(0,instanceB.getX());
        assertEquals(2,instanceB.getY());
        //check if becomes Dame
        instanceB.setY(8);
        instanceB.deplacer(dirBR);
        assertEquals(true,instanceB.isDame());
        instanceB.setY(7);
        instanceB.setIsDama(false);
        assertEquals(false,instanceB.isDame());
        
        //Peon Noir
        String dirNL ="l";
        String dirNR ="r";
        Pion instanceN =  new Pion(8, 9, 1,1);
        instanceN.deplacer(dirNL);
        //check left up
        assertEquals(7,instanceN.getX());
        assertEquals(8,instanceN.getY());
        //check right up
        instanceN.deplacer(dirNR);
        assertEquals(8,instanceN.getX());
        assertEquals(7,instanceN.getY());
        //check if becomes Dame
        instanceN.setY(1);
        instanceN.deplacer(dirBR);
        assertEquals(true,instanceN.isDame());
        instanceN.setY(2);
        instanceN.setIsDama(false);
        assertEquals(false,instanceN.isDame()); */
           }
        
        /**
     * Test of mager method, of class Pion.
     */
    @Test
    public void testManger() {
        //Verifie si les pions sont au même endroit et on peu manger
        Plan jeu = new Plan();
        ArrayList<Pion> listPions = new ArrayList<Pion>();
        Pion instanceA =  new Pion(1, 1, 0,1);
        listPions.add(instanceA);
        Pion instanceB =  new Pion(1, 1, 1,1);
        listPions.add(instanceB);
        Pion instanceC =  new Pion(0, 0, 1,1);
        listPions.add(instanceC);
        jeu.setPions(listPions);
        instanceA.manger(instanceB, jeu);
        ArrayList<Pion> expectedArray = new ArrayList<Pion>();
        expectedArray.add(instanceA);
        expectedArray.add(instanceC);
        assertEquals(expectedArray, jeu.getPions());
        //Verifie si les pions sont pas au même endroit et on ne peut pas manger
        instanceA.manger(instanceC, jeu);
        assertEquals(expectedArray, jeu.getPions());
        //Verifie si les pions sont au même endroit et on ne peut pas manger au cause de dif coleur
        Pion instanceD =  new Pion(1, 1, 0,1);
        listPions.add(instanceD);
        expectedArray.add(instanceD);
        instanceA.manger(instanceD, jeu);
        assertEquals(expectedArray, jeu.getPions());
    }

    
}
