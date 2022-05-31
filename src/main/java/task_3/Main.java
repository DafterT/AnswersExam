package task_3;

public class Main {
    public static void main(String[] args) {
        // Создаю переменную для которой буду делать switch, генерю рандомно, но не обязательно
        int x = (int) (Math.random() * 3) + 1; // Число из [1;3]
        // Делаем сравнение для переменной x
        switch (x) {
            // Если переменная == 1
            case 1:
                System.out.println("Это 1... Наверное, есть такая вероятность");
                // Иначе он пойдет выводить все, что в кейсах ниже. Если не знаете, как это работает, попробуйте
                // удалить брейки и запустить код
                break;
            case 2:
                System.out.println("Прикиньте, это же 2");
                break;
            case 3:
                System.out.println("-Три! \n-Нет, сам три");
                break;
            default:
                System.out.println("Черт, что это такое?");
                break;
        }
    }
}
