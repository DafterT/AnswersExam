package task_7;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        lists();
        example();
        // TODO сделать еще примеров
    }

    // Пример лямбды с листами
    public static void lists() {
        System.out.println("===========List test===========");
        List<Integer> list = List.of(2, 3, 5, 7, 11, 13, 17);
        System.out.print("Elements in list: ");
        // Пройтись по всем элементам массива, используя лямбду
        list.forEach(it -> System.out.print(it + " "));
        System.out.print("\nElements more 7: ");
        // Фильтр, чтоб остались элементы > 7
        System.out.println(list.stream().filter(it -> it > 7).collect(Collectors.toList()));
        System.out.print("Multiply by 2: ");
        // Увеличить все элементы в 2 раза
        System.out.println(list.stream().map(it -> it * 2).collect(Collectors.toList()));
    }

    // Пример с функциональным интерфейсом
    public static void example() {
        System.out.println("===========Example test===========");
        // Можно написать таким образом, без лямбды
        PrintConsole print1 = new PrintConsole() {
            @Override
            public void print() {
                System.out.println("How are you");
            }
        };
        // Однако можно сократить, использовав только лямбду т.к. это функциональный интерфейс
        PrintConsole print2 = () -> System.out.println("How are you");
        // 2 раза выведет "How are you"
        print1.print();
        print2.print();
    }

    // Наш собственный функциональный интерфейс
    interface PrintConsole {
        // Остается функциональным, хоть метода и 2, т.к. этот метод статический
        static void printHi() {
            System.out.println("Hi");
        }

        void print();
    }
}
