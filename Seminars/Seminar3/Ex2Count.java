package Seminars.Seminar3;


// Создайте класс Счетчик, у которого есть метод add(), увеличивающий
// значение внутреннейint переменнойна1.Сделайтетак,чтобыс объектом
// такого типа можно былоработать вблокеtry-with-resources. Нужно бросить
// исключение,еслиработас объектомтипасчетчикбыланев ресурсномtry
// и/илиресурсосталсяоткрыт.Подумайтекакойтиписключенияподойдет
// лучшевсего.


import java.io.IOException;


public class Ex2Count {
    
    // Объявляем внутренний класс Count, который реализует интерфейс AutoCloseable
    class Count implements AutoCloseable {
        private Integer count;

        // Конструктор класса Count, инициализирующий поле count значением 0
        public Count() {
            this.count = 0;
        }

        // Метод для увеличения значения счетчика
        public void add() throws IOException {
            checkClose(); // Проверяем, не был ли объект закрыт
            this.count++;
        }

        // Метод для получения текущего значения счетчика
        public Integer getCount() throws IOException {
            checkClose(); // Проверяем, не был ли объект закрыт
            return count;
        }

        // Метод для проверки, был ли объект закрыт
        public void checkClose() throws IOException {
            if (this.count == null)
                throw new IOException("Экземпляр закрыт!"); // Если объект закрыт, бросаем исключение
        }

        // Метод close, реализованный из интерфейса AutoCloseable, который закрывает экземпляр класса,
        // присваивая полю count значение null
        @Override
        public void close() {
            this.count = null;
        }
    }
}

// Класс Count представляет собой счетчик с методами для увеличения значения счетчика (add), получения текущего значения счетчика (getCount) и проверки, был ли объект закрыт (checkClose). Класс Count также реализует интерфейс AutoCloseable, что позволяет использовать его в конструкции try-with-resources. Метод close класса Count используется для закрытия экземпляра класса, присваивая полю count значение null.