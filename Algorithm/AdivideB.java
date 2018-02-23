import java.util.Scanner;

public class AdivideB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextInt();
		double B = 0;
		boolean YN = true;
		
		while(YN) {
			if(A<0 || A>10) {
				System.out.println("다시 입력해 주세요");
				A = scan.nextInt();
				
			} else {
				YN = false;
				B = scan.nextDouble();
				YN = false;
				while(YN) {
					if(B<0 || B>10) {
						System.out.println("다시 입력해주세요");
						B = scan.nextDouble();
					} else {
						YN = false;
					}
				}
			}
		}
		
		System.out.println(A/B);
		
		
	}
}
