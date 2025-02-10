package OOPS.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6, 3.4, 5.7);
        Box box2 = new Box(box1);
//
//          System.out.println(box1.h + " " + box1.w + " " + box1.h);
//    //    System.out.println(box2);
//
//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,8);
//
//        System.out.println(box4.h + " " + " " + box3.w);


//        Box box5 = new BoxWeight(2,3,4,70);
//        System.out.println(box5);

        // there are many variables in parents and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means ones you are trying to access should be initialised
        // but here when the obj itself is of type parent class, how'd you call the constructor of child class
        // this is why error
  //      BoxWeight box6 = new Box(1,2,3);
    //    System.out.println(box6);


   //     BoxPrice box = new BoxPrice(5,8,200);


  //       box1.greeting();

        // static method can be inherited but cannot be overridden
        BoxWeight box = new BoxWeight();
        BoxWeight.greeting(); // You can inherit but u cannot override

    }
}
