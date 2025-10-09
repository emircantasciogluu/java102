package ooprelationships;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Mehmet", "Öz", "123", "AA", 40);
        Student s2 = new Student("Ahmet", "Kal", "456", "BB", 40);
        Student s3 = new Student("Can", "Tan", "789", "CC", 40);

        Instructor teacher = new Instructor("Emir Can", "Tascioglu", "CENG");

        //Course has a Instructor (Composition )
        Course mat = new Course("MATH101", "MATH", teacher);
        System.out.println(mat.getInstructor().getDepartment());

        //Student[] stu = {s1,s2,s3};
        // System.out.println("Your Average is : " + mat.calcAverage(stu));
    }
}
