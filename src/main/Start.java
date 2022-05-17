package main;

import java.util.Arrays;
import java.util.Scanner;

public class Start {



    public static void main (String[] args) {
        System.out.print("Введите длину массива: ");
        int arrayLength =  new Scanner(System.in).nextInt();
        int [] numsArray = new int[arrayLength];
        SortMethod mySortMethod = new SortMethod();
        for ( int i = 0; i < arrayLength; i++) {
            numsArray[i] = (int) (Math.random() * 9);
        }

        int [] numsArrayCopyOne =  Arrays.copyOf(numsArray, arrayLength);
        int [] numsArrayCopyTwo =  Arrays.copyOf(numsArray, arrayLength);
        int [] numsArrayCopyThree =  Arrays.copyOf(numsArray, arrayLength);
        int [] numsArrayCopyFour =  Arrays.copyOf(numsArray, arrayLength);
        int [] numsArrayCopyFive =  Arrays.copyOf(numsArray, arrayLength);
        int [] numsArrayCopySix =  Arrays.copyOf(numsArray, arrayLength);

        System.out.print("\nСозданный массив: " + Arrays.toString(numsArray));

        mySortMethod.utilArraysSort(numsArrayCopyOne);
        mySortMethod.bubbleSort(numsArrayCopyTwo);
        mySortMethod.bubbleSortInDescending(numsArrayCopyThree);
        mySortMethod.shakerSort(numsArrayCopyFour);
        mySortMethod.combSort(numsArrayCopyFive);











    }
}
