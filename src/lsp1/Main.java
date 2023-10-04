package lsp1;

import lsp1.shape.Rectangle;
import lsp1.shape.Shape;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
//        Rectangle rectangle = new Square(5);
//        rectangle.setSideA(4);
//        rectangle.setSideB(5);
        Shape shape = new Square(5);
        Shape shape1 = new Rectangle(5, 4);
        System.out.printf("In a rectangle side A = %d, side B = %d\n", shape.getSideA(), shape.getSideB());
        ShapeView view = new ShapeView(shape);
        view.showArea();
        System.out.printf("In a rectangle side A = %d, side B = %d\n", shape1.getSideA(), shape1.getSideB());
        ShapeView view1 = new ShapeView(shape1);
        view1.showArea();
    }
}
