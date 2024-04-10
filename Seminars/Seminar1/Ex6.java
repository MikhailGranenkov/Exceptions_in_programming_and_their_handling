package Seminars.Seminar1;


// Дан класс
// https://github.com/sabinaIsm/test/blob/d2ebf811b85139783b1a0dcbe3714dbb28deee82/Ra ndomExceptionsClass.java
// Запустите код, с помощью анализа стектрейса найдите и по возможности исправьте ошибки, добейтесь корректного выполнения программы.


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Ex6 {
    public static void main(String[] args) throws IOException {
        // Вызываем метод callMethod6 с пустой строкой в качестве аргумента
        callMethod6("");
        
        // Вызываем метод callMethod1 и приводим результат к ArrayList
        ArrayList<String> stringArraysList = (ArrayList<String>) callMethod1();
        
        // Инициализируем переменные a и b
        int a=10, b=1;
        
        // Вызываем метод callMethod6 снова
        callMethod6("");
        
        // Вызываем метод callMethod2, передавая в него переменные a и b, и присваиваем результат переменной div
        int div = callMethod2(a, b);
        System.out.println(div); // Выводим результат деления
        
        // Снова вызываем метод callMethod6
        callMethod6("");
        
        // Вызываем метод callMethod3, передавая в него ArrayList stringArraysList
        callMethod3(stringArraysList);
    }

    // Метод для вывода строки "Hello World, it's me!"
    private static void callMethod6(String s) {
        System.out.println("Hello World, it's me!");
    }

    // Метод, возвращающий коллекцию строк
    private static Collection<String> callMethod1() throws IOException {
        callMethod2(100000000, 10-9); // Вызываем метод callMethod2 с аргументами
        ArrayList<String> ls = new ArrayList<>();
        ls.add("cat");
        return ls; // Возвращаем созданный ArrayList
    }

    // Метод для деления двух чисел
    public static int callMethod2(int a, int b) throws IOException {
        callMethod6(""); // Вызываем метод callMethod6
        FileInputStream fis = new FileInputStream("1.txt"); // Открываем поток для чтения файла "1.txt"
        fis.read(); // Читаем из потока
        
        // Проверяем, есть ли еще доступные байты в потоке. Если да, выбрасываем исключение RuntimeException
        if(fis.available() > 0) throw new RuntimeException();
        
        int num = callMethod4("1240"); // Вызываем метод callMethod4 с аргументом "1240" и присваиваем результат переменной num
        return a/b; // Возвращаем результат деления
    }

    // Метод для преобразования строки в число
    private static int callMethod4(String s) {
        callMethod5(s); // Вызываем метод callMethod5 с аргументом s
        return Integer.parseInt(s); // Преобразуем строку в число и возвращаем его
    }

    // Метод для заполнения массива строк
    private static void callMethod5(String s) {
        callMethod6(""); // Вызываем метод callMethod6
        String[] strings = new String[5]; // Создаем массив строк длиной 5
        for (int i = 1; i < strings.length; i++){ // Проходим по массиву (со второго элемента)
            strings[i] = s; // Заполняем текущий элемент строкой s
        }
    }
}

     
// В этом коде вызываются различные методы, включая методы для работы с файлами (FileInputStream), обработки исключений (IOException, RuntimeException), преобразования типов данных (parseInt), а также методы для вывода сообщений в консоль (callMethod6). Методы callMethod3, callMethod4 и callMethod5 также вызываются внутри других методов для выполнения определенных операций.