// iii. Default Constructors.
class Student3 {
    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {
        Student3 myStudent = new Student3();

        myStudent.firstName="Avnish Kumar";
        myStudent.lastName="Jha";
        myStudent.age=20;

        System.out.println("Name of the Student is :- " + myStudent.firstName + " " + myStudent.lastName);
        System.out.println("Age is : " + myStudent.age);
    }
}
