/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.inf1.ataribreakout.model;

/**
 *
 * @author daans
 */
public class Balk {
    private double x, dX;
    private double y, dY;
        

    public Balk() {
        this(0,0,0,0);
    }
    public Balk(double x, double y, double dX, double dY) {
        this.x = x;
        this.y = y;
        this.dX = dX;
        this.dY = dY;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
        
    }

    public double getdX() {
        return dX;
    }

    public double getdY() {
        return dY;
    }
    
    public void rechts(){
        dX = 5;
        dY = 0;
    }
    public void links(){
        dX = -5;
        dY = 0;
    }
    public void pauze(){
        dX = 0;
        dY = 0;
    }
    public void tick(){
      x = x + dX;
      y = y + dY;
    }
}
