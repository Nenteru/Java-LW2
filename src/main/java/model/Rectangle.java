package model;

import javafx.scene.canvas.GraphicsContext;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.color=getColor();
        this.width = width;
        this.height = height;
    }

//    @Override
//    public void draw(GraphicsContext gc) {
//        gc.setFill(color);
//        gc.fillRect(x, y, width, height);
//    }

    @Override
    public void draw(GraphicsContext gc) {
        setCircuit(gc);
        gc.setLineWidth(2); // Устанавливаем толщину линии, если нужно

        // Вычисляем координаты всех четырех углов прямоугольника
        double x1 = x;
        double y1 = y;
        double x2 = x + width;
        double y2 = y + height;

        gc.beginPath();
        gc.moveTo(x1, y1); // Верхний левый угол
        gc.lineTo(x2, y1); // Верхний правый угол
        gc.lineTo(x2, y2); // Нижний правый угол
        gc.lineTo(x1, y2); // Нижний левый угол
        gc.closePath(); // Замыкаем путь
        gc.stroke(); // Рисуем линию
    }

}
