import org.junit.jupiter.api.DisplayName;
import  org.example.Main;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {

    @Test
    @DisplayName("Прямой позитивный кейс, вычислить факториал")
    public void testFactorialForPositiveNumber(){
        int result = Main.getFactorial(5);
        assertEquals(120, result);
    }
    @Test
    @DisplayName("Факториал 0 = 1")
    public void testFactorialForZero() {
        int result = Main.getFactorial(0);
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Нельзя посчитать факториал для отрицательного числа")
    void exceptionTesting() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Main.getFactorial(-2),
                "Expected getFactorial() to throw, but it didn't");
        assertEquals("Факториал можно вычислить только для неотрицательных чисел", exception.getMessage());
    }
}