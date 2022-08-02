package sortAndSearch;

import java.util.Arrays;

public class SortAndSearch {

	public static void main(String[] args) {

		// Initialize the array
		int[] numbers = { 27, -3, 4, 5, 35, 2, 1, -40, 7, 18, 9, -1, 16, 100 };
		// Display array in console 
		System.out.println(Arrays.toString(numbers));

		// Linear search would be the best because the data is not sorted
		// if the data was sorted a different search method could have been used.

		// Declare search number
		int searchNumber = 9;
		// Use method to determine the index position
		int index = linearSearch(searchNumber, numbers);

		// Display on console the search result
		if (index == -1) {
			System.out.println("The index of the number " + searchNumber + " is not found");
		} else {
			System.out.println("The index of the number " + searchNumber + " is " + index);
		}

		// Use the insertion sort method to sort the array
		sortInsertion(numbers);
		// Display array in console after sorting it
		System.out.println(Arrays.toString(numbers));

		// Binary search method haven't been tried yet, this will work because the array is sorted
		// Binary search could be used to see if someone a specific age did participate to a case study
		index = binarySearch(numbers, searchNumber);

		// Display on console the search result
		if (index == -1) {
			System.out.println("The index of the number " + searchNumber + " is not found");
		} else {
			System.out.println("The index of the number " + searchNumber + " is " + index);
		}

	}

	// Linear Search Method
	public static int linearSearch(int searchNumber, int[] numbers) {

		// If index is -1 at end of search, the item is not found
		int index = -1;

		// Loop through each of the elements in the array
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == searchNumber) {
				index = i;
				break;
			}
		}
		// Return the index position
		return index;
	}

	// Insertion sort method
	public static void sortInsertion(int[] numbers) {

		for (int i = 0; i < numbers.length; ++i) {
			int j = i;
			while (j > 0 && numbers[j - 1] > numbers[j]) {
				int key = numbers[j];
				numbers[j] = numbers[j - 1];
				numbers[j - 1] = key;
				j = j - 1;
			}
		}
	}

	//Binary Search method for array
	public static int binarySearch(int[] list, int item) {
		// If index is -1 at end of search, the item is not found
		int index = -1;
		
		// Set the starting and ending indexes of the array
		int low = 0;
		int high = list.length - 1;
		int mid;
		
		// Search for the item until we find it or until the low and high markers cross
		while (high >= low) {
			// calculate the midpoint of the current array
			mid = (high + low) / 2; 
			// If item in lower part of array
			if (item < list[mid]) {
				high = mid - 1;
			}
			//If item in higher part of array
			else if (item > list[mid]) {
				low = mid + 1;
			} 
			// If found, break out of loop
			else {
				index = mid;
				break;
			}
		}
		return index;
	}

}
