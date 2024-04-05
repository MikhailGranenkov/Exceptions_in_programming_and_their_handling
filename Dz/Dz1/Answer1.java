package Dz.Dz1;


// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.

// Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
// Метод divisionByZero - Деление на 0
// Метод numberFormatException - Ошибка преобразования строки в число
// Важно: они не должны принимать никаких аргументов


public class Answer1 {
    public static void arrayOutOfBoundsException() {
        int[] array = new int[5];
        // Попытка обратиться к элементу массива за его пределами
        int value = array[10];
    }

    public static void divisionByZero() {
        int numerator = 10;
        int denominator = 0;
        // Попытка деления на ноль
        int result = numerator / denominator;
    }

    public static void numberFormatException() {
        String str = "abc";
        // Попытка преобразования строки в число, содержащей нечисловые символы
        int number = Integer.parseInt(str);
    }
}

class Printer {
    public static void main(String[] args) {
        Answer1 ans = new Answer1();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}


// В этом коде:

// Метод arrayOutOfBoundsException пытается получить доступ к элементу массива по индексу, который выходит за пределы размера массива, что приводит к генерации ArrayIndexOutOfBoundsException.
// Метод divisionByZero пытается выполнить деление на ноль, что приводит к генерации ArithmeticException.
// Метод numberFormatException пытается преобразовать строку, содержащую символы, не являющиеся числами, в число с помощью Integer.parseInt, что приводит к генерации NumberFormatException.