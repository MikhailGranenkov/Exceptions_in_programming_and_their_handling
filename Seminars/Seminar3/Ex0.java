package Seminars.Seminar3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;

public class Ex0 {
    // Метод для чтения строки из одного файла и записи ее в другой файл
    public void rwLine(Path pathRead, Path pathWrite) throws IOException{
        try (
            // Открываем файл для чтения и создаем BufferedReader для эффективного чтения
            BufferedReader in = new BufferedReader(pathRead);
            // Открываем файл для записи и создаем BufferedWriter для эффективной записи
            BufferedWriter out = new BufferedWriter(pathWrite)
        ) {
            // Читаем строку из файла и записываем ее в другой файл
            out.write(in.readLine());
        } catch (IOException e) {
            // Обработка возможных ошибок, например, если файл не найден или произошла ошибка ввода-вывода
            System.out.println("Произошла ошибка при работе с файлом.");
        }
    } 
}

// Этот код открывает файлы для чтения и записи, читает строку из одного файла и записывает ее в другой файл, используя BufferedReader и BufferedWriter. В случае ошибки выводится сообщение об ошибке.