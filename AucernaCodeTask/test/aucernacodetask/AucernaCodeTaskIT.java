/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aucernacodetask;

import aucerna.entities.Group;
import aucerna.entities.Well;
import aucerna.welltypes.WellTypes;
import java.util.LinkedHashMap;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author muhammadakhtar
 */
public class AucernaCodeTaskIT {

    public AucernaCodeTaskIT() {
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
     * Test of main method, of class AucernaCodeTask.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        Importer importer = new Importer();
        List<Well> wells = importer.getWells("Y:\\NetBeansProject\\bublTestCode\\AucernaCodeTask\\src\\aucerna\\files\\testdata.txt");
        List<Group> groups = importer.getGroups("Y:\\NetBeansProject\\bublTestCode\\AucernaCodeTask\\src\\aucerna\\files\\testdata.txt");

        LinkedHashMap<Group, List<Well>> groupsWithWell = AucernaCodeTask.addWellsToGroup(wells, groups);
        System.out.println(groupsWithWell.size());

    }
}



