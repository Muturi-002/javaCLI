package com.mycompany.sample3;
import java.util.Scanner;

public class Person
{
        private static Scanner v= new Scanner(System.in);
        private String name;
        private int yob;
        public Person()
        {
            System.out.println("====Person Details====");
            System.out.print("Enter name: ");
            name= v.nextLine();
            System.out.print("Enter year of birth: ");
            yob=v.nextInt();
            System.out.println("========");
            System.out.println("Name: "+name+"\nYear of Birth: "+yob);
        }
        public String getName()
        {
            return name;
        }
        public void setName(){
            //String newName;
            System.out.println("\nInitial name was: "+name+". Change name: ");
            v.nextLine();
            name= v.nextLine();
            System.out.println("New name: "+name);
            System.out.println("Change is successful!");
        }
        public int getYob()
        {
            return yob;
        }
        public void setYob()
        {
            int yob;
            System.out.println(name+", enter year of birth: ");
            yob= v.nextInt();
            System.out.println("Year of Birth: "+yob);
        }
        public void getAge()
        {
            int current_yr, age;
            System.out.println("Enter the current year: ");
            current_yr= v.nextInt();
            age= current_yr-yob;
            System.out.println(name+"'s age(years old): "+age);
        }
        public Person (String name, int yob){
            this.name=name;
            this.yob=yob;
            System.out.println("Name: "+name+"\nYear of Birth: "+yob);
        }
        public static void main(String [] variables)
        {
            Person p1,p2;
            System.out.println("Person 1 Details:");
            p1=new Person();
            //p1=new Person("john", 2003);
            //System.out.println("Person 2 Details:");
            //p2=new Person("jane", 2004);
            //p2=new Person();
            //System.out.println("Person 1 '"+p1.getName()+"' and Person 2 '"+p2.getName()+"' have been created");
            p1.getName();
            p1.setName();
            p1.getYob();
            p1.setYob();
            p1.getAge();
            /*p2.getName();
            p2.setName();
            p2.getYob();
            p2.setYob();
            p2.getAge();*/
        }

}
