package com.poo;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		//Ask for a number and multiply by two
		exampleImperative();
		exampleStructured();
		exampleOop();
	}

	/**
	 * * Imperative programming **
	 * - Give step by step
	 */
	private static void exampleImperative() {

		System.out.println("Give me a number:");

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		int result = num * 2;

		System.out.println("Result: " + result);
	}

	/**
	 * * Structured programming **
	 * - Split code
	 * - Organize code
	 * - Reuse code
	 */
	private static void exampleStructured() {

		print("Give me a number:");

		int num = readNumber();

		int result = multiply(num, 2);

		print("Result: " + result);

	}

	/**
	 * * Object oriented programming **
	 * - Grouping functions depending the responsibility
	 * - Reuse code
	 */
	private static void exampleOop() {

		Channel channel = new Channel();
		Multiplier multiplier = new Multiplier(2);

		int num = channel.readNumber("Give me a number");
		channel.print("Result: " + multiplier.multiply(num));

		num = channel.readNumber("Give me another number");
		channel.print("Result: " + multiplier.multiply(num));

	}

	private static class Multiplier {

		private int factor;

		public Multiplier(int factor) {

			this.factor = factor;
		}

		public int multiply(int number) {

			return number * factor;
		}

	}

	private static class Channel {

		private int readNumberScanner() {

			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			return num;
		}

		public void print(String text) {

			System.out.println(text);
		}

		public int readNumber(String text) {

			print(text);
			return readNumberScanner();
		}
	}

	private static int multiply(int num, int factor) {

		return num * factor;
	}

	private static int readNumber() {

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		return num;
	}

	private static void print(String text) {

		System.out.println(text);
	}
}
