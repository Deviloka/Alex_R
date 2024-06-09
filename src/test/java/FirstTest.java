import  org.example.Main;
import org.testng.annotations.Test;


import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.testng.Assert.assertEquals;

public class FirstTest {

    @Test
    public void testFactorialForPositiveNumber(){
        int result = Main.getFactorial(5);
        assertEquals(120, result);
    }
    @Test
    public void testFactorialForZero() {
        int result = Main.getFactorial(0);
        assertEquals(1, result);
    }

    @Test
    void testFactorialForNegativeNumber() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Main.getFactorial(-2),
                "Expected getFactorial() to throw, but it didn't");
        assertEquals("Факториал можно вычислить только для неотрицательных чисел", exception.getMessage());
    }
}