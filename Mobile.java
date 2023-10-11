package week1.day1.homework;

public class Mobile {
	public void makecall() {
		String mobileModel="sumsung";
		float mobileWeight=15.5f;
		System.out.println("mobileModel is"+ mobileModel);
		System.out.println("mobileWeight is"+ mobileWeight);
		
	}
	public void sendmsg() {
		boolean isfullCharged = true;
		int mobileCost = 30000;
		System.out.println("isfullCharged  "+isfullCharged );
		System.out.println("mobileCost is "+mobileCost);
		
	}
public static void main(String[] args) {
		Mobile mob =new Mobile();

			mob.makecall();
			mob.sendmsg();
			System.out.println("THIS IS MY MOBILE");
}

}
