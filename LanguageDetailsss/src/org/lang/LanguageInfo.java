package org.lang;

public class LanguageInfo extends StateDetails{
	private void tamilLanguage() {
		System.out.println("Tamil language is south indian language");
	}

	private void englishLanguage() {
		System.out.println("English is second language for both north and south indians ");

	}

	private void hindiLanguage() {
		System.out.println("Hindi language is north indian language");

	}
	public static void main(String[] args) {
		LanguageInfo language = new LanguageInfo();
		language.tamilLanguage();
	    language.southIndia();
		language.hindiLanguage();
	    language.northIndia();
		language.englishLanguage();
	}
}