package collections;

import java.util.TreeSet;

public class TreeSetExp {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparable());
        TreeSet<Student> students1 = new TreeSet<>(new OrderNameComparable());

        students.add(new Student("Emir Can", 100));
        students.add(new Student("İrem", 40));
        students.add(new Student("Batuhan", 75));
        students.add(new Student("Ahmet", 80));

        students1.add(new Student("Emir Can", 100));
        students1.add(new Student("İrem", 40));
        students1.add(new Student("Batuhan", 75));
        students1.add(new Student("Ahmet", 20));

        for (Student stu : students){
            System.out.println(stu.getName());
        }

        System.out.println();
        System.out.println();

        for (Student stu1 : students1){
            System.out.println(stu1.getName());
        }
    }
}
