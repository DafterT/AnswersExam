package task_4;

public class Main {
    public static void main(String[] args) {
        try {
            // Не стал сильно запариваться, просто буду кидать ошибку и сам её ловить
            throw new IllegalArgumentException("Error");
        } catch (IllegalArgumentException e) {
            System.out.println("Я поймал " + e.getMessage());
        }
    }
}
