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
public class Bal {
    private double x, dX;
    private double y, dY;

   public Bal() {
      initBall(); 
   }
    public Bal(double x, double y) {
        this.x = 320;
        this.y = 100;
        dX = 0;
        dY = 0;
    }
    
    private void initBall() {
        dX = 1;
        dY = -1;
    }
    //public Bal() {
    //  this(0,0);
    //}

   
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
    public void tick(){
      x = x + dX;
      y = y + dY;
    }
}

