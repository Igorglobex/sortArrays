package main;

import java.util.Arrays;
import java.util.Scanner;

public class Start {

   public static void bubbleSort (int[] array) {
       int temp;
       System.out.println(" ");
       System.out.println("Сортировка пузырьком: ");

       for (int i = 0; (i + 1) < array.length; i++ ) {
           for (int j = 0; (j + 1) < array.length; j++) {
               if (array[j] >= array[j + 1]) {
                   temp = array[j + 1];
                   array[j + 1] = array[j];
                   array[j] = temp;
               }
           }

       }
       for (int k = 0; k < array.length; k++ ) {

           System.out.print(array[k] + " ");
       }
    }

    public static void utilArraysSort (int[] array) {
        Arrays.sort(array);
        System.out.println(" ");
        System.out.println("Сортировка встроенным методом: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main (String[] args) {
        System.out.println("Введите длину массива: ");
        int arrayLength =  new Scanner(System.in).nextInt();
        int [] numsArray = new int[arrayLength];
        SortMethod myArray = new SortMethod();
        System.out.println("Созданный массив: ");
        for (int i = 0; i < numsArray.length; i++ ) {
            numsArray[i] = (int) (Math.random() * 9);
            System.out.print(numsArray[i] + " ");
        }

        System.out.println("обращение к классу ");
        myArray.myBubbleSort(numsArray);

        bubbleSort(numsArray);
        utilArraysSort(numsArray);








    }
}
