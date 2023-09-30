public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        // добавление работников в массив
        employeeBook.setEmployers("Вася Пупкин", "1", Float.toString(((float) Math.round((Math.random() * (100000 + 1)) * 100) /100)));
        employeeBook.setEmployers("Иван Иванов", "2", Float.toString(((float) Math.round((Math.random() * (100000 + 1)) * 100) /100)));
        employeeBook.setEmployers("Петр Петров", "3", Float.toString(((float) Math.round((Math.random() * (100000 + 1)) * 100) /100)));
        employeeBook.setEmployers("Мария Ивановна", "4", Float.toString(((float) Math.round((Math.random() * (100000 + 1)) * 100) /100)));
        employeeBook.setEmployers("Петька Чапаев", "5", Float.toString(((float) Math.round((Math.random() * (100000 + 1)) * 100) /100)));
        employeeBook.setEmployers("Василий Иванович", "1", Float.toString(((float) Math.round((Math.random() * (100000 + 1)) * 100) /100)));
        employeeBook.setEmployers("Анна Пулеметчица", "2", Float.toString(((float) Math.round((Math.random() * (100000 + 1)) * 100) /100)));
        employeeBook.setEmployers("Крокодил Гена", "3", Float.toString(((float) Math.round((Math.random() * (100000 + 1)) * 100) /100)));
        employeeBook.setEmployers("Старуха Шапокляк", "5", Float.toString(((float) Math.round((Math.random() * (100000 + 1)) * 100) /100)));
        //employeeBook.setEmployers("Старуха Шапокляк", "5", Float.toString(((float) Math.round((Math.random() * (100000 + 1)) * 100) /100)));
        employeeBook.setEmployers("Просто Чебурашка", "1", Float.toString(((float) Math.round((Math.random() * (100000 + 1)) * 100) /100)));
        // удаление работника
        employeeBook.deleteEmployers("4");
        // добавление работника
        employeeBook.setEmployers("Карсон", "5", Float.toString(((float) Math.round((Math.random() * (100000 + 1)) * 100) /100)));
        // распечатка массива
        System.out.println(employeeBook.getEmployers());
        // изменение параметров у определенного работника
        employeeBook.editEmployers("10","1",Float.toString(((float) Math.round((Math.random() * (100000 + 1)) * 100) /100)));
        // повышение зарплат на %
        employeeBook.raiseYourSalary(20);
        // распечатка массива
        System.out.println(employeeBook.getEmployers());
        // поиск по параетру в массиве
        System.out.println(employeeBook.getEmployersWithParam("5"));
    }
}