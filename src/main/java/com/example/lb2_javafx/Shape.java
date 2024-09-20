package com.example.lb2_javafx;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

abstract class Shape
{
    public Color color;

    public Shape (Color color)
    {
        this.color=color;
    }
    /*public void setColor(Color color){
        this.color=color;
    }*/
    public abstract double area();
    abstract void draw( GraphicsContext gr);

}
class Line extends Shape
{
    public double x;
    public double y;
    public Line(double x, double y, Color color){
        super(color);
        this.x=x;
        this.y=y;

    }
    public double area(){
        return y-x;
    }
    public void draw (GraphicsContext gc){

        gc.setStroke(color);
        gc.strokeLine(10, 10, 190, 190);
    }

}
class Rectangle extends Shape
{
    public double length;
    public double width;
    public Rectangle (double length, double width, Color color)
    {
        super(color);
        this.length=length;
        this.width=width;

    }
    public double area()
    {
        return length*width;

    }
    public void draw (GraphicsContext gc){
        // установка цвета
        gc.setStroke(color);
        gc.strokeRoundRect(10, 100, width, length, 10, 10);
    }
}
class Triangle extends Shape{

    public Triangle (Color color)
    {
        super(color);

    }
    public double area(){
        return 0;
    }

    public void draw (GraphicsContext gc)
    {
        gc.setStroke(color);
        gc.strokeLine(10, 10, 190, 190);
        gc.strokeLine(10, 10, 190, 10);
        gc.strokeLine(190, 10, 190, 190);

    }
}

class Circle extends Shape {

    public Circle (Color color) {
        super(color);
    }

    public double area() {
        return 0;
    }

    public void draw (GraphicsContext gc)
    {
        gc.setStroke(color);

        double centerX = 200, centerY = 200, radius = 125;
        int numPoints = 100;

        double step = 2 * Math.PI / numPoints;
        for (int i = 0; i < numPoints; i++) {
            double angle = i * step;
            double x1 = centerX + radius * Math.cos(angle);
            double y1 = centerY + radius * Math.sin(angle);

            double nextAngle = (i + 1) * step;
            double x2 = centerX + radius * Math.cos(nextAngle);
            double y2 = centerY + radius * Math.sin(nextAngle);

            gc.strokeLine(x1, y1, x2, y2);
        }
    }

}
