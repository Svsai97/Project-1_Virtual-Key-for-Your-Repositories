package com.LockedMe;

public class Main {

	public static void main(String[] args) {

		FileOperations.createMainFolderIfNotPresent("main");

		MenuOptions.printWelcomeScreen("LockedMe" + "\n" + "SADHU VENKATA SAI KUMAR");

		HandleOptions.handleWelcomeScreenInput();
	}

}
