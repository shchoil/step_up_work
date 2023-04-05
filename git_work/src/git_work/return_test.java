package git_work;

public class return_test {
	public static String getPhoneNumber() {
		String phoneNumber = "123-123-123";
		return phoneNumber;
	}
	
	public static String getAddress() {
		return "¼­¿ï ¾îµò°¡";
	}
	
	public static String getActibities() {
		String phoneNumber = getPhoneNumber();
		String address = getAddress();
		return phoneNumber + address;
	}
	
	public static int getPower(int number) {
		int result = number * number;
		return result;
	}
	
	public static int getPowerByExp(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= number;
		}
		return result;
	}
	
	public static void main(String[] args) {
		String phoneNumber = getPhoneNumber();
		System.out.println(phoneNumber);
		
		String address = getAddress();
		System.out.println(address);
		
		String actibities = getActibities();
		System.out.println(actibities);
		
		int retVal = getPower(2);
		System.out.println(retVal);
		
		retVal = getPower(3);
		System.out.println(retVal);
		
		retVal = getPowerByExp(3, 3);
		System.out.println(retVal);
	}
}
