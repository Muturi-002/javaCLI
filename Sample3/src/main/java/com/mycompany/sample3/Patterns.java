package com.mycompany.sample3;

import java.util.Scanner;
public class Patterns {
    /*static Scanner m= new Scanner(System.in);
    not allow user input of symbol.
     */
    static int pattern;
    public static void menu(){
        int choice;
        System.out.println("Welcome. What option do you wish to run?");
        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.println("3. Terminate");
        Scanner m= new Scanner(System.in);
        choice= m.nextInt();
        switch (choice) {
            case 1:
                square();
                break;
            case 2:
                triangle();
                break;
            case 3:
                terminate();
                //System.exit(0)- function to terminate program.
                //not necessary to include method.
                break;
            default:
                System.out.println("Invalid entry. Please try again");
                menu();
        }
    }
    public static void square(){
        int size,i;
        String symbol;
        Scanner s= new Scanner(System.in);
        System.out.println("=======Square=======");
        System.out.println("Enter symbol for the square: ");
        symbol=s.nextLine();
        System.out.println("Enter size of the square: ");
        size=s.nextInt();
        System.out.println("Symbol: "+symbol);
        System.out.println("Size: "+size);
        for(i=1;i<=size;i++){
            for(int y=1;y<size;y++){
                System.out.print(y+"\t");
            }
            System.out.println(i);
        }
        menu();
    }
    public static void triangle(){
        int size,i,d;
        d=1;
        String symbol;
        Scanner t= new Scanner(System.in);
        System.out.println("Enter symbol for the triangle: ");
        symbol=t.nextLine();
        System.out.println("Enter size of the triangle: ");
        size=t.nextInt();
        System.out.println("=======Triangle=======");
        System.out.println("Symbol: "+symbol);
        System.out.println("Size: "+size);
        for(i=1; i<=size;i++){
            for(int y=1;y<i;y++){
                System.out.print(symbol+"\t");
            }
            System.out.println(i);
        }
        System.out.println("INVERTED TRIANGLE");
            /*for(int y= size; y>=1;y--){
                for(i=1;i<=y;y++) {
                    System.out.print(symbol + "\t");
                }

            System.out.println(symbol);
            }*/
        for(i=size;i>=1;i--){
            for(int y=1;y<i;y++){
                System.out.print(y+"\t");
            }
            System.out.println(symbol);
        }
        menu();
    }
    public static void terminate(){
        System.out.println("Thank you for participating. Come again next time");
    }
    public static void main(String [] s){
        menu();
    }
}
