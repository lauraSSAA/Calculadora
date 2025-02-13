package es.iescuravalera;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora(20,10);
    }

    @AfterEach
    void tearDown() {
        calculadora = null;
    }

    @org.junit.jupiter.api.Test
    void suma() {
        int resultado = calculadora.suma();
        int resultadoEsperado = 30;
        assertEquals( resultadoEsperado, resultado);
    }
    @Test
    void resta() {
        int resultado = calculadora.resta();
        int resultadoEsperado = 10;
        assertEquals( resultadoEsperado, resultado);
    }
    @Test
    void multiplica() {
        int resultado = calculadora.multiplica();
        int resultadoEsperado = 200;
        assertEquals( resultadoEsperado, resultado);
    }
    @Test
    void divide() {
        int resultado = calculadora.divide();
        int resultadoEsperado = 2;
        assertEquals( resultadoEsperado, resultado);
    }
    @Test
    void resta2() {
        boolean resultado = calculadora.resta2();
        assertTrue(resultado);
    }
    @Test
    void divide0() {
        Calculadora calculadora = new Calculadora(20,0);
        Assertions.assertThrows(ArithmeticException.class, () -> calculadora.divide0());
    }

    @ParameterizedTest
    @CsvSource({"20,10,2","30,-2,-15","40,4,10"})
    void divideParametros(int a, int b, int resultadoEsperado) {
        Calculadora calculadora1 = new Calculadora(a,b);
        int valorActual = calculadora1.divide();
        assertEquals(resultadoEsperado, valorActual);
    }
}