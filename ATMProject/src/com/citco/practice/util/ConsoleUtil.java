package com.citco.practice.util;

import java.util.Scanner;

public class ConsoleUtil {
	Scanner scan = new Scanner(System.in);
	
	public String readLine() {
		return scan.nextLine();
	}
	
	public int readInt() {
		return scan.nextInt();
	}

	public void close() {
		scan.close();
	}

	public void print(String str) {
		System.out.println(str);
	}

	public String toString(Object object) {
		return String.valueOf(object);
	}

	public Double parseDouble(String str) {
		return Double.parseDouble(str);
	}
}
