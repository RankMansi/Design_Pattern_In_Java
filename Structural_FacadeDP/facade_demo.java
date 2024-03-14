import com.*;

public class facade_demo{
    public static void main(String[] args){
        Shape_Maker shapemaker = new Shape_Maker();

        shapemaker.drawCircle();
        shapemaker.drawRectangle();
        shapemaker.drawSquare();
    }
}