package newpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilidadTest {

	Utilidad objeto = new Utilidad();

	@Test
	public void test1() {
		int a = 0;
		int resultadoesperado = 0;
		int resultadoverdad = a + objeto.factorial(a);
		assertEquals(resultadoverdad, resultadoesperado);

	}

	@Test
	public void test2() {
		int a = 2;
		int resultadoesperado = 4;
		int resultadoverdad = a + objeto.factorial(a);
		assertEquals(resultadoverdad, resultadoesperado);

	}

	@Test
	public void test3() {
		int a = 3;
		int resultadoesperado = 9;
		int resultadoverdad = a + objeto.factorial(a);
		assertEquals(resultadoverdad, resultadoesperado);

	}

	@Test
	public void test4() {
		int a = 4;
		int resultadoesperado = 28;
		int resultadoverdad = a + objeto.factorial(a);
		assertEquals(resultadoverdad, resultadoesperado);

	}

	@Test
	public void test5() {
		int a = 5;
		int resultadoesperado = 125;
		int resultadoverdad = a + objeto.factorial(a);
		assertEquals(resultadoverdad, resultadoesperado);

	}

}
