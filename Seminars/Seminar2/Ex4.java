package Seminars.Seminar2;

import java.io.*;

public class Ex4 {
    public static void main(String[] args){
        InputStream inputStream; // Объявление переменной типа InputStream
        
        String[] strings = {"asdf", "asdf"}; // Создание массива строк
        
        try{
            // Попытка обратиться к третьему элементу массива strings
            String strings1 = strings[2];
        } catch (ArrayIndexOutOfBoundsException e){
            // Обработка исключения, если индекс выходит за пределы массива
            System.out.println("Выход за пределы массива");
        }
        
        try{
            // Вызов метода test(), который может выбросить исключение
            test();
        }
        catch (Throwable error){
            // Обработка любого исключения, которое может быть выброшено в методе test()
            error.printStackTrace(); // Вывод стека вызовов исключения
        }
        
        try {
            // Попытка выполнить деление на ноль
            int a = 1 / 0;
        } catch (ArithmeticException e){
            // Обработка исключения, если происходит деление на ноль
            e.printStackTrace(); // Вывод стека вызовов исключения
        }
        
        try{
            // Попытка создать объект FileInputStream для чтения файла
            inputStream = new FileInputStream("asdfsdasa");
        }
        catch (IOException e){
            // Обработка исключения, если файл не может быть открыт или не существует
            System.out.println("Ошибка при открытии файла");
        }
        
        System.out.println("Я жив!"); // Вывод сообщения после завершения блока try-catch
    }

    // Метод, который может выбросить исключение IOException
    public static void test() throws IOException{
        File file = new File("1");
        file.createNewFile(); // Создание нового файла
        FileReader reader = new FileReader(file); // Создание объекта FileReader для чтения файла
        reader.read(); // Чтение данных из файла
        test(); // Рекурсивный вызов метода test()
    }
}

// Основные моменты:

// Обращение к элементу массива: В блоке try-catch пытаемся получить доступ к элементу массива strings по индексу 2. Если индекс выходит за пределы массива, выбрасывается исключение ArrayIndexOutOfBoundsException.
// Вызов метода, который может выбросить исключение: Метод test() вызывается в блоке try-catch. Внутри метода test() создается файл и читается содержимое. Этот метод может выбросить исключение IOException, которое затем ловится в main().
// Деление на ноль: В блоке try-catch происходит деление на ноль. Если деление на ноль выполняется, выбрасывается исключение ArithmeticException.
// Открытие файла: Пытаемся создать объект FileInputStream для чтения файла. Если файл не существует или не может быть открыт по какой-либо другой причине, выбрасывается исключение IOException.
// Вывод сообщения после блоков try-catch: После всех блоков try-catch выводится сообщение "Я жив!", которое говорит о том, что программа продолжила выполнение и не завершилась в результате выброшенных исключений.