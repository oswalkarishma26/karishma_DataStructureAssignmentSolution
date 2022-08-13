package com.greatlearning.question1.driver;

import java.util.Scanner;

import com.greatlearning.question1.service.FloorBuildingService;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the total no of floors in the building");
		
		int no_Of_Floor = sc.nextInt();

	    int[] floors = new int[no_Of_Floor];
		
	   
		for(int i=0; i<no_Of_Floor; i++)  
		{  
		System.out.println("enter the floor size given on day : "+(i+1));
		floors[i] = sc.nextInt(); 
		}  
		System.out.println();
		
		FloorBuildingService service = new FloorBuildingService();
		service.printConstructionTable(floors, no_Of_Floor);
	}

}
