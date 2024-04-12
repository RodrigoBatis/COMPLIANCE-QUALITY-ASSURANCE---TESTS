import org.br.calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void init(){
        this.calculadora = new Calculadora();
    }

    @ParameterizedTest
    @CsvSource({"1,1,2", "2,2,4", "3,3,6", "4,4,8"})
    @DisplayName("Teste FIAP SOMA")
    public void testSomar(int a, int b, int resultadoEsperado){

        int resultado = calculadora.somar(a,b);
        assertEquals(resultadoEsperado, resultado);

    }

    @ParameterizedTest
    @CsvSource({"1,1,0", "4,2,2", "7,3,4", "12,4,8"})
    @DisplayName("Teste FIAP SUBITRAIR")
    public void testSubitracao(int a, int b, int resultadoEsperado){

        int resultado = calculadora.subtrair(a,b);
        assertEquals(resultadoEsperado, resultado);

    }
    @ParameterizedTest
    @CsvSource({"1,1,1", "10,10,100", "3,3,9", "4,4,16"})
    @DisplayName("Teste FIAP MULTIPLICAÇÃO")
    public void testMultiplicacao(int a, int b, int resultadoEsperado){

        int resultado = calculadora.multiplicar(a,b);
        assertEquals(resultadoEsperado, resultado);

    }

    @ParameterizedTest
    @CsvSource({"10,2,5", "20,4,5", "12,3,4", "100,4,25"})
    @DisplayName("Teste FIAP DIVISÃO")
    public void testDivisao(int a, int b, double resultadoEsperado){

        double resultado = calculadora.dividir(a,b);
        assertEquals(resultadoEsperado, resultado);

    }

}
