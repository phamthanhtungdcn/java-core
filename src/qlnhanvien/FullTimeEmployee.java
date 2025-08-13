package qlnhanvien;

public class FullTimeEmployee extends Employee {
    private double monthySalary;

    public FullTimeEmployee(String name, int id, double monthySalary) {
        super(name, id);
        this.monthySalary = monthySalary;
    }

    @Override
    public double calculateSalary() {
        return monthySalary;
    }
}
