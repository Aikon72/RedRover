package Homework;

public class RedRover5Fall {

    public static void main(String[] args) {
        System.out.println("Задача №1");
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести сумму всех значений массива.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum=0;
        for (int i=0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма: " + sum);

        System.out.println("\nЗадача №2");
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальный элемент: " + max);
//
        System.out.println("\nЗадача №3");
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Максимальный элемент: " + min);

        System.out.println("\nЗадача №4");
//        Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.

        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        sum=0;
        for (int i=0; i < array2.length; i++) {
            sum += array2[i];
        }
        System.out.println("Среднее арифметическое: " + sum/array2.length);



        System.out.println("\nЭкстра задача №1");
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.
        int[][] array3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        sum = 0;
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                sum += array3[i][j];
            }
        }
        System.out.println("Сумма: " + sum);

        System.out.println("\nЭкстра задача №2 и №3");
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести максимальное значение массива.

//                Экстра задача №3
//
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести количество элементов в массиве.
        max = array3[0][0];
        int count =0;
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                count ++;
                if (array3[i][j] > max) {
                    max = array3[i][j];
                }
            }
        }
        System.out.println("Количество элементов: " + count);
        System.out.println("Максимальный элемент массива: " + max);
    }
}
