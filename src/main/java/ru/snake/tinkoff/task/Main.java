package ru.snake.tinkoff.task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println(calculateDeposit(scanner.nextInt()));
		}
	}

	private static final int DAYS_PER_WEEK = 7; // Full week

	private static final int WEEK_SUM_FIRST = 28; // 1 + 2 + 3 + 4 + 5 + 6 + 7

	private static final int WEEK_SUM_INCREMENT = 7; // One for every day

	/**
	 * Calculate sum using sum of arithmetic progression formula.
	 *
	 * @param days
	 *            N days
	 * @return required sum
	 */
	public static int calculateDeposit(int days) {
		int fullWeeks = days / DAYS_PER_WEEK;
		int weeksSum = fullWeeks * (WEEK_SUM_FIRST + WEEK_SUM_FIRST + WEEK_SUM_INCREMENT * (fullWeeks - 1)) / 2;

		int daysRemain = days % DAYS_PER_WEEK;
		int movingSum = daysRemain * ((fullWeeks + 1) + (fullWeeks + daysRemain)) / 2;

		return movingSum + weeksSum;
	}

	/**
	 * Slow brute force solution to validate all cases.
	 *
	 * @param days
	 *            N days
	 * @return required sum
	 */
	public static int calculateDepositBF(int days) {
		int sum = 0;
		int mondaySum = 0;
		int daySum = mondaySum;

		for (int day = 0; day < days; day += 1) {
			if (day % 7 == 0) {
				mondaySum += 1;
				daySum = mondaySum;
			}

			sum = sum + daySum;
			daySum += 1;
		}

		return sum;
	}

}
