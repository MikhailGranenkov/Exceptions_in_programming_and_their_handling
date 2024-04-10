package Seminars.Seminar2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null; // Объявляем объект BufferedReader
        try{
            // Пытаемся открыть файл "1.txt" для чтения
            br = new BufferedReader(new FileReader("1.txt"));
        } catch (FileNotFoundException e){
            // Обрабатываем исключение, если файл не найден
            e.printStackTrace(); // Выводим сообщение об ошибке
        }
        
        List<String> ls = new ArrayList<>(); // Создаем список для хранения строк из файла
        
        try {
            // Читаем содержимое файла построчно
            String content = br.readLine(); // Читаем первую строку
            while (content != null) {
                ls.add(content); // Добавляем строку в список
                content = br.readLine(); // Читаем следующую строку
            }
            br.close(); // Закрываем поток чтения файла
        } catch (NullPointerException e){
            // Обрабатываем исключение, если объект BufferedReader равен null
            e.printStackTrace(); // Выводим сообщение об ошибке
        }
        
        HashMap<String, Integer> map = new HashMap<>(); // Создаем хэш-отображение для хранения данных
        
        // Проходим по списку строк и обрабатываем каждую строку
        for (String i: ls){
            // Разделяем строку на части по символу "="
            String[] parts = i.split("=");
            if (parts.length != 2)
                // Если количество частей не равно 2, выбрасываем исключение IllegalArgumentException
                throw new IllegalArgumentException("Неверное количество аргументов!");
            String name = parts[0]; // Получаем имя
            map.put(name, name.length()); // Добавляем пару ключ-значение в хэш-отображение
        }
        
        // Открываем файл "1.txt" для записи
        FileWriter file = new FileWriter("1.txt");
        StringBuilder out = new StringBuilder(); // Создаем объект StringBuilder для построения строки
        
        // Формируем строку для записи в файл на основе данных из хэш-отображения
        for (String key: map.keySet()){
            out.append(key).append("=").append(map.get(key)).append("\n");
        }
        
        // Записываем строку в файл
        file.write(String.valueOf(out));
        file.close(); // Закрываем поток записи файла
    }
}

// Основные моменты:

// Чтение файла: Создается объект BufferedReader для чтения данных из файла "1.txt". Если файл не найден, выбрасывается исключение FileNotFoundException.
// Чтение содержимого файла: Содержимое файла читается построчно с помощью метода readLine(). Каждая прочитанная строка добавляется в список ls. После чтения всех строк файл закрывается.
// Обработка исключений при чтении файла: Если возникает NullPointerException, это означает, что объект BufferedReader не был инициализирован, что может произойти, если файл не найден. В этом случае выводится сообщение об ошибке.
// Обработка содержимого файла: Каждая строка разбивается на части с помощью метода split("="). Если количество частей не равно 2, выбрасывается исключение IllegalArgumentException.
// Запись в файл: Данные из хэш-отображения записываются в файл "1.txt". Для этого создается объект FileWriter, в который записывается строка с помощью метода write(). После записи файла поток записи закрывается.