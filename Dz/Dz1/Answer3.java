package Dz.Dz1;


// Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b, и возвращающий новый массив с, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.

// Если длины массивов не равны - верните нулевой массив длины 1.

// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

// Напишите свой код в методе divArrays класса Answer. Метод divArrays принимает на вход два параметра:

// int[] a - первый массив
// int[] b - второй массив
// Пример


// a = new int[]{12, 8, 16};
// b = new int[]{4, 2, 4};

// Вывод: [3, 4, 4]

// a = new int[]{12, 8, 16, 25};
// b = new int[]{4, 2, 4};

// Вывод: [0]


import java.util.Arrays;

public class Answer3 {
    public int[] divArrays(int[] a, int[] b){
        // Проверяем, равны ли длины массивов
        if (a.length != b.length) {
            // Возвращаем нулевой массив длины 1
            return new int[]{0};
        }
        
        // Создаем новый массив для хранения результатов
        int[] resultArray = new int[a.length];
        
        // Выполняем деление соответствующих элементов массивов
        for (int i = 0; i < a.length; i++) {
            // Проверяем, не является ли делитель нулем
            if (b[i] == 0) {
                // Если делитель равен нулю, генерируем исключение RuntimeException
                throw new RuntimeException("Деление на ноль невозможно");
            }
            resultArray[i] = a[i] / b[i];
        }
        
        // Возвращаем новый массив с результатами деления
        return resultArray;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Printer{ 
    public static void main(String[] args) { 
        int[] a = {};
        int[] b = {};
        
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2, 4};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }     
        
        Answer3 ans = new Answer3(); 
        String itresume_res = Arrays.toString(ans.divArrays(a, b));     
        System.out.println(itresume_res);
    }
}


// В этом коде метод divArrays выполняет деление соответствующих элементов массивов a и b. Если какой-либо элемент в массиве b равен нулю, метод генерирует исключение RuntimeException с сообщением о невозможности деления на ноль.