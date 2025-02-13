package es.iescuravalera;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1Test {
    static Ejercicio1 ejercicio1;

    @BeforeAll
    static void setUpOnce() {
        ejercicio1 = new Ejercicio1();
    }

    @BeforeEach
    void setUp() {
    }
    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @CsvSource({"5,3,1","3,5,-1","3,3,0"})
    void comparar(int a, int b, int esperado) {
        int actual = ejercicio1.comparar(a, b);
        assertEquals(esperado, actual);
    }
}