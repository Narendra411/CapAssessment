package apr17assessment;

import java.util.Scanner;

class Acquaintance {

	String name;

	public Acquaintance() {

	}

	public Acquaintance(String name) {
		this.name = name;
	}

	public void getStatus() {
		System.out.println(this.name + "is just an acquaintance.\n");
	}

}

class Friend extends Acquaintance {

	String homeTown;

	public Friend() {
		super();
	}

	public Friend(String name, String homeTown) {
		super(name);
		this.homeTown = homeTown;

	}

	public void getStatus() {
		System.out.println(this.name + " is a friend and he is from " + this.homeTown + ".\n");
	}
}

class BestFriend extends Friend {

	String favoriteSong;

	public BestFriend() {
		super();
	}

	public BestFriend(String name, String homeTown, String favoriteSong) {
		super(name, homeTown);
		this.favoriteSong = favoriteSong;

	}

	public void getStatus() {
		System.out.println(this.name + " is my best friend. He is from " + homeTown + " and his favorite song is  "
				+ this.favoriteSong + ".\n");
	}
}

public class Main {
	public static void main(String[] args) {
		// BestFriend ob = new BestFriend("Ranga", "Vijayawada", "SixthSense");
		// ob.getStatus();
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		int n = scan.nextInt();
		String[] str = new String[n];

		for (int i = 0; i < str.length; i++) {
			str[i] = scan1.nextLine();

		}

		for (String s : str) {

			String[] strArray = s.split(" ");
			if (strArray.length <= 2) {
				Acquaintance ob = new Acquaintance(strArray[strArray.length - 1]);
				ob.getStatus();
			} else if (strArray.length <= 3) {
				Friend ob1 = new Friend(strArray[strArray.length - 2], strArray[strArray.length - 1]);
				ob1.getStatus();
			} else if (strArray.length <= 4) {
				BestFriend ob1 = new BestFriend(strArray[strArray.length - 3], strArray[strArray.length - 2],
						strArray[strArray.length - 1]);
				ob1.getStatus();
			}

		} // end of forloop

		scan.close();
		scan1.close();

	}
}
