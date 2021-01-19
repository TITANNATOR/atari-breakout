/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.inf.ataribreakout.view;

import be.inf1.ataribreakout.model.Balk;
import be.inf1.ataribreakout.model.Breakout;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author daans
 */
public class BalkView extends Region {
    private Balk model;
    
    public BalkView(Balk model) {
        this.model = model;
        update();
    }
    public void update() {
        getChildren().clear();
        Rectangle rh = new Rectangle(model.getX(), model.getY(),
                                     100, 20);
        rh.setFill(Color.GOLD);
        
        getChildren().add(rh);
    }
}
