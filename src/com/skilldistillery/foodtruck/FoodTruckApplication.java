package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApplication {
	Scanner sc = new Scanner(System.in);

	int numTrucks;
	int maxTrucks = 5;
	FoodTruck[] allTrucks = new FoodTruck[maxTrucks];

	public static void main(String[] args) {

		System.out.println("Welcome to the Food Truck App. Please fill in all the data for each truck. ");
		System.out.println("Data for up to five trucks can be entered.");
		FoodTruckApplication fleet = new FoodTruckApplication();

		fleet.createTruck();

	}

	public void createTruck() {
		for (numTrucks = 0; numTrucks < allTrucks.length; numTrucks++) {
			System.out.println("Enter truck name to fill in the data or quit to continue with the program: ");
			String truckName = sc.nextLine();
			
			if (!truckName.equalsIgnoreCase("quit")) {
				
				System.out.println("Food type: ");
				String foodType = sc.next();

				System.out.println("Truck rating on the scale of 1-5: ");
				double truckRating = sc.nextDouble();
				sc.nextLine();

				FoodTruck truckByUser = new FoodTruck(truckName, foodType, truckRating);

				allTrucks[numTrucks] = truckByUser;
	     }
			
			else {
				break;
			}

		}
	
		optionMenu();
	}

	public void optionMenu() {
		System.out.println("Choose 1-4 from the Menu: ");
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program. \n");
		String userChoice = sc.next();
		while (!userChoice.equals("4")) {

			if (userChoice.equals("1")) {
				displayTrucks();
				optionMenu();
			}
			if (userChoice.equals("2")) {
				averageRating();
				optionMenu();
			}
			if (userChoice.equals("3")) {
				highestRated ();
				optionMenu();
			}

		}
		System.out.println("Come again soon!");
		System.exit(0);
		
	
	}
	public void averageRating() {
		double average = 0;
		double sum = 0;
		int i;
		for (i = 0; i < allTrucks.length; i++) {
			if (allTrucks[i] != null ) {
				sum = sum + allTrucks[i].getTruckRating();
		} 
			else {
				break;
			}
	}
		average = sum/i;
		System.out.println("The average rating of food trucks entered is: " + average);
	}
	
	
	public void highestRated () {
		double max = allTrucks[0].getTruckRating();
		int i;
		FoodTruck compare = allTrucks[0];
		for (i = 0; i < allTrucks.length; i++) {
			if (allTrucks[i] != null && max < allTrucks[i].getTruckRating()) {
				max = allTrucks[i].getTruckRating();
				compare = allTrucks[i];
			}
		}
		System.out.println("The highest rated food truck entered is: " + compare.toString());
	}


	public void displayTrucks() {
		for (FoodTruck truck : allTrucks)
			if (truck != null)
				System.out.println(truck.toString());
	}

}
