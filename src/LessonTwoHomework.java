public class LessonTwoHomework {
    public static void main(String[] args) {
        //Задание 1
        int a;
        int b;
        a = (int) (Math.random()*100);
        b = (int) (Math.random()*100);
        System.out.println("Задание 1");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        if (b == 0) {
            System.out.println("Ошибка: b не может быть равен нулю при делении.");
        }else {
            System.out.println("a / b = " + (a / b));
        }
        System.out.println("a % b = " + (a % b));
        if (a % 2 == 0){
            System.out.println("a - четное");
        }else{
            System.out.println("a - не четное");
        }
        if (b % 2 == 0){
            System.out.println("b - четное");
        }else{
            System.out.println("b - не четное");
        }
        //Задание 2
        System.out.println("\nЗадание 2");
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a = " + a + ", b = " + b);
        //Задание 3
        System.out.println("\nЗадание 3");
        int bank = (int) (Math.random()*5000);
        int size = (int) (Math.random()*20);
        System.out.println("Пиратов на корабле " + size + ". Добыча " + bank + " пиастров");
        int owner = bank / 2;
        int remain = bank - owner;
        int cap = remain / 2;
        remain -= cap;
        int dolya = remain / ( size + 1 );
        cap += dolya;
        remain -=  dolya * ( size + 1 );
        System.out.println("Владелец получает " + owner + " пиастров");
        System.out.println("Капитан получает " + cap + " пиастров");
        System.out.println("Член команды получает " + dolya + " пиастров");
        System.out.println("Остаток " + remain + " пиастров");
        System.out.println("Джек Воробей получает " + (cap + owner) + " пиастров");
        int unit = owner + cap + remain + size * dolya;
        if (unit - bank == 0) {
            System.out.println("Программа считает верно");
        }else{
            System.out.println(unit + " Расхождение в " + (bank - unit) + " пиастров");
        }
            }
}
