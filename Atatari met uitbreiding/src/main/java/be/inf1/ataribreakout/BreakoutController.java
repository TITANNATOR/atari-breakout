package be.inf1.ataribreakout;

import be.inf.ataribreakout.view.BalkView;
import be.inf.ataribreakout.view.BreakoutView;
import be.inf1.ataribreakout.model.Bal;
import be.inf1.ataribreakout.model.Balk;
import be.inf1.ataribreakout.model.Breakout;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import javafx.scene.input.KeyEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class BreakoutController {

    @FXML
    private ResourceBundle resources;
    
    @FXML
    private AnchorPane bal;
    
    @FXML
    private Label score;

    @FXML
    private Label highscore;

    @FXML
    private URL location;

    @FXML
    private AnchorPane speler;

    @FXML
    private BorderPane bovenmuur;

    @FXML
    private BorderPane rechtermuur;

    @FXML
    private BorderPane linkermuur;

    @FXML
    private BorderPane ondermuur;
    @FXML
    private Balk pallet;
    private Bal ball;
    private Breakout model;
    private BreakoutView view;

    @FXML
    void initialize() {
        model = new Breakout();
        view = new BreakoutView(model);
        speler.getChildren().add(view);
        speler.setOnKeyPressed(this::beweeg);
        speler.setFocusTraversable(true);
        ball = new Bal();
        //bal.getChildren().add(view);
        bal.setFocusTraversable(true);
        score.setText("Je score is + aantal punten");
        //iedere gebroken brick is 10 punten waard
        
        
        
        BreakoutTask task = new BreakoutTask(model, this);
        Timer t = new Timer(true);
        t.scheduleAtFixedRate(task, 0, 25);
        
        

    }
    /*
    beweging van de pallet
    */
    public void beweeg(KeyEvent e) {
        //System.out.println("test");voor te testen
        switch (e.getCode()) {
            case RIGHT:
                pallet.rechts();
                update();
                break;
            case LEFT:
                pallet.links();
                update();
                break;
            case DOWN:
                pallet.pauze();
                update();
                break;
        }                
    }
        
    public void update(){
        view.update();
    }
}
