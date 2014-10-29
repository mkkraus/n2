package harjutustund3;

import org.junit.*;
import static org.junit.Assert.*;

public class AnswerTest {

	/** test data */
	public static double a, b, c, x, y;

	@Test(timeout = 1000)
	public void test1() {
		a = 6.;
		b = 8.;
		c = 10.;
		x = 7.;
		y = 9.;
		assertTrue("Input: a=" + a + " b=" + b + " c=" + c + " x=" + x + " y="
				+ y + " expected:<true>", Answer.mahub(a, b, c, x, y));
		a = 6.;
		b = 8.;
		c = 10.;
		x = 5.;
		y = 7.;
		assertFalse("Input: a=" + a + " b=" + b + " c=" + c + " x=" + x + " y="
				+ y + " expected:<false>", Answer.mahub(a, b, c, x, y));
	} // test1

	@Test(timeout = 1000)
	public void test2() {
		a = 1.;
		b = 10.;
		c = 15.;
		x = 2.;
		y = 10.;
		assertTrue("Input: a=" + a + " b=" + b + " c=" + c + " x=" + x + " y="
				+ y + " expected:<true>", Answer.mahub(a, b, c, x, y));
		a = 10.;
		b = 15.;
		c = 1.;
		x = 2.;
		y = 10.;
		assertTrue("Input: a=" + a + " b=" + b + " c=" + c + " x=" + x + " y="
				+ y + " expected:<true>", Answer.mahub(a, b, c, x, y));
		a = 15.;
		b = 1.;
		c = 10.;
		x = 2.;
		y = 10.;
		assertTrue("Input: a=" + a + " b=" + b + " c=" + c + " x=" + x + " y="
				+ y + " expected:<true>", Answer.mahub(a, b, c, x, y));
		a = 1.;
		b = 15.;
		c = 10.;
		x = 2.;
		y = 10.;
		assertTrue("Input: a=" + a + " b=" + b + " c=" + c + " x=" + x + " y="
				+ y + " expected:<true>", Answer.mahub(a, b, c, x, y));
		a = 15.;
		b = 10.;
		c = 1.;
		x = 2.;
		y = 10.;
		assertTrue("Input: a=" + a + " b=" + b + " c=" + c + " x=" + x + " y="
				+ y + " expected:<true>", Answer.mahub(a, b, c, x, y));
		a = 10.;
		b = 1.;
		c = 15.;
		x = 2.;
		y = 10.;
		assertTrue("Input: a=" + a + " b=" + b + " c=" + c + " x=" + x + " y="
				+ y + " expected:<true>", Answer.mahub(a, b, c, x, y));
		a = 1.;
		b = 10.;
		c = 15.;
		x = 10.;
		y = 2.;
		assertTrue("Input: a=" + a + " b=" + b + " c=" + c + " x=" + x + " y="
				+ y + " expected:<true>", Answer.mahub(a, b, c, x, y));
		a = 10.;
		b = 15.;
		c = 1.;
		x = 10.;
		y = 2.;
		assertTrue("Input: a=" + a + " b=" + b + " c=" + c + " x=" + x + " y="
				+ y + " expected:<true>", Answer.mahub(a, b, c, x, y));
		a = 15.;
		b = 1.;
		c = 10.;
		x = 10.;
		y = 2.;
		assertTrue("Input: a=" + a + " b=" + b + " c=" + c + " x=" + x + " y="
				+ y + " expected:<true>", Answer.mahub(a, b, c, x, y));
		a = 1.;
		b = 15.;
		c = 10.;
		x = 10.;
		y = 2.;
		assertTrue("Input: a=" + a + " b=" + b + " c=" + c + " x=" + x + " y="
				+ y + " expected:<true>", Answer.mahub(a, b, c, x, y));
		a = 15.;
		b = 10.;
		c = 1.;
		x = 10.;
		y = 2.;
		assertTrue("Input: a=" + a + " b=" + b + " c=" + c + " x=" + x + " y="
				+ y + " expected:<true>", Answer.mahub(a, b, c, x, y));
		a = 10.;
		b = 1.;
		c = 15.;
		x = 10.;
		y = 2.;
		assertTrue("Input: a=" + a + " b=" + b + " c=" + c + " x=" + x + " y="
				+ y + " expected:<true>", Answer.mahub(a, b, c, x, y));
		a = 3.;
		b = 4.;
		c = 5.;
		x = 2.;
		y = 4.;
		assertFalse("Input: a=" + a + " b=" + b + " c=" + c + " x=" + x + " y="
				+ y + " expected:<false>", Answer.mahub(a, b, c, x, y));
	} // test2

	@Test(timeout = 1000)
	public void test3() {
		a = 5.;
		b = 4.;
		c = 3.;
		x = 3.;
		y = 4.;
		assertTrue("Input: a=" + a + " b=" + b + " c=" + c + " x=" + x + " y="
				+ y + " expected:<true>", Answer.mahub(a, b, c, x, y));
		a = 1.;
		b = 10.;
		c = 12.;
		x = 7.;
		y = 7.;
		assertFalse("Input: a=" + a + " b=" + b + " c=" + c + " x=" + x + " y="
				+ y + " expected:<false>", Answer.mahub(a, b, c, x, y));
	} // test3

} // AnswerTest

