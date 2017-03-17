package it.polito.tdp.alien;

public class Word {
	
	protected String alienWord;
	protected String translation;
	
	
	public Word(String alienWord, String translation) {
		
		this.alienWord = alienWord;
		this.translation = translation;
	}
	public String getAlienWord() {
		return alienWord;
	}
	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}
	public String getTranslation() {
		return translation;
	}
	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	public String compare(String parolaPassata) {
		if (alienWord.compareTo(parolaPassata) == 0)
			return parolaPassata;
		return null;
	}
	

}
