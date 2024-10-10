package com.mycompany.sample3;
import java.util.Scanner;
public class Student {
    private static Scanner i=new Scanner (System.in);//class object-declared with static keyword
    private String regno,name;//instance variable
    public Student(){
        System.out.println("Enter Student's name:");
        name=i.nextLine();
        System.out.println("Enter Registration No for: "+name);
        regno=i.nextLine();
    }
    public void viewDetails(){
            System.out.println("Name: "+name+"\nReg No: " +regno);
    }        
    public static void main(String[] args){
        Student stu1= new Student();
        stu1.viewDetails();
        stu1.setName();
        stu1.viewDetails();
    }
    public void setName(){
        System.out.println("Initial name was: "+name+". Edit name:");
        name=i.nextLine();
    }
}
