// i. Java No-Arg Constructors.

public class Student1 {
    String firstName;
    String lastName;
    int age;
    public Student1()
    {
        firstName = "Avnish Kumar";
        lastName = "Jha";
        age = 20;
    }
    public static void main(String[] args) {
        Student1 myStudent = new Student1();
        System.out.println("Name of the student is : "+myStudent.firstName + " " + myStudent.lastName);
        System.out.print("Age is " + myStudent.age);
    }
}
