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
        this.pallet = pallet;
    }

    public class getPallet {
           
        public getPallet() {
            pallet.getX();
            pallet.getY();
            pallet.rechts();
            pallet.links();
            pallet.pauze();
            
        
        }
    }

    public class getBalletje {

        public getBalletje() {
           ball.getX();
           ball.getY();
        }
    }
    
    
    
    
}



