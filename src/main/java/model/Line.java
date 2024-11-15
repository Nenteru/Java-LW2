package model;

import javafx.scene.canvas.GraphicsContext;

public class Line extends Shape{
    private double length;
    private double angle;

    public Line(double x, double y, double length, double angle) {
        super(x, y);
        this.color=getColor();
        this.length = length;
        this.angle = angle;
    }

    @Override
    public void draw(GraphicsContext gc) {
        this.setCircuit(gc);
        gc.strokeLine(x,y,length,angle);
    }
}
