package com.mycompany.sample3;
import java.util.Scanner;
public class Employee {
    private static Scanner em= new Scanner(System.in);
    private int person_Fno;
    private String name;
    private String gender;
    private int year_of_Birth;
    private double b_Salary;
    private double allows;
    private double gross_salary;
    public Employee(){
        System.out.print("Enter your File Number: ");
        person_Fno= em.nextInt();
        em.nextLine();
        System.out.println("Enter Employee Name: ");
        name= em.nextLine();
        System.out.println(name+",Enter your gender: ");
        gender=em.nextLine();
        System.out.println(name+", Enter your year of birth: ");
        year_of_Birth= em.nextInt();
        System.out.println("Enter your Basic Salary: ");
        b_Salary= em.nextDouble();
        System.out.println("Enter your monthly allowance: ");
        allows=em.nextDouble();
        System.out.println("====Employee Details====");
        System.out.println("Personal File Number: "+person_Fno);
        System.out.println("Full Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Year of Birth: "+year_of_Birth);
        System.out.println("Basic Salary: Kshs "+b_Salary);
        System.out.println("Allowances: Kshs "+allows);
    }
    public void gross(){
        gross_salary= b_Salary + allows;
        System.out.println("Gross Salary: Kshs "+gross_salary);
    }
    public void netPay(){
        double tax= 0.30;
        double net_Pay= gross_salary- (gross_salary*tax);
        System.out.println("Net Pay: Kshs "+net_Pay);
    }
    public static void main(String [] j){
        Employee employee;
        employee= new Employee();
        employee.gross();
        employee.netPay();
    }
}
