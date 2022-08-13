package com.greatlearning.question1.service;

import java.util.PriorityQueue;

public class FloorBuildingService {
	
	public void printConstructionTable(int floor[],int no_Of_Floor) {
		
		System.out.println("The order of construction is as follows");
		
		
		PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());

		int[] tempArray = new int[no_Of_Floor];

		int max = no_Of_Floor;

		System.out.println();
		for (int i = 0; i < no_Of_Floor; i++) {

			System.out.println("Day: "+(i+1));
			
			
			tempArray[i] = floor[i];

			queue.add(tempArray[i]);


			while (!queue.isEmpty() && queue.peek() == max) {

				System.out.print(queue.poll() + " ");

				max--;

			}

			System.out.println();

		}
	}

}
