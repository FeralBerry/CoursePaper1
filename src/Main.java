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
        int percent = 50;
        for (Employee e: employees) {
            if(employees[i].getSalary() < min){
                min = employees[i].getSalary();
            }
            if(employees[i].getSalary() > max){
                max = employees[i].getSalary();
            }
            // Повышенная сложность повышение зарплаты на %
            employees[i].setSalary(salaryIncrease(employees[i].getSalary(), percent));
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
        // повышенная сложность
        // Задание названия отдела
        String departmentName = "1";
        float departmentAverageSalary;
        float departmentAllSalary = 0;
        i = 0;
        int n = 0;
        float newSalary;
        int maxId = 0;
        int minId = 0;
        System.out.println("Зарплата сотрудников до индексирования:");
        for (Employee e: employees) {
            if(e.getDepartment().equals(departmentName)){
                if(e.getSalary() < min){
                    minId = i;
                }
                if(e.getSalary() > max){
                    maxId = i;
                }
                System.out.println(e);
                // Сумму затрат на зарплату по отделу.
                departmentAllSalary += employees[i].getSalary();
                // Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
                newSalary = salaryIncrease(employees[i].getSalary(),percent);
                employees[i].setSalary(newSalary);
                n++;
            }
            i++;
        }
        // Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
        if(i > 0){
            departmentAverageSalary = departmentAllSalary / n;
        } else {
            departmentAverageSalary = (float) 0;
        }
        System.out.println("Сотрудник с самой высокой зарплатой после индексирования: \n" + employees[maxId]);
        System.out.println("Сотрудник с самой низкой зарплатой после индексирования: \n" + employees[minId]);
        System.out.println("Зарплата отдела " + departmentName + ": " + departmentAllSalary);
        System.out.println("Средняя зарплата в отделе " + departmentName + ": " + departmentAverageSalary);
        System.out.println("Зарплата сотрудников отдела " + departmentName + " после повышения");
        // Напечатать всех сотрудников отдела (все данные, кроме отдела).
        for (Employee e: employees) {
            if (e.getDepartment().equals(departmentName)){
                System.out.println(e.allExceptTheDepartment());
            }
        }
        // Получить в качестве параметра число и найти:
        // Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
        float minThreshold = 50000.00F;
        System.out.println("Сотрудники чья зарплата выше " + minThreshold);
        for (Employee e: employees) {
            if(e.minThreshold(minThreshold)){
                System.out.println(e.allExceptTheDepartment());
            }
        }
        // Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
        float maxThreshold = 50000.00F;
        System.out.println("Сотрудники чья зарплата выше " + maxThreshold);
        for (Employee e: employees) {
            if(e.maxThreshold(minThreshold)){
                System.out.println(e.allExceptTheDepartment());
            }
        }
    }
    // Метод повышения зарплаты на %
    public static float salaryIncrease(float salary,int percent){
        return salary + salary * percent / 100;
    }

}