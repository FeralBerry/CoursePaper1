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
    public String allExceptTheDepartment(){
        return "id: " + id + " ФИО: " + name + " Зарплата: " + salary;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employee c2 = (Employee) other;
        return this.department.equals(c2.department);
    }
    public boolean minThreshold(float minThreshold){
        return minThreshold < this.salary;
    }
    public boolean maxThreshold(float maxThreshold){
        return maxThreshold >= this.salary;
    }
}
