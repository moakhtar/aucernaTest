/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aucerna.entities;

import java.util.List;

/**
 *
 * @author muhammadakhtar
 */
public class Group {
    String name;
    int x;
    int y;
    int distance;
    int xminDistance;
        int xmaxDistance;
    int yminDistance;
        int ymaxDistance;


    public Group(String name, int x, int y, int distance) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.distance = distance;
        this.xminDistance = x - distance;
        this.xmaxDistance = x + distance;
       this.yminDistance = y - distance;
       this.ymaxDistance = y + distance;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDistance() {
        return distance;
    }

    public int getXminDistance() {
        return xminDistance;
    }

    public int getXmaxDistance() {
        return xmaxDistance;
    }

    public int getYminDistance() {
        return yminDistance;
    }

    public int getYmaxDistance() {
        return ymaxDistance;
    }



    @Override
    public String toString() {
        return "Group{" + "name=" + name + ", x=" + x + ", y=" + y + ", distance=" + distance ;
    }


    


    
    
    
}
