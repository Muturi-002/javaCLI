package com.mycompany.sample3;
import java.util.Scanner;

public class MethodArray {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] a){
        int size;
        System.out.println("Enter the size of the array");
        size= reader.nextInt();
        myArray(size);
    }
    public static void myArray(int s){
        int[] array1= new int[s];
        for(int x=0; x<s;x++){
            System.out.println("Enter array"+(x+1)+" before sorting: ");
            array1[x]= reader.nextInt();
        }
        System.out.println("Array elements before sorting:");
        for(int k:array1)
        //similar to for...in range() for Python
            System.out.print(k + "\t");
        int total= sum(array1);
        System.out.println("\nThe sum of array elements is: "+total);
        sortingArray(array1);
    }
    public static int sum(int[] array2){
        int all=0;
        for(int m:array2){
            all+=m;
        }
        return all;
    }
    public static void sortingArray(int[] array3){
        int d,max;
        /*for(int n:array3){
            if(array3[n]>array3[n+1]){
                small=array3[n];
            }
        }*/
        for(d=0;d<array3.length;d++){
            /*if(array3[d]>array3[d+1]) {
                max = array3[d];
                System.out.println(max);
            }p
            else {
                array3[d+1]=array3[d];
            }*/
            //DIFFERENT COUNTER VARIABLE FOR THIS NEXT LOOP
            for(int i=0;i<array3.length-1;i++){
                if(array3[i]<array3[i+1]) {
                    max = array3[i];
                    array3[i] = array3[i + 1];
                    array3[i + 1] = max;
                }
            }
        }
        System.out.println("Array sorted in descending order: ");
        for(int s:array3){
            System.out.println(s);
        }
    }
}
