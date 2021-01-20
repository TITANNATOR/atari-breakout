package be.inf1.ataribreakout;

import be.inf.ataribreakout.view.BreakoutView;
import be.inf1.ataribreakout.model.Breakout;
import java.util.ResourceBundle;
import java.util.Timer;
import javafx.scene.input.KeyEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class BreakoutController {

    @FXML
    private ResourceBundle resources;
    
    //@FXML
    //private AnchorPane bal;
    
    @FXML
    private Label score;

    @FXML
    private Label highscore;

    //@FXML
    //private URL location;
    
    @FXML
    private BorderPane speler;
    
    /*
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
    private Bal ball;*/
    private Breakout model;
    private BreakoutView view;

    @FXML
    void initialize() {
        //ball = new Bal();
        //pallet = new Balk();
        model = new Breakout();
        view = new BreakoutView(model);
        view.setBackground(new Background(new BackgroundFill(Color.rgb(255, 0, 0), new CornerRadii(0, 0, 0, 0, false), null)));
        
        speler.getChildren().add(view);
        speler.setOnKeyPressed(this::beweeg);
        speler.setFocusTraversable(true);
        
        //bal.setFocusTraversable(true);
        //score.setText("Je score is + aantal punten");
        //iedere gebroken brick is 10 punten waard
        
        
        
        /*BreakoutTask task = new BreakoutTask(model, this);
        Timer t = new Timer(true);
        t.scheduleAtFixedRate(task, 0, 25);*/
    }
    
    /*
    beweging van de pallet
    @param rechts beweegt naar rechts
    @param links beweegt naar links
    @param pauze stopt de beweging van de pallet
    */
    public void beweeg(KeyEvent e) {
        //System.out.println("test");voor te testen
        switch (e.getCode()) {
            case RIGHT:
                model.getPallet().rechts();
                update();
                break;
            case LEFT:
                model.getPallet().links();
                update();
                break;
            case DOWN:
                model.getPallet().pauze();
                update();
                break;
        }                
    }
        
    public void update(){
        view.update();
    }
}
