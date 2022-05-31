package task_1;

import java.util.Objects;

// Просто какой-то класс
class SomeClass {
    // Поле 1 (сделал final т.к. я его не редачу, можно и не делать)
    private final int someInt;
    // Поле 2 (сделал final т.к. я его не редачу, можно и не делать)
    private final String someString;

    // Конструктор (пустой)
    public SomeClass() {
        someInt = 0;
        someString = "";
    }

    // Конструктор (с параметрами)
    public SomeClass(int someInt, String someString) {
        this.someString = someString;
        this.someInt = someInt;
    }

    // Просто какой-то метод. Я сделал вывод в консоль просто, как вариант
    public void print() {
        System.out.println(this);
    }

    // Метод equals
    @Override
    public boolean equals(Object o) {
        // Проверка, что ссылки у объектов одинаковые, тогда очевидно, что объекты одинаковые
        if (this == o) return true;
        // Проверка, что сравнение не с null и классы у объектов одинаковые
        if (o == null || getClass() != o.getClass()) return false;
        // Преобразование из Object в наш класс
        SomeClass someClass = (SomeClass) o;
        // Проверка на одинаковость переменных
        return someInt == someClass.someInt && Objects.equals(someString, someClass.someString);
    }

    // Метод hashCode
    @Override
    public int hashCode() {
        // Просто закидываем все в Object.hash и получаем хеш
        return Objects.hash(someInt, someString);
    }

    // Метод toString
    @Override
    public String toString() {
        // Автоматом сгенеренная строка, вы можете свой формат написать
        return "SomeClass{" + "someInt=" + someInt + ", someString='" + someString + '\'' + '}';
    }
}

// Класс для примера использования
public class Main {
    public static void main(String[] args) {
        // Использовали пустой конструктор
        SomeClass someClass_1 = new SomeClass();
        // Использовали не пустой конструктор
        SomeClass someClass_2 = new SomeClass(154, "Hello world");

        // Вызываем метод первого объекта
        someClass_1.print();
        // Вызываем метод второго объекта
        someClass_2.print();
    }
}