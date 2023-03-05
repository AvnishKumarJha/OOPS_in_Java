public class Student4 {
    int id;
    String name;

    Student4()
    {
        System.out.println("This is a Default Constructors.");
    }
    
    Student4(int i, String n)
    {
        id=i;
        name=n;
    }

    public static void main(String[] args) {
        Student4 s = new Student4();
        System.out.println("Default Constructor Values : ");
        System.out.println("Student id : "+s.id+ "Student Name : "+s.name);
        System.out.println("Parameterised Constructor Values : ");
        Student4 Student = new Student4(10,"Avnish");
        System.out.println("Student id : "+Student.id+ "Student Name : "+Student.name);
    }
}
