/*
 * Copyright (c) 2017. Phasmid Software
 */

package edu.neu.coe.info6205.bqs;

import edu.neu.coe.info6205.NotReadyTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class BagTest {

    /**
     * Test method for Bag
     */
    @Category(NotReadyTests.class)
    @Test
    public void testBag() {
        Bag<Integer> bag = new Bag_Array<>();
        assertTrue(bag.size() == 0);
        assertTrue(bag.isEmpty());
        assertFalse((bag.iterator()).hasNext());
        bag.add(1);
        assertTrue(bag.size() == 1);
        assertFalse(bag.isEmpty());
        assertTrue((bag.iterator()).hasNext());
        assertEquals(bag.iterator().next(), new Integer(1));
    }

}
