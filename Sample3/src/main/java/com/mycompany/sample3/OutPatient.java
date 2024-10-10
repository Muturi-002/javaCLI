package com.mycompany.sample3;

import java.util.Scanner;

public class OutPatient extends Patient{
    private static Scanner read= new Scanner(System.in);
    private final float bedding_fee= 300;
    private float sum, total;
    private int noDays;

    @Override
    public void pay() {
        super.pay();
        System.out.println("Enter number of days in Hospital: ");
        noDays= read.nextInt();
        sum= (float)noDays * bedding_fee;
    }
    @Override
    public void totals(){
        total= med + con +sum;
    }
    @Override
    public void receipt() {
        System.out.println("Total Payment:Kshs "+total);
        System.out.println("\tConsulation payment:Kshs "+con);
        System.out.println("\tMedication payment:Kshs "+med);
    }
}
