package arrayLists;
// import all the required packages
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Album {

	// Data fields for Album
	String albumName;
	int numberOfSongs;
	String albumArtist;

	// Constructor for Album
	public Album(String albumName, int numberOfSongs, String albumArtist) {

		this.albumName = albumName;
		this.numberOfSongs = numberOfSongs;
		this.albumArtist = albumArtist;
	}

	// Setters for the album
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public void setNumberOfSongs(int numberOfSongs) {
		this.numberOfSongs = numberOfSongs;
	}

	public void setAlbumArtist(String albumArtist) {
		this.albumArtist = albumArtist;
	}

	// Getters for the Album
	public String getAlbumName() {
		return this.albumName;
	}

	public int getNumberOfSongs() {
		return this.numberOfSongs;
	}

	public String getAlbumArtist() {
		return this.albumArtist;
	}

	// To String method that represents the album
	public String toString() {
		String output = "Album name: " + albumName;
		output += " Artist: " + albumArtist;
		output += " Number of songs: " + numberOfSongs;

		return output;
	}

	// Main Method
	public static void main(String[] args) {

		// Declare the new ArrayList
		List<Album> albums1 = new ArrayList<Album>();

		// Add 5 albums to the ArrayList
		albums1.add(new Album("Sorry For Party Rocking", 16, "LMFAO"));
		albums1.add(new Album("Dookie", 15, "Green Day"));
		albums1.add(new Album("Enema Of the State", 12, "Blink182"));
		albums1.add(new Album("All Killer, No Filler", 13, "Sum 41"));
		albums1.add(new Album("Fahrenheit", 10, "Toto"));

		// Display all the albums in the console
		System.out.println("List of albums in album1:");
		for (Album stringObject : albums1) {
			System.out.println(stringObject);
		}

		// Sort formula gotten assistance from
		// https://stackoverflow.com/questions/4066538/sort-an-arraylist-based-on-an-object-field
		Collections.sort(albums1, new Comparator<Album>() {
			public int compare(Album a, Album b) {
				if (a.numberOfSongs == b.numberOfSongs)
					return 0;
				return a.numberOfSongs < b.numberOfSongs ? -1 : 1;
			}
		});

		// Display the albums in console after it is sorted by the number of songs
		System.out.println("\nAlbums sorted according to number of songs:");
		for (Album stringObject : albums1) {
			System.out.println(stringObject);
		}

		// Swap position 1 and 2
		Collections.swap(albums1, 0, 1);

		// Display the albums in console after position 1 and 2 is swapped
		System.out.println("\nAlbums after album position 1 and 2 are swapped:");
		for (Album stringObject : albums1) {
			System.out.println(stringObject);
		}

		// Declare the new ArrayList
		List<Album> albums2 = new ArrayList<Album>();

		// Use addAll method to add 5 albums
		albums2.addAll(Arrays.asList(new Album("Deluxe", 16, "Ed Sheeran"), new Album("Globalization", 11, "Pitbull"),
				new Album("The Fame", 15, "Lady Gaga"), new Album("Evacuate The Dancefloor", 11, "Cascada"),
				new Album("Indigo", 32, "Chris Brown")));

		// Display the albums2 in console
		System.out.println("\nalbums2 addAll method used to add 5 albums:");
		for (Album stringObject : albums2) {
			System.out.println(stringObject);
		}

		// Copy all the albums from albums1 over to albums2
		albums2.addAll(albums1);

		// Display the albums in console after albums1 copied over to albums2
		System.out.println("\nalbums2 after items are copied over from albums1:");
		for (Album stringObject : albums2) {
			System.out.println(stringObject);
		}

		// Add 2 elements to albums2
		albums2.add(new Album("Dark Side of the Moon", 9, "Pink Floyd"));
		albums2.add(new Album("Oops!... I Did It Again", 16, "Britney Spears"));

		// Sort albums2 according to album name
		Collections.sort(albums2, new Comparator<Album>() {
			public int compare(Album a, Album b) {
				return a.getAlbumName().compareTo(b.getAlbumName());
			}
		});

		// Display the albums in console after albums2 is sorted according to album name
		System.out.println("\nalbums2 sorted by album name:");
		for (Album stringObject : albums2) {
			System.out.println(stringObject);
		}

		// Search for a specific album
		int index = -1;
		String searchItem = "Dark Side of the Moon";
		for (int i = 0; i < albums2.size(); i++) {
			if (albums2.get(i).albumName == searchItem) {
				index = i;
				break;
			}
		}

		// Display in console the index of the album
		if (index == -1) {
			System.out.println("\n" + searchItem + " could not be found");
		} else{
			System.out.println("\n" + searchItem + " - is at index: " + index);
		}
	}

}