package OOPS.properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    // static method can be inherited but cannot be overridden

 //   @Override
//    static void greeting(){
//        System.out.println("Hey, I am in Box class. Greetings!");
//    }

    BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight =   weight;
    }

    public BoxWeight(double h, double l, double w, double weight) {
        super(h, l, w); //what is this? call the parent class constructor
        // used to initialise values in parent class
  //      System.out.println(super.w);

        this.weight = weight;

    }
}
