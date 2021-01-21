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
public class Brick {
    private double x;
    private double y;
    private double width;
    private double height;
    private double score;
    private boolean kapot;
    
    public Brick() {
        this(0,0,100,10);
    }
    /*
    moet de double score en boolean kapot hier nog bij? waarschijnlijk niet 
    */
    public Brick(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.kapot = false;
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
    public boolean isKapot() {
        return kapot;
    }
    
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = 0;
    }

    //boolean isKapot() {
    //    return kapot;
    //}
    
    //void SetKapot(boolean val) {
    //    kapot = val;
    //}
}


