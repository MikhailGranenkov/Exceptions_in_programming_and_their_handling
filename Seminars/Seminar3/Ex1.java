package Seminars.Seminar3;


// Создайте метод doSomething(), который может быть источником одного из
// типовcheckedexceptions(телосамогометодапрописывать необязательно).
// Вызовите этот метод из main и обработайте в нем исключение, которое
// вызвалметод doSomething().

// В данном коде есть класс Ex1, содержащий метод main, который вызывает метод doSomething(). Метод doSomething() объявлен с выражением throws IOException, что означает, что он может бросить исключение типа IOException.


import java.io.IOException;

public class Ex1 {
    // Главный метод программы
    public static void main(String[] args) {
        try {
            // Вызываем метод doSomething()
            doSomething();
        } catch (IOException e) {
            // Обрабатываем возможное исключение типа IOException, выводим информацию об ошибке
            e.printStackTrace();
        }
    }

    // Метод, который может бросить исключение типа IOException
    public static void doSomething() throws IOException {
        // В этом методе обычно происходит какая-то работа, которая может привести к IOException
        // Например, чтение из файла или запись в файл
        // В данном случае метод пока не содержит никакой реализации, но он объявлен с выражением throws,
        // чтобы показать, что он может сгенерировать исключение типа IOException
    }
}

// Метод main вызывает doSomething(), который может бросить IOException. Если это происходит, программа перехватывает исключение и выводит информацию об ошибке.