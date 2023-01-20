package ru.snake.tinkoff.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

	@Test
	public void testBFDays() {
		Assertions.assertEquals(1, Main.calculateDepositBF(1));
		Assertions.assertEquals(1 + 2, Main.calculateDepositBF(2));
		Assertions.assertEquals(1 + 2 + 3, Main.calculateDepositBF(3));
		Assertions.assertEquals(1 + 2 + 3 + 4, Main.calculateDepositBF(4));
		Assertions.assertEquals(1 + 2 + 3 + 4 + 5, Main.calculateDepositBF(5));
		Assertions.assertEquals(1 + 2 + 3 + 4 + 5 + 6, Main.calculateDepositBF(6));
		Assertions.assertEquals((1 + 2 + 3 + 4 + 5 + 6 + 7), Main.calculateDepositBF(7));
		Assertions.assertEquals((1 + 2 + 3 + 4 + 5 + 6 + 7) + (2), Main.calculateDepositBF(8));
		Assertions.assertEquals((1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3), Main.calculateDepositBF(9));
		Assertions.assertEquals((1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4), Main.calculateDepositBF(10));
	}

	@Test
	public void test1Days() {
		Assertions.assertEquals(1, Main.calculateDeposit(1));
	}

	@Test
	public void test6Days() {
		Assertions.assertEquals(21, Main.calculateDeposit(6));
	}

	@Test
	public void test10Days() {
		Assertions.assertEquals(37, Main.calculateDeposit(10));
	}

	@Test
	public void test1000Days() {
		Assertions.assertEquals(74926, Main.calculateDeposit(1000));
	}

	@Test
	public void testAllDays() {
		for (int day = 1; day <= 1_000; day += 1) {
			int expectedSum = Main.calculateDepositBF(day);
			int actualSum = Main.calculateDeposit(day);

			Assertions.assertEquals(expectedSum, actualSum);
		}
	}

}
