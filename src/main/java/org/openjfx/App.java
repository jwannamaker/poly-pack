package org.openjfx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
// import javafx.scene.control.Label;
// import javafx.scene.layout.StackPane;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;


public class App extends Application 
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {   
        // creating a sphere that will be the subject of the viewer
        Sphere sphere = new Sphere(50);

        // adding the sphere into a new container
        // -> group.getChildren() is a list
        Group group = new Group();
        group.getChildren().add(sphere);
        
        // adding the group into a new scene
        // - width: 1400
        // - height: 800
        Scene scene = new Scene(group, 1400, 800);

        // moving the scene into primaryStage
        // -> stages are essentially the window where everything lives
        primaryStage.setTitle("Poly Pack!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) 
    {
        Application.launch(args);
    }
}