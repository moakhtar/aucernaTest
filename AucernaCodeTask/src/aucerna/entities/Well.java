/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aucerna.entities;

import aucerna.welltypes.WellTypes;

/**
 *
 * @author muhammadakhtar
 */
public class Well {
    String name;
    int xtop;
    int ytop;
        int xbot;
    int ybot;
    WellTypes wellTypes;

    public Well(String name, int xtop, int ytop, int xbot, int ybot, WellTypes wellTypes) {
        this.name = name;
        this.xtop = xtop;
        this.ytop = ytop;
        this.xbot = xbot;
        this.ybot = ybot;
        this.wellTypes = wellTypes;
    }

    
    public String getName() {
        return name;
    }

    public int getXtop() {
        return xtop;
    }

    public int getYtop() {
        return ytop;
    }

    public int getXbot() {
        return xbot;
    }

    public int getYbot() {
        return ybot;
    }


    public WellTypes getWellTypes() {
        return wellTypes;
    }

    @Override
    public String toString() {
        return "Well" + "\nname=" + name + "\nxtop=" + xtop + "\nytop=" + ytop + "\nxbot=" + xbot + "\nybot=" + ybot + "\nwellTypes=" + wellTypes + '}';
    }


    
    
    
    
}
