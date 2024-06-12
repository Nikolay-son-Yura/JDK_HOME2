package org.example.lesson4;

/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавления нового сотрудника в справочник

 */


public class Program {
    public static void main(String[] args) {
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        Employee employee1 = new Employee("1A", "Николай", "12345", 5);
        Employee employee2 = new Employee("2", "Сергей", "54321", 3);
        Employee employee3 = new Employee("3B", "Василий", "14253", 1);
        Employee employee4 = new Employee("4C", "Семен", "35214", 10);
        Employee employee5 = new Employee("5N", "Артем", "42153", 2);
        employeeDirectory.addEmployee(employee1);
        employeeDirectory.addEmployee(employee2);
        employeeDirectory.addEmployee(employee3);
        employeeDirectory.addEmployee(employee4);
        employeeDirectory.addEmployee(employee5);
        employeeDirectory.printEmployee();
        System.out.println("-----------");
        System.out.println(employeeDirectory.searchForAnEmployeeByExperience(2));
        System.out.println("-----------");
        System.out.println(employeeDirectory.phoneNumberByName("Василий"));
        System.out.println("-----------");
        System.out.println(employeeDirectory.searchForAnEmployeeByServiceNumber("3b"));
        System.out.println("-----------");
    }
}
