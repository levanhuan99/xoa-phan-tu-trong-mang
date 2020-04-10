package com.codewithme;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] array={1,2,3,4,5,6};
	    int[] newArray=new int[5];

        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so ban muon xoa: ");
        int number=scanner.nextInt();

        int j=0;
        for (int i=0;i<array.length;i++){
            if (array[i]!=number){
                newArray[j]=array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArray));

    }
}
