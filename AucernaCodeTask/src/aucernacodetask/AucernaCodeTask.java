/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aucernacodetask;

import aucerna.entities.Group;
import aucerna.entities.Well;
import aucerna.welltypes.WellTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author muhammadakhtar
 */
public class AucernaCodeTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Importer importer = new Importer();

        //Change the file location to your desired location, I made use of csv files which I believe was what genuinely required from this
        List<Well> wells = importer.getWells("Y:\\NetBeansProject\\bublTestCode\\AucernaCodeTask\\src\\aucerna\\files\\data.txt");
        List<Group> groups = importer.getGroups("Y:\\NetBeansProject\\bublTestCode\\AucernaCodeTask\\src\\aucerna\\files\\data.txt");
        
        LinkedHashMap<Group, List<Well>> groupsWithWell = addWellsToGroup(wells, groups);

          for (Map.Entry<Group, List<Well>> allMachines : groupsWithWell.entrySet()) {
            List<Well> values = allMachines.getValue();
            Group key = allMachines.getKey();

            System.out.println( key + "\n" + values);

        }

    }


    public static WellTypes setWellType(int xtop, int ytop, int xbot, int ybot) {
        WellTypes wellTypes = null;
        int calXCords = xtop - xbot;
        int calYCords = ytop - ybot;

        if (Math.abs(calXCords) == 0 && Math.abs(calYCords) == 0) {
            wellTypes = WellTypes.Vertical;
        } else if (Math.abs(calXCords) >= 1 && Math.abs(calXCords) <= 5 || Math.abs(calYCords) >= 1 && Math.abs(calYCords) <= 5) {
            wellTypes = WellTypes.Slanted;
        } else if (Math.abs(calXCords) > 5 || Math.abs(calYCords) > 5) {
            wellTypes = WellTypes.Horizontal;
        }
        return wellTypes;
    }

   

    public static LinkedHashMap<Group, List<Well>> addWellsToGroup(List<Well> wells, List<Group> groups) {
        List<Well> tempWells;
        LinkedHashMap<Group, List<Well>> wellsCollection = new LinkedHashMap<>();

        for (Group group : groups) {
            wellsCollection.put(group, tempWells = new ArrayList<>());
            for (Well well : wells) {

                if (well.getXtop() >= group.getXminDistance() && well.getXtop() <= group.getXmaxDistance()
                       && well.getYtop() >= group.getYminDistance() && well.getYtop() <= group.getYmaxDistance()) {

                    tempWells.add(well);
                }
            }
        }

        return wellsCollection;
    }



}
