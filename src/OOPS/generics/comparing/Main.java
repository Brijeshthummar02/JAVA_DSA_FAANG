package OOPS.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student Brijesh = new Student(12, 89.76f);
        Student krish = new Student(5, 99.52f);
        Student parth = new Student(2, 95.52f);
        Student harsh = new Student(13, 77.52f);
        Student dharm = new Student(9, 96.52f);

        Student[] list = {Brijesh, krish, parth, harsh, dharm};

        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int)(o1.marks - o2.marks);
//            }
//        });


        // replaced above with lambda function.
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));

//        if (Brijesh.compareTo(harsh) < 0) {
//            System.out.println(Brijesh.compareTo(harsh));
//            System.out.println("harsh has more marks");
//        }


    }
}