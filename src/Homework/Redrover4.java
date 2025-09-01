package Homework;

import java.util.Arrays;

public class Redrover4 {
    public static void main(String[] args) {
        printTask(1);
        /* Задача №1
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести все нечетные числа из массива. */

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("Элемент " + i + ": " + array[i]);
            }
        }

        printTask(2);
        /* Задача №2
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести все значения массива больше 5.*/

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                System.out.println("Элемент " + i + ": " + array[i]);
            }
        }

        printTask(3);
        /*Задача №3
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо увеличить все значения массива на 15.*/

        System.out.println("\nЗадача 3");
        for (int i = 0; i < array.length; i++) {
            array[i] += 15;
        }
        System.out.println(Arrays.toString(array));


        printTask(4);
//    Задача №4
//
//    Дана строка:
//    String s = “Перестановочный алгоритм быстрого действия”;
//    необходимо вывести все буквы “о” из этой строки.
//    Для указанной строки ответ будет “ооооо” (или в столбик)

        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.print("о");
            }
        }

        printTask(5);
//    Задача №5
//
//    Дана строка:
//    String s = “Перевыборы выбранного президента”;
//    необходимо подсчитать количество букв “е” в строке.
//    Для указанной строки ответ будет 4.

        String s1 = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println("Количество букв 'е' = " + count);

        printTask(6);
//    Задача №6
//
//    Дан массив:
//    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    необходимо вывести сумму всех значений массива.

        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        System.out.println("Сумма элементов: " + sum);

//    Задача №7
//            (немного подумать придется)
//
//    Возвращаясь к маньяку со спичками с лекции.
    }

    public static void printTask(int x) {
        System.out.println("\nЗадание №" + x);
    }
}