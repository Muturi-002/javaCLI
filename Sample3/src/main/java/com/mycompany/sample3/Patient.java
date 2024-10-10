package com.mycompany.sample3;

import java.util.Scanner;

public class Patient {
    private static Scanner reader= new Scanner(System.in);
    private String name, email_address,gender, occup, nextOfKin, kinContact, rel;
    private int regNo, age, idNo;
    protected float con;
    protected float med;
    private float total;
    public Patient(){
        System.out.println("Enter registration number for patient: \n(Incremental change in number for new patients.)");
        regNo= reader.nextInt();
        reader.nextLine();
        System.out.println("Enter name of patient: ");
        name= reader.nextLine();
        System.out.println("Gender of the patient: ");
        gender= reader.nextLine();
        if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")){
            System.out.println("Enter age of patient: ");
            age=reader.nextInt();
            if(age>= 18){
                System.out.println("(Enter 0 if not provided with one) Provide national ID number: ");
                idNo=reader.nextInt();
                reader.nextLine();
            }
            System.out.println("Enter email address: ");
            email_address= reader.nextLine();
            System.out.println("Enter occupation of patient: ");
            occup= reader.nextLine();
            System.out.println("Enter next of kin Details:");
            System.out.print("\tName: ");
            nextOfKin=reader.next();
            System.out.print("\tRelationship to patient: ");
            rel=reader.next();
            System.out.print("\tContact no: ");
            kinContact=reader.next();
        }
        else {
            System.out.println("Invalid gender entry. Try again!");
        }
    }
    public void patientCapture(){
        System.out.println("====Patient Details====");
        System.out.println("Registration no: "+regNo);
        System.out.println("Patient's name: "+name.toUpperCase());
        System.out.println("Gender: "+gender.toUpperCase());
        System.out.println("Age: "+age);
        System.out.println("ID number: "+idNo);
        System.out.println("Email Address: "+email_address);
        System.out.println("Occupation of Patient: "+occup.toUpperCase());
        System.out.println("Next of Kin Details:-");
        System.out.println("\tName: "+nextOfKin.toUpperCase());
        System.out.println("\tRelationship: "+rel.toUpperCase());
        System.out.println("\tContact number: "+kinContact);
        System.out.println("=========");
    }
    public void pay(){
        System.out.println("Consultancy Fee: ");
        con=reader.nextFloat();
        System.out.println("Medication fee: ");
        med= reader.nextFloat();
    }
    public void totals(){
        total= con+med;
    }
    public void receipt(){
        System.out.println("Total Payment:Kshs "+total);
        System.out.println("\tConsulation Fee:Kshs "+con);
        System.out.println("\tMedication payment:Kshs "+med);
    }
}
