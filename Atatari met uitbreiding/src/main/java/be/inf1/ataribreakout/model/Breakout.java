/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.inf1.ataribreakout.model;

import java.util.ArrayList;

/**
 *
 * @author daans
 */
public class Breakout {
    private Bal ball;
    private Balk pallet;
    private ArrayList<Brick> bricken;
    
    public Breakout() {
        this.pallet = new Balk();
        this.ball = new Bal();
        
        this.bricken = new ArrayList<>();
        //800x600
        double brickWidth = 10;
        double brickHeight = 10;
        
        for (int x=0; x<=80; x+=brickWidth) {
            for (int y=0; y<=50; y+=brickHeight) {
                this.bricken.add(new Brick(x, y, brickWidth, brickHeight));
            }
        }
    }

    public Balk getPallet() {
        return pallet;
    }

    public Bal getBall() {
        return ball;
    }

    public ArrayList<Brick> getBricks() {
        return bricken;
    }
    
}



