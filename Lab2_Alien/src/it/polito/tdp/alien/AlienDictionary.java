package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	private List<WordEnhanced> dictionary = new ArrayList<WordEnhanced>();  
	



	public void addWord(String alienWord, String translation) {
		for (WordEnhanced w : dictionary) {
			if (w.compare(alienWord)== alienWord) {
				w.setTranslation(translation);
				return;
			}
		}
		WordEnhanced w = new WordEnhanced(alienWord, translation);
		dictionary.add(w);
	}

	public String translateWord(String alienWord) {
		for (WordEnhanced w : dictionary) {
			if (w.compare(alienWord) == alienWord) {
				return w.getTranslation();
			}
		}
		return null;
	}

	public String translateWordWildCard(String alienWildCard) {

		alienWildCard = alienWildCard.replaceAll("\\?", ".");

		int matchCounter = 0;
		StringBuilder sb = new StringBuilder();

		for (WordEnhanced w : dictionary) {
			if (w.compareWild(alienWildCard)) {
				matchCounter++;
				sb.append(w.getTranslation() + "\n");
			}
		}

		if (matchCounter != 0)
			return sb.toString();
		else
			return null;
	}
	
	
	
}
	
