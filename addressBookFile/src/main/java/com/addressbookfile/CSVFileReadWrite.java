package com.addressbookfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CSVFileReadWrite {


	/*
	 * created method to to read csv file
	 */
	public static void readCSVfileUsingScanner(String filePath) {
		/*
		 * try catch block to check file exists or not
		 */
		try {
			/*
			 * Scanning the file path
			 */
			Scanner sc = new Scanner(new File(filePath));

			/*
			 * creating a loop to pop out every string values
			 */
			while (sc.hasNext()) {
				System.out.println("User data  :" + sc.next().toString());
			}
			sc.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	/*
	 * created method to write in csv file
	 */
	public static void writeCSVfileUsingScanner() {
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\Users\\HP\\Desktop\\day27.txt");

		/*
		 * try catch block to check file exists or not
		 */
		try {
			/*
			 * creation object of file writer
			 */
			FileWriter fileWriter = new FileWriter(file);

			/*
			 * creating object of print writer
			 */
			PrintWriter printWriter = new PrintWriter(fileWriter);

			System.out.println("Enter the First name :");
			String firstName = sc.nextLine();
			System.out.println("Enter the Last name :");
			String lastName = sc.nextLine();
			System.out.println("Enter the Address :");
			String address = sc.nextLine();
			System.out.println("Enter the city :");
			String city = sc.nextLine();
			System.out.println("Enter the state :");
			String state = sc.nextLine();
			System.out.println("Enter the zipCode :");
			String zip = sc.nextLine();
			System.out.println("Enter the phoneNumber :");
			String phone = sc.nextLine();
			System.out.println("Enter the emailID :");
			String email = sc.nextLine();

			printWriter.print(firstName);
			printWriter.print(",");
			printWriter.print(lastName);
			printWriter.print(",");
			printWriter.print(address);
			printWriter.print(",");
			printWriter.print(city);
			printWriter.print(",");
			printWriter.print(state);
			printWriter.print(",");
			printWriter.print(zip);
			printWriter.print(phone);
			printWriter.print(",");
			printWriter.print(email);

			printWriter.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
		sc.close();
	}

	public static void main(String[] args) {

		
		while (true) {
			System.out.println("Enter \n 1. Read csv file \n"
									 + " 2.Write csv file \n"
									 + " 0.exit");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {

			/*
			 * calling Method to read and write
			 */
			case 1:
				readCSVfileUsingScanner("C:\\Users\\HP\\Desktop\\day27.txt");

				break;
			case 2:
				writeCSVfileUsingScanner();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Enter the wrong input");
			}
			sc.close();
		}

	}
}
