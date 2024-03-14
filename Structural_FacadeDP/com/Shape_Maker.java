package com;

public class Shape_Maker{
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public Shape_Maker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}