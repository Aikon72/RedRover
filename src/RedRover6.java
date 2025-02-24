public class RedRover6 {
    public static void main(String[] args) {
        printTask(1);
        System.out.println("Задача №1");
        //Дана строка:
        //String s = “Перестановочный алгоритм быстрого действия”;
        //необходимо вывести все буквы “о” из этой строки.
        //Для указанной строки ответ будет “ооооо” (или в столбик)

        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.print("о");
            }
        }

        printTask(2);
        //Дана строка:
        //String s = “Перевыборы выбранного президента”;
        //необходимо подсчитать количество букв “е” в строке.
        //Для указанной строки ответ будет 4.

        String s1 = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'е'){
                count++;
            }
        }
        System.out.println("Количество букв 'е' = " + count);

        printTask(3);
        //Дана строка:
        //String s = “Посмотрите как Рите нравится ритм”;
        //необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
        //Для указанной строки ответ будет 6, 15, 29.

        //String s2 = "Посмотрите как Рите нравится ритм";
        //for (int i = 0; i < s2.length()-2; i++) {
        //    if (s2.charAt(i) == "рит"){
        //        System.out.println(i);
        //    }

        //}
    }


    public static void printTask(int x) {
        System.out.println("Задание №" + x);
        System.out.println();
    //Экстра задача
        //
        //Дан массив:
        //String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
        //необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
        //
        //Экстра-экстра задача
        //
        //Создайте массив размером 5 на 5 (или 10 на 10, или любого другого размера так, чтобы количество строк и количество столбцов совпадало).
        //
        //Преобразуйте этот массив таким образом, чтобы то, что было строками, стало столбцами и наоборот. Внимание! Не надо менять структуру массива. Задание требует только переместить элементы массива.
        //
        //Тип элементов массива может быть любой по вашему выбору.
        //
        //Пример:
        //
        //
        //Если взять массив целых чисел размером 3 на 3:

    }
}
