package org.lang;

public class StateDetails extends LanguageInfo { // child
	private void southIndia() {
		System.out.println("South indians speak: Tamil, Telugu, Malayalam, Kanada and English");
	}

	private void northIndia() {
		System.out.println("North indians speak: Hindi and English");

	}

	public static void main(String[] args) {
		StateDetails det = new StateDetails();
		det.southIndia();
		det.northIndia();
		det.tamilLanguage();
		det.englishLanguage();
		det.hindiLanguage();
	}
}
