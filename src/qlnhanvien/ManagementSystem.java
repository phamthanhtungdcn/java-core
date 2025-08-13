package qlnhanvien;

import java.util.ArrayList;
import java.util.List;

public class ManagementSystem {
    static List<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {
        ManagementSystem ms = new ManagementSystem();
        FullTimeEmployee employee1 = new FullTimeEmployee("Tungpt",1, 100 );
        PartTimeEmployee employee2 = new PartTimeEmployee("Tomy",2, 20, 3);

        addEmployee(employee1);
        addEmployee(employee2);

        displayAllEmployees();
        System.out.println("Tong luong: " + calculateTotalSalary());
    }

    public static void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public static void removeEmployee(int id) {
        employees.remove(id);
    }

    public static void displayAllEmployees(){
        for(Employee employee:employees){
            employee.displayInfo();
        }
    }

    public static double calculateTotalSalary(){
        double totalSalary = 0;
        for(Employee employee:employees){
            totalSalary += employee.calculateSalary();
        }

        return totalSalary;
    }
}
