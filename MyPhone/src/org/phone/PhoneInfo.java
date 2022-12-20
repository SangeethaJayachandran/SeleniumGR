package org.phone;

public class PhoneInfo {
	private void phoneName()
	{
			System.out.println("Phone name is: iPhone 13 ");
	}
	private void phoneMieiNum()
	{
		System.out.println(" PhoneMiei Number is: 12345678");	
	}
	private void Camera()
	{
		System.out.println("Phone Camera quality is: 12 MP");
	}
	private void storage()
	{
	System.out.println("Phone Storage is: 128 MB");	
	}
	private void osName()
	{
		System.out.println("Phone OS is: IOS");
	}
	public static  void main (String[] args) {
		PhoneInfo data= new PhoneInfo();
	data.phoneName();
	data.phoneMieiNum();
	data.Camera();
	data.storage();
	data.osName();
	}
}
