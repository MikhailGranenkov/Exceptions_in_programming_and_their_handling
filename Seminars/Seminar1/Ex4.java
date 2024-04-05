package Seminars.Seminar1;


// Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
// целочисленный одномерный массив.
// Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику:
// 1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
// пользователя
// 2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
// “подсветить”


public class Ex4 {
    public static void main(String[] args) {
        Integer[] arr = {12, -23, 56, 2, null, 0, null, -1};
        checkArray(arr);
    }

    public static void checkArray(Integer[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == null)
                System.out.println("Найден элемент null на индекске " + i);
        }
    }   
}
