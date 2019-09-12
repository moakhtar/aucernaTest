/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aucernacodetask;

import aucerna.entities.Group;
import aucerna.entities.Well;
import aucerna.welltypes.WellTypes;
import static aucernacodetask.AucernaCodeTask.setWellType;

/**
 *
 * @author muhammadakhtar
 */
public class ImportedData {
    
    public static Well createWell(String[] metadata) {
        String name = metadata[1];

        float strToFl = Float.parseFloat(metadata[2]);
        int xtop = Math.round(strToFl);

        float strToFl2 = Float.parseFloat(metadata[3]);
        int ytop = Math.round(strToFl2);

        float strToFl3 = Float.parseFloat(metadata[4]);
        int xbot = Math.round(strToFl3);

        float strToFl4 = Float.parseFloat(metadata[5]);
        int ybot = Math.round(strToFl4);

        WellTypes wellType = setWellType(xtop, ytop, xbot, ybot);

        return new Well(name, xtop, ytop, xbot, ybot, wellType);
    }

    

    public static Group createGroup(String[] metadata) {
        String name = metadata[1];

        float strToFl = Float.parseFloat(metadata[2]);
        int xcord = Math.round(strToFl);

        float strToFl2 = Float.parseFloat(metadata[3]);
        int ycord = Math.round(strToFl2);

        float strToFl3 = Float.parseFloat(metadata[4]);
        int distance = Math.round(strToFl3);

        return new Group(name, xcord, ycord, distance);
    }
    
}
