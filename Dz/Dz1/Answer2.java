package Dz.Dz1;


// Реализуйте метод subArrays, принимающий в качестве аргументов два целочисленных массива a и b, и возвращающий новый массив c, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.

// Если длины массивов не равны - верните нулевой массив длины 1.

// Напишите свой код в методе subArrays класса Answer. Метод subArrays принимает на вход два параметра:

// int[] a - первый массив
// int[] b - второй массив
// Пример


// a = new int[]{4, 5, 6};
// b = new int[]{1, 2, 3};

// Вывод: [3, 3, 3]

// a = new int[]{4, 5, 6};
// b = new int[]{1, 2, 3, 5};

// Вывод: [0]


    import java.util.Arrays;

    public class Answer2 {
        public int[] subArrays(int[] a, int[] b){
            // Проверяем, равны ли длины массивов
            if (a.length != b.length) {
                // Возвращаем нулевой массив длины 1
                return new int[]{0};
            }
            
            // Создаем новый массив для хранения результатов
            int[] resultArray = new int[a.length];
            
            // Выполняем вычитание соответствующих элементов массивов
            for (int i = 0; i < a.length; i++) {
                resultArray[i] = a[i] - b[i];
            }
            
            // Возвращаем новый массив с результатами вычитания
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
                a = new int[]{4, 5, 6};
                b = new int[]{1, 2, 3};
            }
            else{
                a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
                b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
            }     
            
            Answer2 ans = new Answer2(); 
            String itresume_res = Arrays.toString(ans.subArrays(a, b));     
            System.out.println(itresume_res);
        }
    }
        
    // Этот код создает класс Answer с методом subArrays, который принимает два массива a и b. Метод выполняет вычитание соответствующих элементов массивов и возвращает новый массив с результатами. Если длины массивов не равны, метод возвращает нулевой массив длины 1.

    // В методе main также предоставлен код для тестирования метода subArrays.
