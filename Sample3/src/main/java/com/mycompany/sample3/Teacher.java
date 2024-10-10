package com.mycompany.sample3;
import java.util.Scanner;
public class Teacher {
    Scanner teach= new Scanner(System.in);
    private String name, area;
    public Teacher(){
        System.out.println("Enter name of Teacher: ");
        name= teach.nextLine();
        System.out.println(name+", Enter your area of teaching profession: ");
        area= teach.nextLine();
        System.out.println("====Teacher's Details====");
        System.out.println("Name: "+name);
        System.out.println("Area of teaching: "+area);
    }
    public Teacher (String name, String area){
        this.name=name;
        this.area= area;
        System.out.println("Name: "+name);
        System.out.println("Area of teaching: "+area);
    }
    public void setName(){
        String nameNew;
        System.out.println("Initial name of the teacher was "+name+". Change name of the teacher: ");
        nameNew= teach.nextLine();
        System.out.println("New name for teacher: "+nameNew);
        System.out.println("Change Successful");
    }

    public String getName(String n){
        name=n;
        System.out.print("Teacher's name: ");
        return n;
    }
    public void setArea(){
        String areaNew;
        System.out.println("Initial area for "+name+"was "+area+". Change area: ");
        areaNew= teach.nextLine();
        System.out.println("New area for Teacher "+name+": "+areaNew);
        System.out.println("Change Successful");
    }
    public void getArea() {
        System.out.println("Teacher's area of teaching profession: "+area);
    }
    public double sum(int a, double b){
        double total=0.0;
        total= a + b;
        return total;
    }
    public double sum (double a, int b){
        double total=0;
        total= a + b;
        return total;
    }
    public  void sum(int ...demo){
        int total=0;
        for(int x: demo){
            total+=x;
        }
        System.out.println("Total: "+total);
    }
    public static void main(String [] t){
        Teacher tr1,tr2;
        tr1= new Teacher();
        tr1.getName(tr1.name);
        //tr1.getName("Jonathan");
        tr1.setName();
        tr1.getArea();
        tr1.setArea();
        System.out.println("---Teacher object 2---");
        tr2= new Teacher("Marcus", "Science");
        tr2.getName(tr2.name);
        //tr2.getName("Jonathan");
        tr2.setName();
        tr2.getArea();
        tr2.setArea();
        System.out.println("Sum 1: "+tr1.sum(2,8.3));
        System.out.println("Sum 2: "+tr1.sum(74.9,87));
        tr1.sum(23,46,29,37,82,12,2,5);
        tr2.sum(34,45,22,16,28,0);
    }
}
