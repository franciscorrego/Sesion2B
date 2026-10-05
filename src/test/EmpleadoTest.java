package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado;
import pkg.TipoEmpleado;

class EmpleadoTest {
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
    void testCalculoNominaBruta_VendedorBase() {
        assertEquals(2000.0f, Empleado.calculoNominaBruta(TipoEmpleado.VENDEDOR, 0.0f, 0.0f));
    }

    @Test
    void testCalculoNominaBruta_EncargadoBase() {
        assertEquals(2500.0f, Empleado.calculoNominaBruta(TipoEmpleado.ENCARGADO, 0.0f, 0.0f));
    }

    @Test
    void testCalculoNominaBruta_Ventas999() {
        assertEquals(2000.0f, Empleado.calculoNominaBruta(TipoEmpleado.VENDEDOR, 999.0f, 0.0f));
    }

    @Test
    void testCalculoNominaBruta_Ventas1000() {
        assertEquals(2100.0f, Empleado.calculoNominaBruta(TipoEmpleado.VENDEDOR, 1000.0f, 0.0f));
    }

    @Test
    void testCalculoNominaBruta_Ventas1499() {
        assertEquals(2100.0f, Empleado.calculoNominaBruta(TipoEmpleado.VENDEDOR, 1499.0f, 0.0f));
    }

    @Test
    void testCalculoNominaBruta_Ventas1500() {
        assertEquals(2200.0f, Empleado.calculoNominaBruta(TipoEmpleado.VENDEDOR, 1500.0f, 0.0f));
    }

    @Test
    void testCalculoNominaBruta_HorasExtra1() {
        assertEquals(2030.0f, Empleado.calculoNominaBruta(TipoEmpleado.VENDEDOR, 0.0f, 1.0f));
    }

    @Test
    void testCalculoNominaBruta_TipoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            Empleado.calculoNominaBruta(TipoEmpleado.OTRO, 0.0f, 0.0f);
        });
    }

    @Test
    void testCalculoNominaNeta_NominaCero() {
        assertEquals(0.0f, Empleado.calculoNominaNeta(0.0f));
    }

    @Test
    void testCalculoNominaNeta_Nomina2099() {
        assertEquals(2099.0f, Empleado.calculoNominaNeta(2099.0f));
    }

    @Test
    void testCalculoNominaNeta_Nomina2100() {
        assertEquals(1785.0f, Empleado.calculoNominaNeta(2100.0f));
    }

    @Test
    void testCalculoNominaNeta_Nomina2499() {
    	assertEquals(2124.15f, Empleado.calculoNominaNeta(2499.0f));    
    }

    @Test
    void testCalculoNominaNeta_Nomina2500() {
        assertEquals(2050.0f, Empleado.calculoNominaNeta(2500.0f));
    }

}
