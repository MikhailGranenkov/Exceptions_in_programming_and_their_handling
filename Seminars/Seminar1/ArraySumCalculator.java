package Seminars.Seminar1;


// Задание №7
// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.


public class ArraySumCalculator {

    // Метод для сложения двух массивов
    public static int[] sumArrays(int[] array1, int[] array2) {
        // Проверяем, равны ли длины массивов
        if (array1.length != array2.length) {
            // Если длины массивов не равны, выводим сообщение об ошибке и возвращаем null
            System.out.println("Длины массивов не равны");
            return null;
        }
        
        // Создаем новый массив для хранения результата сложения
        int[] resultArray = new int[array1.length];
        
        // Выполняем сложение элементов массивов и записываем результат в новый массив
        for (int i = 0; i < array1.length; i++) {
            resultArray[i] = array1[i] + array2[i];
        }
        
        // Возвращаем новый массив с результатами сложения
        return resultArray;
    }

    public static void main(String[] args) {
        // Пример использования метода sumArrays
        
        // Исходные массивы
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        
        // Вызываем метод sumArrays для сложения массивов
        int[] resultArray = sumArrays(array1, array2);
        
        // Проверяем, был ли возвращен корректный результат
        if (resultArray != null) {
            // Если результат не null, выводим его на экран
            System.out.print("Результат сложения массивов: ");
            for (int num : resultArray) {
                System.out.print(num + " ");
            }
        }
    }
}
