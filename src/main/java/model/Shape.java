package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

abstract public class Shape {
    protected double x;
    protected double y;
    protected Color color;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }



    public void setCircuit(GraphicsContext gc) {

        gc.setStroke(color);


        Random rand = new Random();
        int i = rand.nextInt(0, 10);

        if(i < 5)
            gc.setLineDashes(3, 3);
        else
            gc.setLineDashes(1, 3);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public abstract void draw(GraphicsContext gc);

    public void setPosition(double newX, double newY) {
        this.x=newX;
        this.y=newY;
    }

}
