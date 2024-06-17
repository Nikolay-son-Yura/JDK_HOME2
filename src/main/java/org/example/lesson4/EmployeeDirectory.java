package org.example.lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);

    }

    public List<Employee> searchForAnEmployeeByExperience(int experience) {

//        return employees.stream().filter(list -> list.getExperience() == experience).toList();

        List<Employee> rezult = new ArrayList<>();
        for (Employee e : employees) {
            if (experience == e.getExperience()) rezult.add(e);
        }
        return rezult;
    }

    public List<String> phoneNumberByName(String name) {

//        return employees.stream().filter(x -> x.getName().equalsIgnoreCase(name)).map(Employee::getPhoneNumber).toList();

        List<String> rezult = new ArrayList<>();
        for (Employee i : employees) {
            if (i.getName().equalsIgnoreCase(name)) rezult.add(i.getPhoneNumber());
        }

        return rezult;
    }

    /*
    тут в поиске сотрудника по табельному номеру возникла проблема, есле метод должен возвращать сотрудника(Employee)
    со stream() разобрался, но вот с "простой" реализацией возникли проблемы
     */

    public Employee searchForAnEmployeeByServiceNumber(String serviceNumber) {

//        return employees.stream().filter(x -> x.getServiceNumber().equalsIgnoreCase(serviceNumber)).toList();  // вариант 1

//        return Collections.singletonList(employees.stream().filter(x -> x.getServiceNumber().equalsIgnoreCase(serviceNumber)).findFirst().orElse(null)); //вариант 2
        return employees.stream().filter(x -> x.getServiceNumber().equalsIgnoreCase(serviceNumber)).findFirst().orElse(null);

//        List<String> rezult = new ArrayList<>();  //вариант3
//        for (Employee i : employees) {
//            if (i.getServiceNumber().equalsIgnoreCase(serviceNumber))  rezult.add(String.valueOf(i));
//        }
//        return rezult;
    }

    public void printEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
