public class RedroverTwo {
    public static void main(String[] args) {
        /*Задача №1
        Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор
        и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление
        и остаток от деления. Также сделать проверку на четность этих переменных и вывести результат.*/
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
        /*Задача №2
        Необходимо создать целочисленные переменные a и b, присвоить им произвольные значения,
        а потом поменять значения местами (значение переменной a должно оказаться в переменной b и наоборот).*/
        System.out.println("\nЗадание 2");
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a = " + a + ", b = " + b);
        /*Задача №3
        Создать программу дележа добычи на пиратском корабле. По обычаю, половина добычи идет владельцу корабля,
        половина оставшегося — капитану, остальное делится поровну между всеми членами команды, включая капитана.
        Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
        Вывести на экран кому сколько пиастров полагается
        Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?
        Дополнительное задание со звездочкой
        Попробовать придумать как программа может проверить правильность дележа.*/
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
