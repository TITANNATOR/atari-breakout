/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.inf.ataribreakout.view;

import be.inf1.ataribreakout.model.Brick;
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
    
    public BreakoutView(Breakout model) {
        this.model = model;
    } 
    
    public void update() {
        getChildren().clear();
        
        drawBall();
        drawPallet();
        //drawBorder();
        drawBricks();
    }
    
    private void drawBall() {
        Circle cr = new Circle(model.getBall().getX(), model.getBall().getY(), 15);
        getChildren().add(cr);
    }
    
    private void drawPallet() {
        Rectangle rh = new Rectangle(model.getPallet().getX(), model.getPallet().getY(), 200, 20);
        rh.setFill(Color.GOLD);
        getChildren().add(rh);
    }
    
    private void drawBorder() {
        Rectangle bm = new Rectangle(-380,-500,1540,20);
        Rectangle lm = new Rectangle(1120,-479,20,680);
        Rectangle rm = new Rectangle(-370,-479,20,680);
        Rectangle om = new Rectangle(-380,200,1540,20);
        
        bm.setFill(Color.PALETURQUOISE);
        lm.setFill(Color.PALETURQUOISE);
        rm.setFill(Color.PALETURQUOISE);
        om.setFill(Color.RED);
        
        getChildren().add(bm);
        getChildren().add(lm);
        getChildren().add(rm);
        getChildren().add(om);
    }
    
    private void drawBricks() {
        Rectangle test = new Rectangle(0,0, 100, 50);
            test.setFill(Color.BLUE);
            getChildren().add(test);
        
        for (Brick brick : model.getBricks()) {
            Rectangle rec = new Rectangle(brick.getX(), brick.getY(), brick.getWidth(), brick.getHeight());
            rec.setFill(Color.BLUE);
            getChildren().add(rec);
        }
    }
}

