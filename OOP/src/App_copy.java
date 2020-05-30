package OOP.src;

import java.util.Scanner;
import OOP.src.Employee;

public class App_copy {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Employee orang = new Employee(50_000, 100);
        Employee person = new Employee(110_000, 30);
        // System.out.print("Input gaji pokok anda: ");
        // orang.setSalary(Integer.parseInt(scan.nextLine()));
        // // System.out.print("Input lama overtime: ");
        // // orang.setOvertime(Integer.parseInt(scan.nextLine()));
        // System.out.print("Input gaji overtime: ");
        // orang.setPayPerHour(Integer.parseInt(scan.nextLine()));
        // System.out.println(calculateWage(orang.getSalary(), orang.getOvertime(),
        // orang.getPayPerHour()));
        // int overtime = scan.nextInt();
        // System.out.println(orang.calculateWage(overtime));
        // System.out.println(orang.calculateWage(5));
        System.out.println(Employee.employeeCount);
    }

    // public static int calculateWage(int salary, int overtime, int payPerHour) {
    // return salary + (overtime * payPerHour);
    // }
}
