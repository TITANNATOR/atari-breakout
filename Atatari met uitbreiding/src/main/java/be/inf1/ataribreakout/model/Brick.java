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
    private double score;
    
    public Brick() {
        this(0,0);
        }
    public Brick(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
        
    }
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    

    

    
    
    

}


