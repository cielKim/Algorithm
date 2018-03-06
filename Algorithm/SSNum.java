import java.util.Scanner;

public class SSNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num1 = scan.next();
		String num2 = scan.next();
		
		StringBuilder sb = new StringBuilder(num1);
		StringBuilder sb2 = new StringBuilder(num2);
		
		sb.setCharAt(0, num1.charAt(2));
		sb.setCharAt(2, num1.charAt(0));
		sb2.setCharAt(0, num2.charAt(2));
		sb2.setCharAt(2, num2.charAt(0));
		
		String numnum = sb.toString();
		String numnum2 = sb2.toString();
		
		int numnumnum = Integer.parseInt(numnum);
		int numnumnum2 = Integer.parseInt(numnum2);
		
		if(numnumnum>numnumnum2) {
			System.out.println(numnumnum);
		} else {
			System.out.println(numnumnum2);
		}
		
		scan.close();
	}
}
