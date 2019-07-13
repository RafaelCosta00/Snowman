package com.timbuchalk;


/*
CCSF Class 111B
Student Rafael Ferreira Costa
Created on 07/14/2018

Graphics-Assignment3
Question 7
 */

import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;

public class Main extends Application {

    //window and face
    public static final int WINDOW_WIDTH = 600;
    public static final int WINDOW_HEIGHT = 600;
    public static final int FACE_DIAMETER = 100;
    public static final int X_FACE = 250;
    public static final int Y_FACE = 0;
    public static final int EYE_WIDTH = 5;
    public static final int EYE_HEIGHT = 10;
    public static final int X_RIGHT_EYE = 280;
    public static final int Y_RIGHT_EYE = 25;
    public static final int X_LEFT_EYE = 315;
    public static final int Y_LEFT_EYE = Y_RIGHT_EYE;
    public static final int NOSE_DIAMETER = 7;
    public static final int X_NOSE = 295;
    public static final int Y_NOSE = 50;
    public static final int MOUTH_WIDTH = 40;
    public static final int MOUTH_HEIGHT = 25;
    public static final int X_MOUTH = 280;
    public static final int Y_MOUTH = 55;
    public static final int MOUTH_START_ANGLE = 0;
    public static final int MOUTH_DEGREES_SHOWN = -180;

    //mid body
    public static final int MID_DIAMETER = 175;
    public static final int X_MID = 210;
    public static final int Y_MID = 100;

    //BOTTOM BODY
    public static final int BOTTOM_DIAMETER = 250;
    public static final int X_BOTTOM = 175;
    public static final int Y_BOTTOM = 260;

    public static final int X_INITIAL_LEFTARM = 130;
    public static final int Y_INITIAL_LEFTARM = 130;
    public static final int X_FINAL_LEFTARM = 210;
    public static final int Y_FINAL_LEFTARM = 180;

    //left arm
    public static final int X_INITIAL_RIGHTARM = 380;
    public static final int Y_INITIAL_RIGHTARM = 180;
    public static final int X_FINAL_RIGHTARM = 460;
    public static final int Y_FINAL_RIGHTARM = 130;

    public static void main(String[] args)
    {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene= new Scene(root);
        Canvas canvas = new Canvas(WINDOW_WIDTH, WINDOW_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BLUE);
        //face
        gc.fillOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
        gc.strokeOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);


        //body
        gc.setFill(Color.WHITESMOKE);
        gc.fillOval(X_MID, Y_MID, MID_DIAMETER, MID_DIAMETER);
        //bottom
        gc.setFill(Color.ANTIQUEWHITE);
        gc.fillOval(X_BOTTOM, Y_BOTTOM, BOTTOM_DIAMETER, BOTTOM_DIAMETER);

        gc.setLineWidth(2);
        //left arm
        gc.strokeLine(X_INITIAL_LEFTARM, Y_INITIAL_LEFTARM, X_FINAL_LEFTARM, Y_FINAL_LEFTARM);
        //right arm
        gc.strokeLine(X_INITIAL_RIGHTARM, Y_INITIAL_RIGHTARM, X_FINAL_RIGHTARM, Y_FINAL_RIGHTARM);


        //set eyes
        gc.setFill(Color.RED);
        gc.fillOval(X_RIGHT_EYE, Y_RIGHT_EYE, EYE_WIDTH, EYE_HEIGHT);
        gc.fillOval(X_LEFT_EYE, Y_LEFT_EYE, EYE_WIDTH, EYE_HEIGHT);

        //set nose
        gc.setFill(Color.BLACK);
        gc.fillOval(X_NOSE, Y_NOSE, NOSE_DIAMETER, NOSE_DIAMETER);

        //set mouth
        gc.setLineWidth(4);
        gc.setStroke(Color.WHITE);
        gc.strokeArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT, MOUTH_START_ANGLE, MOUTH_DEGREES_SHOWN, ArcType.OPEN);
        root.getChildren().add(canvas);
        primaryStage.setTitle("HappyFace in JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

//        System.exit(0);

    }
}
