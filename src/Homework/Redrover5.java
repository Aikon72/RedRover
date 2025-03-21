package Homework;

import java.util.Arrays;

public class Redrover5 {
    public static void main(String[] args) {
        /* Задача №1
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести все нечетные числа из массива. */

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++){
            if ( array[i] % 2 != 0){
                System.out.println("Элемент " + i + ": " + array[i]);
            }
        }
        System.out.println("\nЗадача 2");
        /* Задача №2
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести все значения массива больше 5.*/
        for ( int i = 0; i < array.length; i++){
            if ( array[i] > 5){
                System.out.println("Элемент " + i + ": " + array[i]);
            }
        }
        /*Задача №3
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо увеличить все значения массива на 15.*/
        System.out.println("\nЗадача 3");
        for ( int i = 0; i < array.length; i++){
            array[i] += 15;
        }
        System.out.println(Arrays.toString(array));
    }
}
