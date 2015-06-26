package matrix;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixTest {

	@Test
	public void test() {
		double expected = 450.0;
		double actual = Matrix.matrix(3);
		assertEquals(expected, actual, 450.0);
		expected = 24995833500000.0;
		actual = Matrix.matrix(100);
		assertEquals(expected, actual, 24995833500000.0);
		expected = 249999583333488000000.0;
		actual = Matrix.matrix(1000);
		assertEquals(expected, actual, 249999583333488000000.0);
	}
}
