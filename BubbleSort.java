package bubbleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

	// Declare the ArrayList
	static List<String> list = new ArrayList<>();

	public static void main(String[] args) {

		// Add the items to the ArrayList
		list.addAll(
				Arrays.asList("blue", "six", "hello", "game", "unorthodox", "referee", "ask", "zebra", "run", "flex"));
		// Print the current list
		System.out.println(list);

		// Do a Bubble Sort on the arrayList
		bubbleSort(list);
		// Print the ArrayList after it is sorted
		System.out.println(list);
	}

	// Method to bubble sort the List Array
	public static void bubbleSort(List<String> list2) {

		// Convert the ArrayList to an Array
		String[] input = new String[list2.size()];
		for (int i = 0; i < list2.size(); i++) {
			input[i] = list2.get(i);
		}

		// Clear the value of list by equaling it to a new ArrayList
		list = new ArrayList<>();
		// Have a temp String value to hold the value when swap around Strings
		String temp;

		// Bubble sort the array
		for (int i = (input.length - 1); i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				// First string and 2nd string to compare
				String first = input[i];
				String sec = input[j - 1];
				// If 0 or negative then stay in the same position, if positive (1) then swap
				// positions
				if (first.compareTo(sec) > 0) {
					temp = input[j - 1];
					input[j - 1] = input[i];
					input[i] = temp;
				}
			}
			// Add the input to the ArrayList
			list.add(input[i]);
		}

	}

}
