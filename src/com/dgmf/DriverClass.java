package com.dgmf;

public class DriverClass {
    public static void main(String[] args) {
        Student john = new Student();
        john.setName("John");
        john.setAge(25);
        john.setAddress("45, rue de la Brieve");

        System.out.println(john.getName());
        System.out.println(john.getAge());
        System.out.println(john.getAddress());
    }
}
