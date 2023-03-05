class man
{
    String name;
    int age;
    float sal;
}

class person {
    public static void main(String[] args) {
        man m1 = new man();
        m1.name = "Avnish Kumar Jha";
        m1.age =20;
        m1.sal = 100000;
        System.out.println("Name of the person is : "+m1.name);
        System.out.println("Age of the person is : "+m1.age);
        System.out.println("Salary of the person is : "+m1.sal);
    }
}