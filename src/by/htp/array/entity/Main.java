package by.htp.array.entity;



import java.util.InputMismatchException;
import java.util.Scanner;

import by.htp.array.ArrayMaxMin;
import by.htp.array.MyArray;


public class Main {

	public static void main(String[] args) {

		MyArray array = new by.htp.array.MyArray();

		System.out.println("Insert array elements:");

		int fromKeyboard;
		System.out.println("For add item to array write number");
		System.out.println("Otherwise write some symbol");
		try (Scanner inputValues = new Scanner(System.in)) {
			while (true) {
				fromKeyboard = inputValues.nextInt();
				array.addElement(fromKeyboard);
			}
		} catch (InputMismatchException e3) {
			System.out.println("End input");
		}

		array.print();

		ArrayMaxMin.maximum(array);
		ArrayMaxMin.minimum(array);

		array.sort(true);
		array.print();
		array.sort(false);
		array.print();
	}

}
