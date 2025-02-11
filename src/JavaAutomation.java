public class JavaAutomation {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        for (int i = 0; i < 16; i++) {
            System.out.println(i);
        }
        //Задание 2
        System.out.println("\nЗадание 2");
        int i = 0;
        while (Math.pow(5, i) < 100000) {
            System.out.println("5 в степени " + i + " = " + Math.pow(5, i));
            i++;
        }
        //Задание 3 способ 1
        System.out.println("\nЗадание 3");
        for (i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
        //Задание 3 способ 2
        System.out.println("\nЗадание 3 способ 2");
        for (i = 40; i <= 60; i += 4) {
            System.out.println(i);
        }
    }
}
