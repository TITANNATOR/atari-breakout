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
public class Bal {
    private double x, dX;
    private double y, dY;
    private double radius;

   public Bal() {
      this(0,0,1,-1,10); 
   }
    public Bal(double x, double y, double dX, double dY, double radius) {
        this.x = 400;
        this.y = 400;
        this.radius = 10;
        this.dX = 0;
        this.dY = 0;
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
        dX = 3;
        dY = 0;
    }
    public void links(){
        dX = -3;
        dY = 0;
    }
    public void boven(){
        dX = 0;
        dY = 3;        
    }
    public void onder(){
        dX = 0;
        dY = -3;
    }
    /*
    gekopieerd van balk.java met aanpassingen
    */
    public void tick(){
        double newX = x + dX;
        double newY = y + dY;
        
        if (newX >= 0 && newX <= App.WINDOW_WIDTH - radius) {
            x = x + dX;
        }    
        if (newY >= 0 && newY <= App.WINDOW_HEIGHT - radius){
            y = y + dY;
        } 
    }

    public double getRadius() {
        return radius;
    }
    
    
    
    
}

