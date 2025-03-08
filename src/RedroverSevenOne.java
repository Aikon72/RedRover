public class RedroverSevenOne {
    public static void main(String[] args){
        //Задача №1
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести сумму всех значений массива.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Задача №1 Сумма всех элементов = " + sum);

        //Задача №2
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести максимальное значение массива.

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("\nЗадача №2 Максимальный элемент = " + max);

        //Задача №3
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести минимальное значение массива.

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("\nЗадача №3 Минимальный элемент = " + min);

        //Задача №4
        //Дан массив:
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //необходимо вывести среднее арифметическое всех значений массива.

        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        avg /= array.length;
        System.out.println("\nЗадача №4 Среднее арифметическое = " + avg);

        //Задача №5
        //Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести сумму элементов массива.

        int[][] arr2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j< arr2[i].length; j++) {
                sum  += arr2[i][j];
            }
        }
        System.out.println("\nЗадача №5 Сумма всех элементов = " + sum );

        //Задача №6
        //Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести максимальное значение массива.
        max = arr2[0][0];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
               if (arr2[i][j] > max) {
                   max = arr2[i][j];
               }
            }

        }
        System.out.println("\nЗадача №6 Максимальный элемент = " + max);

        //Задача №7
        //Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести количество элементов в массиве.

        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                count++;
            }
        }
        System.out.println("\nЗадача №7 Количество элементов в массиве = " + count);
    }


}
