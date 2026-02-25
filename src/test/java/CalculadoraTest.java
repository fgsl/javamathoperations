import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void multiplicarDoisPorCinco() {
        Calculadora calculadora = new Calculadora();
        assertEquals(10, calculadora.multiplicar(2, 5));
    }
}