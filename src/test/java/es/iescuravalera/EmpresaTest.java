package es.iescuravalera;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {
    Empresa empresa ;

    @BeforeEach
    void setUp() {
        empresa = new Empresa();
    }

    @AfterEach
    void tearDown() {
        empresa = null;
    }

    @ParameterizedTest
    @CsvSource({"0,false","68,false","10,false","54,true","57,false"})
    void activo(int edad, boolean salidaEsperada) {
        boolean resultado = empresa.activo(edad);
        assertEquals(resultado, salidaEsperada);
    }
}