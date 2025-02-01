package OOPS.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("Heyyyyyy");
        System.out.println(this.age); // cant use this over here
    }

    public Human(int age, boolean married, String name, int salary) {
        this.age = age;
        this.married = married;
        this.name = name;
        this.salary = salary;
        Human.population += 1;
    }
}

