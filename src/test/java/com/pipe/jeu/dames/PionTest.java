/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.pipe.jeu.dames;

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
        assertEquals(false,instanceN.isDame());
           }

    
}
