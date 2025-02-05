package OOPS.staticExample;

//this is a demo to show initialization of static variables
public class StaticBlock {
    static int a = 4;
    static int b;

    // will only runs once when first obj is created i.e: class is loaded for the first time.
    static{
        System.out.println("i am using static block");
        b = a * 5;

    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + "" + StaticBlock.b);

        StaticBlock.b += 3;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + "" + StaticBlock.b);


    }

}
