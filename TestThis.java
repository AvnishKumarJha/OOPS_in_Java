class Employee {
    int id;
    String name;
    float salary;
    Employee(int id, String name, float salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+salary);
    }
}

class TestThis
{
    public static void main(String[] args) {
        Employee emp1 = new Employee(111, "Mohan", 50000f);
        Employee emp2 = new Employee(112, "Ram", 60000f);
        emp1.display();
        emp2.display();
    }
}
