package OOPS.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes(); // type of method in overriding that is called depends on what the type of object is
        Shapes circle = new Circle();
        Shapes triangle = new Triangle();
        Shapes square = new Square();

        circle.area();

    }
}
