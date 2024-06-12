package org.example.lesson4;

public class Employee {
    private String serviceNumber;
    private String name;
    private String phoneNumber;
    private int experience;

    public Employee(String serviceNumber, String name, String phoneNumber, int experience) {
        this.serviceNumber = serviceNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
    }

    public Employee() {
    }

    public String getServiceNumber() {
        return serviceNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                ", Табельный номер: " + serviceNumber +
                ", Номер телефона: " + phoneNumber +
                ", Стаж: " + experience;
    }
}
