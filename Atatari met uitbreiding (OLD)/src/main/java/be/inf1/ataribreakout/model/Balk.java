/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.inf1.ataribreakout.model;

import be.inf1.ataribreakout.App;

/**
 *
 * @author daans
 */
public class Balk {
    private double x, dX;
    private double y;
    private double width;
    private double height;
    
    /*
    standaard waardes voor de data members
    */
   
    public Balk() {
        this(0,0,0,250,50);
    }
    public Balk(double x, double y, double dX, double width, double height) {
        this.x = 300;
        this.y = y;
        this.dX = dX;
        this.width = width;
        this.height = height;
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
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }

    public void rechts(){
        dX = 5;
    }
    
    public void links(){
        dX = -5;
    }
    
    public void pauze(){
        dX = 0;
    }
    /*
    zorgt ervoor dat de pallet niet uit de window kan en dus aan de rand stopt
    */
    public void tick(){
        double newX = x + dX;
        
        if (newX >= 0 && newX <= App.WINDOW_WIDTH - width) {
            x = x + dX;
        }
    }
}
