package Seminars.Seminar2;

public class Ex2 {
    public static void main(String[] args){
        // Инициализируем двумерный массив строк
        String[][] arr = {{"1", "2"}, {"a", "3"}};
        
        // Выводим результат вызова метода sum2d и передаем ему массив arr
        System.out.println(sum2d(arr));
    }

    // Метод для суммирования чисел в двумерном массиве строк
    public static int sum2d(String[][] arr){
        int sum = 0; // Переменная для хранения суммы чисел
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                int val = 0; // Переменная для хранения преобразованного в целое число значения элемента массива
                try{
                    // Пытаемся преобразовать текущий элемент массива в целое число
                    val = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    // Если преобразование невозможно, ловим исключение NumberFormatException
                    // и выводим сообщение о невозможности преобразования элемента в целое число
                    System.out.println("Невозможно перевести элемент в целое число, находящийся на позиции -> " +
                            "(" + i + ", " + j + ")");
                }
                // Прибавляем преобразованное в целое число значение элемента к сумме
                sum += val;
            }
        }
        // Возвращаем общую сумму чисел в массиве
        return sum;
    }
}

// Основные моменты:

// Ввод данных: Создается двумерный массив строк arr, который содержит строки с числами и символами.
// Суммирование чисел: В методе sum2d производится итерация по всем элементам массива. Для каждого элемента пытаемся преобразовать его в целое число с помощью метода Integer.parseInt().
// Обработка исключений: Если преобразование невозможно из-за наличия в ячейке нечислового символа, ловится исключение NumberFormatException. В таком случае выводится сообщение о невозможности преобразования элемента в целое число и продолжается вычисление суммы.
// Результат: После преобразования всех возможных элементов и сложения их значений, возвращается общая сумма.