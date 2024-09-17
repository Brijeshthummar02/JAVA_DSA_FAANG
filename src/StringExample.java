import javax.print.attribute.standard.PrinterIsAcceptingJobs;

public class StringExample {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);

//String personalised = myGreet(naam);
        //System.out.println(personalised);
    }

    static String myGreet(String name){
        String message = "Hello" + name;
        return message;
    }

    static String greet() {

        String greeting = "Bounjour!";
        return greeting;
    }
}
