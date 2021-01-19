/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.inf.ataribreakout.view;

import be.inf1.ataribreakout.model.Bal;
import be.inf1.ataribreakout.model.Balk;
import be.inf1.ataribreakout.model.Breakout;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author daans
 */
public class BreakoutView extends Region{
    private Breakout model;
    private Balk pallet;
    private Bal ball;
    
    
    
    public BreakoutView(Breakout model) {
        this.model = model;
        update();
    } 
          
    
    public void update() {
        getChildren().clear();
        //System.out.println(model.getX()); voor testen
        Rectangle rh = new Rectangle(pallet.getX(), pallet.getY(), 200, 20);
        Rectangle bm = new Rectangle(-380,-500,1540,21);
        Rectangle lm = new Rectangle(1120,-479,21,680);
        Rectangle rm = new Rectangle(-370,-479,21,680);
        Rectangle om = new Rectangle(-380,200,1540,21);
        Circle cr = new Circle(ball.getX(), ball.getY(), 25);
        rh.setFill(Color.GOLD);
        bm.setFill(Color.PALETURQUOISE);
        lm.setFill(Color.PALETURQUOISE);
        rm.setFill(Color.PALETURQUOISE);
        om.setFill(Color.RED);
        
        getChildren().add(rh);
        getChildren().add(cr);
        getChildren().add(bm);
        getChildren().add(lm);
        getChildren().add(rm);
        getChildren().add(om);
        
        }
}

