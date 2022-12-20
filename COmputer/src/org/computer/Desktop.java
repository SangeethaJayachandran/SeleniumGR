package org.computer;

public class Desktop extends Computer{ //child
	private void desktopSize() {
System.out.println("Desktop size is 1920 * 1080");
	}
	public static void main(String[] args) {
		Desktop comp = new Desktop();
		comp.computerModel();
		comp.desktopSize();
	}
}