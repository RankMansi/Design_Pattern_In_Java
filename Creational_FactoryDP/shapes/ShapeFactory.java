package shapes;

public class ShapeFactory {
    public Shape getInstance(String str) {
        if(str.equals("circle")){
            return new Circle(3);
        }
        else if(str.equals("square")){
            return new Square(3);
        }
        else if(str.equals("rectangle")){
            return new Rectangle(4, 5);
        }
        else{
            return new Triangle(10, 5);
        }

    }
}