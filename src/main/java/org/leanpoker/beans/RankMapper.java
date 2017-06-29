package org.leanpoker.beans;

public class RankMapper {

	public static int map(String rank) {
		switch(rank) {
			case "1":
				return 1;
			case "2":
				return 2;
			case "3":
				return 3;
			case "4":
				return 4;
			case "5":
				return 5;
			case "6":
				return 6;
			case "7":
				return 7;
			case "8":
				return 8;
			case "9":
				return 9;
			case "J":
				return 10;
			case "Q":
				return 11;
			case "K":
				return 12;
			case "A":
				return 13;
			default:
				return 0;
		}
	}
	
}
