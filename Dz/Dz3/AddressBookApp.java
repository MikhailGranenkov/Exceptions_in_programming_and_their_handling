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
