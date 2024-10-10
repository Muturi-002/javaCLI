package com.mycompany.sample3;
import java.util.Scanner;
public class Patients extends Patient {
    public static void main(String [] p){
        Scanner h= new Scanner(System.in);
        int choice;
        System.out.println("Welcome to ABC Hospital. What kind of admission would you like for the patient:");
        System.out.println("\t1. Out-Patient\n\t2. In-Patient");
        choice=h.nextInt();
        switch (choice) {
            case 1:
                Patient p1= new Patient();
                p1.patientCapture();
                p1.pay();
                p1.totals();
                p1.receipt();
                break;
            case 2:
                OutPatient p2= new OutPatient();
                p2.patientCapture();
                p2.pay();
                p2.totals();
                p2.receipt();
                break;
            default:
                System.out.println("Invalid entry of choice. Login again to start afresh.");
                main(p);
                System.out.println("Thank you for using our services.");
        }
    }
}
