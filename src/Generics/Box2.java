package Generics;

public class Box2 {

    public <T extends Number> Box2 (T value){

    }

    public static void main(String[] args) {
        Box2 box2 = new Box2(2);
    }
}
