package task_5;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class TestTask5 {

    @Test
    void Exceptions() {
        // Тест ошибки NullPointerException
        assertThrows(NullPointerException.class, Main::nullPointerException);
        // Тест ошибки IndexOutOfBoundsException
        assertThrows(IndexOutOfBoundsException.class, Main::indexOutOfBoundsException);
        // Тест ошибки IOException
        assertThrows(IOException.class, Main::iOException);
    }
}