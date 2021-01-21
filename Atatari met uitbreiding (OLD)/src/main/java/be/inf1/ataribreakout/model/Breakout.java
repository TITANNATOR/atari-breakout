/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.inf1.ataribreakout.model;

import be.inf1.ataribreakout.App;
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
        this.pallet = new Balk(0,0,0,200,20);
        this.ball = new Bal();
        
        this.bricken = new ArrayList<>();
        
        double brickWidth = 10;
        double brickHeight = 10;
        
        for (int i = 1; i <= 20; i++) {
            for (int x=0; x<=80; x+=brickWidth) {
                for (int y=0; y<=50; y+=brickHeight) {
                    this.bricken.add(new Brick(x, y, brickWidth, brickHeight));
                }
            }
        }
        
        //this.bricken.add(new Brick(0, 0, 100, 50));
        //this.bricken.add(new Brick(200, 0, 100, 50));
        //this.bricken.add(new Brick(100, 50, 100, 50));
        //this.bricken.add(new Brick(300, 50, 100, 50));
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



