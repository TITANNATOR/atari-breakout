/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.inf1.ataribreakout;

import be.inf1.ataribreakout.model.Breakout;
import java.util.TimerTask;
import javafx.application.Platform;

/**
 *
 * @author daans
 */
public class BreakoutTask extends TimerTask {
    private Breakout model;
    private BreakoutController controller;
   

    public BreakoutTask(Breakout model, BreakoutController controller) {
        this.model = model;
        this.controller = controller;
    }
    
           
    @Override
    public void run() {
        model.tick();
        Platform.runLater(controller::update);
    }
    
}
