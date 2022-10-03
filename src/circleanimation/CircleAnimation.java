/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package circleanimation;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author usu2dam
 */
public class CircleAnimation extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane pane = new Pane();
        
        Ellipse ellipse = new Ellipse(10, 10, 100, 50);
        ellipse.setFill(Color.RED);
        ellipse.setStroke(Color.BLACK);
        ellipse.setCenterX(150);
        ellipse.setCenterY(115);
        ellipse.setRadiusX(100);
        ellipse.setRadiusY(100);
        
        pane.getChildren().add(ellipse);
        
        FadeTransition FTransition = new FadeTransition(Duration.millis(3000), ellipse);
        FTransition.setFromValue(1.0);
        FTransition.setToValue(0.1);
        FTransition.setCycleCount(Timeline.INDEFINITE);
        FTransition.setAutoReverse(true);
        FTransition.play();

        ellipse.setOnMousePressed(event -> FTransition.pause());
        ellipse.setOnMouseReleased(event -> FTransition.play());

        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Circle Animation Flicker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
