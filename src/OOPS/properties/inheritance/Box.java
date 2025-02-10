package OOPS.properties.inheritance;

public class Box {
   double l;
   double h;
   double w;

   static void greeting(){
       System.out.println("Hey, I am in Box class. Greetings!");
   }

    Box() {    // without arguments
       this.l = -1;
       this.h = -1;
       this.w = -1;
   }

   // cube
    Box (double side){   // with single argument

        // super(); Object class

        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double h, double l, double w) {// with all arguments
        System.out.println("Box is constructor");
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Runnnig the box");
    }

}
