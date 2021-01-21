/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.inf.ataribreakout.view;

import be.inf1.ataribreakout.model.Brick;
import be.inf1.ataribreakout.model.Breakout;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
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
    /*
    rode achtergrond
    */
    public BreakoutView(Breakout model) {
        setBackground(new Background(new BackgroundFill(Color.rgb(255, 0, 0), new CornerRadii(0, 0, 0, 0, false), null)));
        this.model = model;
    } 
    /*
    zorgt voor de tick waardoor alles constant update
    */
    public void update() {
        getChildren().clear();
        
        drawBall();
        drawPallet();
        //drawBorder(); overbodig
        drawBricks();
    }
    /*
    cirkel tekenen
    */
    private void drawBall() {
        Circle cr = new Circle(model.getBall().getX() + (10/2), model.getBall().getY() + (10/2), 10);
        cr.setFill(Color.DARKBLUE);
        //Circle cr = new Circle(model.getBall().getX() + ((model.getBall().getRadius())/2), model.getBall().getY() + ((model.getBall().getRadius())/2), model.getBall().getRadius());
        getChildren().add(cr);
    }
    /*
    pallet tekenen
    */
    private void drawPallet() {
        Rectangle rh = new Rectangle(model.getPallet().getX(), getHeight() - model.getPallet().getHeight(), model.getPallet().getWidth(), model.getPallet().getHeight());
        rh.setFill(Color.GOLD);
        getChildren().add(rh);
    }
    /*
    border maken, hoogstwaarschijnlijk niet nodig aangezien we gewoon de border van de window pakken die niet resisable maken
    */
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
    /*
    tekent de bricken die we gaan kapot proberen te maken met het balletje
    */
    private void drawBricks() {
        for (Brick brick : model.getBricks()) {
            if (!brick.isKapot()) {
                Rectangle rec = new Rectangle(brick.getX(), brick.getY(), brick.getWidth(), brick.getHeight());
                rec.setFill(Color.BLUE);
                getChildren().add(rec);
            }
        }
    }
}

