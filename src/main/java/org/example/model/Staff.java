package org.example.model;

public abstract class Staff extends Person{
    private int id;

    private Staff(){

    }
    private Staff(int id){
        this.id = id;
    }

    private Staff(String firstNane, String lastName, int age, double weight) {
    }

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public Staff(String firstNane, String lastName, int age, double weight, int id) {
        super(firstNane, lastName, age, weight);
        this.id = id;
    }


    public abstract String heirApplicant(Applicant applicant);
}
