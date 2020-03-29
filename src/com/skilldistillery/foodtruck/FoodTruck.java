package com.skilldistillery.foodtruck;


public class FoodTruck {
	
	private String truckName;
	private String foodType;
	private double truckRating;
	private static int nextTruckId = 1; 
	private int uniqueTruckId;
	
	
	public FoodTruck(String truckName, String foodType, double truckRating) {
		
		this.truckName = truckName;
		this.foodType = foodType;
		this.truckRating = truckRating;
		this.uniqueTruckId = nextTruckId;
		FoodTruck.nextTruckId++;
		
	}
	

	public String getTruckName() {
		return truckName;
	}


	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}


	public String getFoodType() {
		return foodType;
	}


	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}                                                    //each trucks setters and getters
	                                               //with the toString of whole Data and display of each
	public double getTruckRating() {
		return truckRating;
	}


	public void setTruckRating(double truckRating) {
		this.truckRating = truckRating;
	}


	public static int getTruckId() {
		return nextTruckId;
	}


	public static void setTruckId(int truckId) {
		FoodTruck.nextTruckId = truckId;
	}


	
	public String toString() {
		return "FoodTruck [truck name:" + truckName + ", truck id:" + uniqueTruckId
				           + ", foodType:" + foodType + ", truckRating:" + truckRating + "]";
		
	}
	
	

}
