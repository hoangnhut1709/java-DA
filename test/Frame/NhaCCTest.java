/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import model.NhaCungCap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hai Au
 */
public class NhaCCTest {
    
    public NhaCCTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of fillComboBox method, of class NhaCC.
     */
    @Test
    public void testFillComboBox() {
        System.out.println("fillComboBox");
        NhaCC instance = new NhaCC();
        instance.fillComboBox();
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of load method, of class NhaCC.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        NhaCC instance = new NhaCC();
        instance.load();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setModel method, of class NhaCC.
     */
    @Test
    public void testSetModel() {
        System.out.println("setModel");
        NhaCungCap model = null;
        NhaCC instance = new NhaCC();
        instance.setModel(model);
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of getModel method, of class NhaCC.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        NhaCC instance = new NhaCC();
        NhaCungCap expResult = null;
        NhaCungCap result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of insert method, of class NhaCC.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        NhaCC instance = new NhaCC();
        instance.insert();
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of update method, of class NhaCC.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        NhaCC instance = new NhaCC();
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of delete method, of class NhaCC.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        NhaCC instance = new NhaCC();
        instance.delete();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of edit method, of class NhaCC.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        NhaCC instance = new NhaCC();
        instance.edit();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of clear method, of class NhaCC.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        NhaCC instance = new NhaCC();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setStatus method, of class NhaCC.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        boolean insertable = false;
        NhaCC instance = new NhaCC();
        instance.setStatus(insertable);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of isvalid method, of class NhaCC.
     */
    @Test
    public void testIsvalid() {
        System.out.println("isvalid");
        NhaCC instance = new NhaCC();
        boolean expResult = false;
        boolean result = instance.isvalid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of check method, of class NhaCC.
     */
    @Test
    public void testCheck() {
        System.out.println("check");
        NhaCC instance = new NhaCC();
        boolean expResult = false;
        boolean result = instance.check();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of main method, of class NhaCC.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NhaCC.main(args);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
}
