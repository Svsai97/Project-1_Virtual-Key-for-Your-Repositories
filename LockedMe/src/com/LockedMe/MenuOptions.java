package com.LockedMe;

public class MenuOptions {

	public static void printWelcomeScreen(String appName, String developerName) {
		String companyDetails = String.format("*****************************************************\n"
				+ "** Welcome to %s.com. \n" + "** This application was developed by %s.\n"
				+ "*****************************************************\n", appName, developerName);
		String appFunction = "You can use this application to :-\n"
				+ "� Retrieve all file names in the \"main\" folder\n"
				+ "� Search, add, or delete files in \"main\" folder.\n"
				+ "\n**Please be careful to ensure the correct filename is provided for searching or deleting files.**\n";
		System.out.println(companyDetails);

		System.out.println(appFunction);
	}

	public static void displayMenu() {
		String menu = "LockedMe\n" + "SADHU VENKATA SAI KUMAR\n\n" + "** Select Any One Of The Options Given Below **"
				+ "\n\n" + "1) Retrieve All Files Inside \"main\" Folder\n" + "2) Display Menu For File Operations\n"
				+ "3) Exit Program\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Add a file to \"main\" folder\n" + "2) Delete a file from \"main\" folder\n"
				+ "3) Search for a file from \"main\" folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

		System.out.println(fileMenu);
	}

	public static void printWelcomeScreen(String string) {

	}

}
