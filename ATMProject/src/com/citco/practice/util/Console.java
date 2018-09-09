package com.citco.practice.util;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

public enum Console implements Closeable {
	out;
	
	private Scanner scanner = new Scanner(System.in);
	
	public void print(String str) {
		System.out.print(str);
	}
	
	public String read() {
		return this.scanner.nextLine();
	}

	@Override
	public void close() throws IOException {
		this.scanner.close();
	}
}