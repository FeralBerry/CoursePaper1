public class Employee {
    private final String name;
    private String department;
    private float salary;
    private static int Counter;
    private final int id;
    public Employee(String name,String department, float salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
        id = ++Counter;
    }
    public String getName(){
        return this.name;
    }
    public String getDepartment(){
        return this.department;
    }
    public Float getSalary(){
        return this.salary;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setSalary(Float salary){
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "id: " + id + " ФИО: " + name + " Отдел: " + department + " Зарплата: " + salary;
    }
}
