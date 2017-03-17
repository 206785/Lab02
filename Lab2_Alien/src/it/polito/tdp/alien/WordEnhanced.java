package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced extends Word{
	
	
	private List<String> translations = new ArrayList<String>();

	
	public WordEnhanced(String alienWord, String translation) {
		super(alienWord, translation);
		translations.add(translation);
	}


	
	

	@Override
	public String getAlienWord() {
		// TODO Auto-generated method stub
		return super.getAlienWord();
	}



	@Override
	public void setAlienWord(String alienWord) {
		// TODO Auto-generated method stub
		super.setAlienWord(alienWord);
	}



	@Override
	public String getTranslation() {
		String s = "";
		for (String a : translations){
			s += a +"\n";
			
		}
		return s;
	}



	@Override
	public void setTranslation(String translation) {
		
		if (translations.contains(translation))
			translations.add(translation);
	}


	public String compare(String parolaPassata) {
		if (alienWord.compareTo(parolaPassata) == 0)
			return parolaPassata;
		return null;
	}
	
}
