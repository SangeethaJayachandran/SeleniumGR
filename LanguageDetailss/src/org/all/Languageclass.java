package org.all;
import org.english.English;
import org.tamil.Tamil;
import org.telgu.Telgu;

public class Languageclass extends Telgu{//child
	private void alllanguage() {
System.out.println("South indian common languages are:");
	}
	public static void main(String[] args) {
		Languageclass lang = new Languageclass();
		lang.alllanguage();
		lang.englishlanguage();
		lang.tamillanguage();
		lang.telgulanguage();
		
	}
}
