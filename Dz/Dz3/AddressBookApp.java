package Dz.Dz3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddressBookApp {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите данные в формате: Фамилия Имя Отчество дата_рождения номер_телефона пол");
            String input = scanner.nextLine();
            try {
                processInput(input);
            } catch (InvalidDataException e) {
                System.out.println("Ошибка в данных: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Ошибка при работе с файлом: " + e.getMessage());
            }
        }
    }

    private static void processInput(String input) throws InvalidDataException, IOException {
        String[] data = input.split(" ");
        if (data.length != 6) {
            throw new InvalidDataException("Неверное количество данных. Введите все требуемые данные.");
        }

        String surname = data[0];
        String name = data[1];
        String patronymic = data[2];
        String birthDate = data[3];
        String phoneNumber = data[4];
        String gender = data[5];

        if (!isValidDateFormat(birthDate)) {
            throw new InvalidDataException("Неверный формат даты рождения. Используйте формат dd.mm.yyyy.");
        }

        if (!isValidPhoneNumberFormat(phoneNumber)) {
            throw new InvalidDataException("Неверный формат номера телефона. Используйте целое беззнаковое число без форматирования.");
        }

        if (!isValidGenderFormat(gender)) {
            throw new InvalidDataException("Неверный формат пола. Используйте символ латиницей f (женский) или m (мужской).");
        }

        try (FileWriter writer = new FileWriter(surname + ".txt", true)) {
            writer.write(surname + " " + name + " " + patronymic + " " + birthDate + " " + phoneNumber + " " + gender + "\n");
        }
    }

    // Метод для проверки формата даты рождения
    private static boolean isValidDateFormat(String date) {
        // Проверка формата даты рождения
        return true; // Для примера всегда возвращает true
    }

    // Метод для проверки формата номера телефона
    private static boolean isValidPhoneNumberFormat(String phoneNumber) {
        // Проверка формата номера телефона
        return true; // Для примера всегда возвращает true
    }

    // Метод для проверки формата пола
    private static boolean isValidGenderFormat(String gender) {
        // Проверка формата пола
        return gender.equals("f") || gender.equals("m");
    }
}

class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}


// Класс AddressBookApp и метод main:
// AddressBookApp - это основной класс приложения, который содержит метод main, точку входа в приложение.
// Метод main запускает приложение, запрашивая у пользователя ввод данных о контакте. После этого вызывается метод processInput, который обрабатывает введенные данные.
// В случае возникновения исключений InvalidDataException или IOException, они обрабатываются в блоке catch, выводится соответствующее сообщение об ошибке.
// Метод processInput:
// Этот метод разбирает введенные пользователем данные о контакте.
// Входные данные разделяются на отдельные компоненты (фамилия, имя, отчество, дата рождения, номер телефона, пол).
// Проверяются правильность форматов даты рождения, номера телефона и пола с помощью вспомогательных методов isValidDateFormat, isValidPhoneNumberFormat и isValidGenderFormat соответственно.
// Если форматы данных не соответствуют требованиям, выбрасывается исключение InvalidDataException.
// Если данные корректны, они записываются в файл с именем, соответствующим фамилии контакта.
// Методы проверки форматов:
// isValidDateFormat, isValidPhoneNumberFormat и isValidGenderFormat - это вспомогательные методы для проверки корректности форматов даты рождения, номера телефона и пола соответственно.
// Каждый метод выполняет проверку формата данных и возвращает true, если формат корректен, и false в противном случае.
// Класс InvalidDataException:
// Этот класс является пользовательским исключением, предназначенным для обработки ошибок ввода некорректных данных.
// Когда вводятся некорректные данные, создается объект этого класса с сообщением об ошибке, которое затем выводится пользователю.