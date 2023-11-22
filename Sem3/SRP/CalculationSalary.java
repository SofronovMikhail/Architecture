package Sem3.SRP;

import java.sql.Date;

public class CalculationSalary extends Employee implements InfoEmployee {
    public CalculationSalary(String name, Date dob, int baseSalary) {
        super(name, dob, baseSalary);

    }

    public int calculateNetSalary() {
        int tax = (int) (getBaseSalary() * 0.25);// calculate in otherway
        return getBaseSalary() - tax;
    }

    @Override
    public String getEmpInfo() {
        return "name - " + getName() + " , dob - " + getDob().toString();
    }
}
