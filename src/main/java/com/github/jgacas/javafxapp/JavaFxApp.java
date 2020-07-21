package com.github.jgacas.javafxapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * Simple JavaFx application
 */
public class JavaFxApp extends Application {
	
	// entry point into application
    public static void main( String[] args ) {
        launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// set window title
		primaryStage.setTitle("Hello World!");
		
		// create button
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	// on button click display "Hello World!"
        	@Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        // create root gui element and add button to it
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        // create Scene with root element and set it to primary stage
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
	}
}
