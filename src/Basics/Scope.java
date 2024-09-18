package Basics;

public class Scope {
    public static void main(String[] args) {

    // ANYTHING THAT IS OUTSIDE YOU CAN USE INSIDE, BUT ANYTHING THAT IS INITIALISED INSIDE YOU CANNOT USE OUTSIDE.
    // ANYTHING THAT IS INITIALISED OUTSIDE THE BLOCK CANNOT BE AGAIN INITIALISED INSIDE THE BLOCK, BUT ANYTHING THAT IS INITIALISED INSIDE THE BLOCK CAN DEFINEATLY INITIALISED OUTSIDE THE BLOCK.

        int a = 10;
        int b = 20;
        System.out.println(a); //10
        String name = "Kunal";
        {
           // int a = 78; already initialised outside the block in the same method, hence you cannot initialise it again. BUT you can change it.
            a = 100;
            System.out.println(a);// 100 // reassign the origin ref variable to some other value
            int c = 95;
            name = "Raj";
            // values initialised inside the block, will remain in block
        }
        System.out.println(a);// 100 // cannot use outside the block
        System.out.println(name);

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            a = 1000;
        }
        System.out.println(a);


    }// you can access only variable which are declared inside the same fxn.

    static void random(int marks){
        int num = 67;
        System.out.println(num);
    }
}
