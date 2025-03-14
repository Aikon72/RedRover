package Homework;

public class RedroverSevenTwo {
    public static void main(String[] args) {
//Вывести следующие строки с соответствующим форматированием (как пирамиды):
//Задача №1
//
//0  1  2  3  4  5  6  7  8  9
//0  1  2  3  4  5  6  7  8
//0  1  2  3  4  5  6  7
//0  1  2  3  4  5  6
//0  1  2  3  4  5
//0  1  2  3  4
//0  1  2  3
//0  1  2
//0  1
//0

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10-i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

//Задача №2
//
//0  1  2  3  4  5  6  7  8  9
//    0  1  2  3  4  5  6  7  8
//        0   1  2  3  4  5  6  7
//             0  1  2  3  4  5  6
//                 0  1  2  3  4  5
//                     0  1  2  3  4
//                         0  1  2  3
//                             0  1  2
//                                 0  1
//                                     0
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("   ");
            }
            for (int j = 0; j < 10-i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

//Задача №3
//
//9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
//   8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
//      7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
//         6 5 4 3 2 1 0 1 2 3 4 5 6
//            5 4 3 2 1 0 1 2 3 4 5
//               4 3 2 1 0 1 2 3 4
//                  3 2 1 0 1 2 3
//                     2 1 0 1 2
//                        1 0 1
//                           0

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("   ");
            }
            for (int j = 9 - i ; j >= 0; j--) {
                System.out.print(j + "  ");
            }
            for (int j = 1 ; j < 10 - i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }

    public static class RedroverSevenThree {
        public static void main(String[] args) {
            int a = 451;
            int b = 32;
            System.out.println(opSum(a, b));
            System.out.println(opMinus(a, b));
            System.out.println(opMult(a, b));
            System.out.println(opDiv(a, b));
        }

        public static int opSum(int x, int y) {
            return x + y;
        }
        public static int opMinus(int x, int y) {
            return x - y;
        }
        public static int opMult(int x, int y) {
            return x * y;
        }
        public static int opDiv(int x, int y) {
            return x / y;
        }
    }
}
