package task_2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создадим объект по которому будем проходиться
        List<Integer> list = List.of(1, 1, 2, 3, 5, 8, 13);
        // Сам цикл for each
        for (int i : list) {
            System.out.println(i);
        }
    }
}
