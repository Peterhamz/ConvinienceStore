package org.example.model;

abstract class Person {
    private String firstNane;
    private String lastName;
    private int age;
    private double weight;


    public Person(){

    }

    public Person(String firstNane, String lastName, int age, double weight) {
        this.firstNane = firstNane;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
    }

    public String getFirstNane() {
        return firstNane;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setFirstNane(String firstNane) {
        this.firstNane = firstNane;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
