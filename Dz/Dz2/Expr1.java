package Dz.Dz2;


// Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
// При этом программа должна проверить, что делитель b не равен нулю, и выполнить деление только в этом случае.
// Если b равен нулю, программа должна вернуть результат равный нулю.
// После выполнения операции деления, программа также должна вывести сумму чисел a и b с помощью метода printSum.
// Если аргументы не переданы через командную строку, используйте значения по умолчанию.

// На входе:
// '12'
// '5'
// На выходе:
// 17
// 2.4


public class Expr1 {
    
        public static double expr(int a, int b) {
            if (b != 0) {
                double result = (double) a / b;
                printSum(a, b);
                return result;
            } else {
                printSum(a, b);
                return 0; // Возвращаем 0, если делитель равен нулю
            }
        }
    
        public static void printSum(int a, int b) {
            System.out.println(a + b);
        }
    }
    
    public class Printer {
        public static void main(String[] args) {
            int a;
            int b;
    
            if (args.length == 0) {
                a = 12; // Значение по умолчанию
                b = 5; // Значение по умолчанию
            } else {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            }
    
            double result = Expr.expr(a, b);
            System.out.println(result);
        }
    }
    
    // Этот код выполняет деление только в том случае, если делитель b не равен нулю. В противном случае программа возвращает 0. После выполнения операции деления программа также выводит сумму чисел a и b с помощью метода printSum.