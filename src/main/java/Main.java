import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println( "Singleton Design Pattern!" );
//        Singleton x = Singleton.getInstance();
//        Singleton y = Singleton.getInstance();
//        Singleton z = Singleton.getInstance();
//
//        System.out.println("Hashcode of x is " + x.hashCode());
//        System.out.println("Hashcode of y is " + y.hashCode());
//        System.out.println("Hashcode of z is " + z.hashCode());
//
//        if (x == y && y == z) {
//            System.out.println("Three object point to the same memory location");
//        } else {
//            System.out.println("Three object DO NOT point to the same memory location");
//        }

//        System.out.println( "Factory Design Pattern!" );
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter person type: ");
//        String personType = scanner.nextLine();
//        Person person1 = PersonFactory.create(personType);
//        System.out.print("Enter person type: ");
//        personType = scanner.nextLine();
//        Person person2 = PersonFactory.create(personType);
//        if (person1 instanceof Lecturer) {
//            System.out.println(person1.getString() + ((Lecturer)person1).getType());
//        }
//        if (person2 instanceof Student) {
//            System.out.println(person2.getString() + ((Student)person2).getType());
//        }

        System.out.println( "Iterator Design Pattern!" );
        List<String> students = new ArrayList<String>();

        students.add("Alex");
        students.add("Marie");
        students.add("FJK");
        students.add("John Mayer");

        StudentList studentList = new StudentList();
        studentList.students = students;

        while (studentList.hasNext()){
            System.out.println(studentList.next());
        }
    }
}
