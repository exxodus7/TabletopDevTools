package com.schroetech.game.object;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lauren
 */
public class DiceTest {

    /**
     * Test of setValue and getValue methods, of class Dice.
     */
    @Test
    public void testSetValueAndGetValue() {
        System.out.println("Testing setValue and getValue");
        Dice die = new Dice(6);
        int dieValue = die.getValue();
        assertTrue(dieValue > 0 && dieValue <= 6);
        die.setValue(7);
        assertEquals(dieValue, die.getValue());
        die.setValue(3);
        assertEquals(3, die.getValue());
    }

    /**
     * Test of getNumSides method, of class Dice.
     */
    @Test
    public void testGetNumFaces() {
        System.out.println("Testing getNumFaces");
        Dice die = new Dice(6);
        assertEquals(6, die.getNumFaces());
    }
    
}