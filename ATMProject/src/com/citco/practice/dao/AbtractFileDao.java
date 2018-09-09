package com.citco.practice.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.citco.practice.util.ConsoleUtil;

public abstract class AbtractFileDao {
	abstract String getLocation();

	protected void appendTextToFile(String str) throws IOException {
		FileWriter fileWriter = new FileWriter(getLocation(),true);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.println(str);
		fileWriter.close();
	}
	
	protected void updateBalance(double balance) throws IOException {
		FileWriter fileWriter = new FileWriter(getLocation(),true);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.println(balance);
		fileWriter.close();
	}
	
	protected double readLastBalance(IFileReaderCallback callback) throws FileNotFoundException {
		File file = new File(getLocation());
		if(file.exists()) {
			Scanner scan = new Scanner(file);
			String lastBalance = null;
			ConsoleUtil consoleUtil = new ConsoleUtil();
			
			while(scan.hasNextLine()) {
				lastBalance = callback.onLineRead(scan.nextLine() + "\n");
			}
			scan.close();
			return consoleUtil.parseDouble(lastBalance);	
		}else {
			return 0.00;
		}
			
	}
}

