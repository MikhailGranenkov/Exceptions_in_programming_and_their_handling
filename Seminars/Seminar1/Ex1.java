package Seminars.Seminar1;


// Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
// значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
// например:
// 1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в
// качестве кода ошибки.
// 2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
// 3. если вместо массива пришел null, метод вернет -3
// 4. придумайте свои варианты исключительных ситуаций и верните соответствующие
// коды ошибок.
// Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот
// метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное
// значение и покажет читаемый результат пользователю. Например, если вернулся -2,
// пользователю выведется сообщение: “Искомый элемент не найден”.

public class Ex1 {

public static void main(String[] args) {
    int[] arr = {1, 3, 5, 6546, 45, 34};

    // Вызываем метод getText, передавая в него результат выполнения метода getNumber
    getText(getNumber(arr, 3, 5));
}

public static int getNumber(int[] arr, int min, int num) {
    // Проверяем, если массив пустой
    if (arr == null) {
        return -3;
    }
    // Проверяем, если длина массива меньше минимального значения
    if (arr.length < min) {
        return -1;
    }
    // Поиск элемента num в массиве arr
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == num) {
            return i; // Возвращаем индекс найденного элемента
        }
    }
    return -2; // Если элемент не найден
}

public static void getText(int code) {
    switch (code) {
        case -3:
            System.out.println("Массив пустой");
            break;
        case -1:
            System.out.println("Длина меньше минимума");
            break;
        case -2:
            System.out.println("Элемент не найден");
            break;
        default:
            System.out.println("Искомый элемент находится на индексе " + code);
            break;
    }
}
}

// Метод main является точкой входа в программу. В этом методе создается массив arr, содержащий целочисленные значения. Затем вызывается метод getText с аргументом, который представляет собой результат выполнения метода getNumber, передавая в него массив arr, минимальное значение 3 и число 5.

// Метод getNumber принимает массив arr, минимальное значение min и искомое число num. Этот метод проверяет различные условия:

// Проверяет, является ли переданный массив null. Если да, возвращает -3, что означает "Массив пустой".
// Проверяет, является ли длина массива меньше min. Если да, возвращает -1, что означает "Длина меньше минимума".
// Проходится по элементам массива, и если находит элемент, равный num, возвращает его индекс. Если такой элемент не найден, возвращает -2, что означает "Элемент не найден".

// Метод getText принимает код code, который был возвращен методом getNumber, и выводит соответствующее сообщение в зависимости от значения code. Если code равен -3, выводится "Массив пустой". Если code равен -1, выводится "Длина меньше минимума". Если code равен -2, выводится "Элемент не найден". Иначе выводится сообщение о том, что "Искомый элемент находится на индексе " и значение code.

// Таким образом, данный код выполняет поиск элемента в массиве и возвращает соответствующий код, который затем используется для вывода информации о результате поиска.