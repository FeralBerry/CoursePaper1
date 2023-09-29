public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Вася Пупкин", "1", (float) Math.round((Math.random() * (100000 + 1)) * 100) /100);
        employees[1] = new Employee("Иван Иванов", "2", (float) Math.round((Math.random() * (100000 + 1)) * 100) /100);
        employees[2] = new Employee("Петр Петров", "3", (float) Math.round((Math.random() * (100000 + 1)) * 100) /100);
        employees[3] = new Employee("Мария Ивановна", "4", (float) Math.round((Math.random() * (100000 + 1)) * 100) /100);
        employees[4] = new Employee("Петька Чапаев", "5", (float) Math.round((Math.random() * (100000 + 1)) * 100) /100);
        employees[5] = new Employee("Василий Иванович", "1", (float) Math.round((Math.random() * (100000 + 1)) * 100) /100);
        employees[6] = new Employee("Анна Пулеметчица", "2", (float) Math.round((Math.random() * (100000 + 1)) * 100) /100);
        employees[7] = new Employee("Крокодил Гена", "3", (float) Math.round((Math.random() * (100000 + 1)) * 100) /100);
        employees[8] = new Employee("Старуха Шапокляк", "4", (float) Math.round((Math.random() * (100000 + 1)) * 100) /100);
        employees[9] = new Employee("Просто Чебурашка", "5", (float) Math.round((Math.random() * (100000 + 1)) * 100) /100);
        float min = employees[0].getSalary();
        float max = employees[0].getSalary();
        int i = 0;
        float allSalary = 0;
        float averageSalary = 0;
        for (Employee e: employees) {
            if(employees[i].getSalary() < min){
                min = employees[i].getSalary();
            }
            if(employees[i].getSalary() > max){
                max = employees[i].getSalary();
            }
            allSalary += employees[i].getSalary();
            averageSalary += employees[i].getSalary() / employees.length;
            System.out.println(e);
            i++;
        }
        averageSalary = (float) Math.round(averageSalary * 100) /100;
        System.out.println("Минимальная зарплата: " + min);
        System.out.println("Максимальная зарплата: " + max);
        System.out.println("Все затраты на зарплату: " + allSalary);
        System.out.println("Средняя зарплата: " + averageSalary);
        System.out.println("\nФИО сотрудников: ");
        for (Employee e: employees) {
            System.out.println(e.getName());
        }
    }
}