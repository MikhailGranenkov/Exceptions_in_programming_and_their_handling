package Dz.Dz2;


// Напишите программу, которая проверяет, является ли введенная текстовая строка числом с плавающей точкой (float).
// Программа пытается преобразовать введенную строку в число float, и если это успешно, она выводит полученное число.
// Если преобразование не удалось, программа выдаёт сообщение об ошибке
// Your input is not a float number. Please, try again.
// и возвращает специальное значение Float.NaN, чтобы обозначить ошибку.

// На входе:
// '3.14'
// 'Ivan'
// На выходе:
// 3.14


public class IsFloat {
    public static float isFloat(String input) {
        try {
            // Пытаемся преобразовать введенную строку в число с плавающей точкой (float)
            float number = Float.parseFloat(input);
            return number; // Если успешно, возвращаем полученное число
        } catch (NumberFormatException e) {
            // Если возникает исключение NumberFormatException, значит, введенная строка не является числом с плавающей точкой
            System.out.println("Your input is not a float number. Please, try again.");
            return Float.NaN; // Возвращаем специальное значение Float.NaN, обозначающее ошибку
        }
    }
}

// Класс для вывода результатов на экран и проверки
class Printer {
    public static void main(String[] args) {
        String input;

        // При отправке кода на выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            input = "3.14"; // По умолчанию используем "3.14", если аргумент не передан
        } else {
            input = args[0];
        }

        float result = IsFloat.isFloat(input);
        System.out.println(result);
    }
}


// Это решение использует метод Float.parseFloat(), который пытается преобразовать строку в число с плавающей точкой. Если преобразование проходит успешно, программа возвращает полученное число. Если возникает исключение NumberFormatException, программа выводит сообщение об ошибке и возвращает специальное значение Float.NaN, чтобы обозначить ошибку.