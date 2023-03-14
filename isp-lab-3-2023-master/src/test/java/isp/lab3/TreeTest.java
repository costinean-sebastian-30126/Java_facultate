package isp.lab3;
 

import isp.lab3.exercise1.Tree;
import org.junit.Test;
import static org.junit.Assert.*;

 
public class TreeTest {
    @Test
    public void testGrowWithPositiveMeters() {
        Tree t1 = new Tree() ;
        t1.grow(5);
        assertEquals(20, t1.getHeight());
    }
 
    @Test
    public void testGrowWithZeroMeters() {
        Tree t1 = new Tree();
        t1.grow(0);
        assertEquals(15, t1.getHeight());
    }
 
    @Test
    public void testGrowWithNegativeMeters() {
        Tree t1 = new Tree();
        t1.grow(-2);
        assertEquals(15, t1.getHeight());
    }
 
    @Test
    public void testToString() {
        Tree myTree = new Tree();
        assertEquals("The new height of the tree is 15 meters.", myTree.toString());
    }
}