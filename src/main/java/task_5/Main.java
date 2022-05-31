package task_5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    // Метод будет выкидывать NullPointerException, сделал статик, чтоб не создавать экземпляр в тестах
    public static void nullPointerException() {
        // Создаем переменную, записывая туда null
        String string = null;
        // Вызываем метод у объекта, которого нет
        string.length();
    }

    // Метод будет выкидывать ArrayIndexOutOfBoundsException, что является "наследником" от IndexOutOfBoundsException (это видно из тестов)
    public static void indexOutOfBoundsException() {
        // Создаем массив с 3 элементами
        int[] array = {1, 2, 3};
        // Пытаемся получить тот элемент, которого нет
        System.out.println(array[3]);
    }

    // Метод будет кидать FileNotFoundException, что является "наследником" от IOException
    // На самом деле IOException имеет множество "наследников" и является классом ошибки ввода-вывод
    // Подробнее читайте тут: https://docs.oracle.com/javase/8/docs/api/java/io/IOException.html
    public static void iOException() throws FileNotFoundException {
        // Пытаемся создать ридер файла, которого нет
        new FileReader("text.txt");
    }
}
