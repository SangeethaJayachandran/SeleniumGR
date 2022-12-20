package org.network;

public class Wifi {
	private void wifiName() {
System.out.println("Wifi name is: Sysco");
	}
	public static void main(String[] args) {
		Wifi w = new Wifi();
		w.wifiName();
		MobileData mb = new MobileData();
		mb.dataName();
		Wireless wl = new Wireless();
		wl.modamName();
		Lan l = new Lan();
		l.lanName();
	}
}
