package OOPS.staticExample;

import Basics.Main;

public class main {

    public static void main(String[] args) {
        Human brijesh = new Human(19, false, "Brijesh thummar", 3200000);
        Human kunal = new Human(49, true, "Kunal", 320);
        Human raj = new Human(50, true, "Raj", 32);

        // System.out.println(kunal.population);
        // System.out.println(brijesh.population); it will work but dont do it via object name(rahul, brijesh) use convention name / class name(human)

        System.out.println(Human.population); // u can use it without creating an object

    }

        // this is not dependent on objects
        static void fun() {
 //           greeting(); // you cant use this because it requires an instance
           // but the function you are using it in does not depend on instances

            // you cannot access non static stuff without referencing their instances in a static context
               main obj = new main();
               obj.greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
        System.out.println("hello world");
    }
}
