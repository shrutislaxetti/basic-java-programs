package com.bridgelabz.objectorientedprograms;

import com.bridgelabz.datastructures.LinkedList;
import com.bridgelabz.utility.Utility;

public class DeckOfCards {

	public static void main(String[] args) {

		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		LinkedList<String>   a=Utility.printcards(suits, ranks);
        Utility.sufflecard(a);
		
		
	}
}