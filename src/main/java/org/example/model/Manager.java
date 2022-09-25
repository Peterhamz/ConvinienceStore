package org.example.model;
import org.example.model.intfaces.ManagerInterface;

public class Manager extends Staff implements ManagerInterface {

    public Manager(String firstNane, String lastName, int age, double weight, int id) {
        super(firstNane, lastName, age, weight, id);
    }

    @Override
    public String heirApplicant(Applicant applicant) {
        String isFemale = "female";
        String isExperienced = "1";
        if (applicant.getIsExperienced() == isExperienced && applicant.getIsFemale() == "female"){
            return "Congratulations for your new Appointment as a Cashier";
        }
        return "We will get back to you ";
    }

}
