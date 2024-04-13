package Seminars.Seminar3;


// 1. Напишитеметод,навход которогоподаётсядвумерныйстроковыймассив
// размером 4х4. При подаче массива другого размера необходимо бросить
// исключениеMyArraySizeException.
// 2. Далееметоддолженпройтисьповсемэлементаммассива,преобразоватьв
// int и просуммировать. Если в каком-то элементе массива преобразование
// не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException с детализацией, в
// какойименноячейкележатневерныеданные.
// 3. В методе main() вызвать полученный метод, обработать возможные
// исключения MyArraySizeException и MyArrayDataException и вывести
// результатрасчета (суммуэлементов,приусловиичто подалинавход
// корректныймассив).


import java.io.IOException;

public class Ex4 {

    // Вложенный класс Main
    class Main {
        // Главный метод программы
        public static void main(String[] args) throws IOException {
            // Инициализируем двумерный массив строк
            String[][] arr = {
                {"12", "23", "1", "-1"},
                {"-23", "0", "5", "3"},
                {"4", "1", "0", "-7"}
            };
            // Выводим сумму элементов массива на экран
            System.out.println(sumArray(arr));
        }

        // Метод для суммирования элементов двумерного массива
        public static int sumArray(String[][] array) {
            // Проверяем размерность массива, если она не соответствует 4x4, бросаем исключение MyArraySizeException
            if (array.length != 4 || array[0].length != 4)
                throw new MyArraySizeException(array.length, array[0].length);
            int resultSum = 0;
            // Проходим по всем элементам массива
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        // Пытаемся преобразовать каждый элемент массива в число и добавить его к сумме
                        resultSum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        // Если элемент не удалось преобразовать в число, бросаем исключение MyArrayDataException
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
            return resultSum;
        }
    }

    // Вложенный класс MyArraySizeException, расширяющий RuntimeException
    class MyArraySizeException extends RuntimeException {
        // Конструктор без параметров, устанавливающий стандартное сообщение об ошибке
        public MyArraySizeException() {
            super("Размер двумерного массива должен быть 4x4");
        }

        // Конструктор с параметрами, устанавливающий сообщение об ошибке с указанием текущей размерности массива
        public MyArraySizeException(int row, int column) {
            super("Размер двумерного массива должен быть 4x4, у Вас (" + row + "; " + column + ")");
        }
    }

    // Вложенный класс MyArrayDataException, расширяющий NumberFormatException
    class MyArrayDataException extends NumberFormatException {
        // Конструктор без параметров, устанавливающий стандартное сообщение об ошибке
        public MyArrayDataException() {
            super("Невозможно преобразовать элемент в числовой формат данных");
        }

        // Конструктор с параметрами, устанавливающий сообщение об ошибке с указанием позиции элемента в массиве
        public MyArrayDataException(int i, int j) {
            super("Невозможно преобразовать элемент в числовой формат данных, находящийся на позиции ->" +
                " (" + i + "; " + j + ")");
        }
    }
}

// Класс Ex4 содержит вложенные классы Main, MyArraySizeException и MyArrayDataException. Класс Main содержит метод sumArray, который вычисляет сумму элементов двумерного массива строк. Если размер массива не равен 4x4, бросается исключение MyArraySizeException. Если элемент массива не удается преобразовать в число, бросается исключение MyArrayDataException.