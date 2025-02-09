public class LessonThreeHomework {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int a;
        int b;
        a = (int) (Math.random() * 100);
        b = (int) (Math.random() * 100);
        System.out.println("a = " + a + " b = " + b);
        if (a == b){
            System.out.println("a == b");
        }
        if (a < b){
            System.out.println("a < b");
        }
        if (a > b){
            System.out.println("a > b");
        }
        //Задание 2
        System.out.println("\nЗадание 2");
        a = (int) (Math.random() * 100);
        b = (int) (Math.random() * 100);
        System.out.println("a = " + a + " b = " + b);
        if ((a + b) % 2 == 0){
            System.out.println("maybe a and b are even");
        }else{
            System.out.println("some variable is odd");
        }
        //Задание 3
        System.out.println("\nЗадание 3");
        a = (int) (Math.random() * 200);
        System.out.println("a = " + a);
        if (a > 10){
            System.out.println("больше 10");
        }
        if (a < 100){
            System.out.println("меньше 100");
        }
        if ( a / 2 > 20){
            System.out.println("результат деления на 2 больше 20");
        }
        if (a >= 5 && a <= 40){
            System.out.println("значение переменной между 5 и 40 включительно");
        }else{
            System.out.println("значение переменной меньше 5 или больше 40");
        }

    }
}
