import java.util.Scanner;

public class Sum {

	public static void main(String arg[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("몇개의 숫자를 입력할 것인지 숫자를 넣어주세요. (1~100)");
		int N = scan.nextInt();
		boolean A = true;

		while (A) {
			if (N < 1 || N > 100) {
				System.out.println("다시 입력해주세요");
				N = scan.nextInt();
			} else {
				A = false;
			}
		}
		
		System.out.println("숫자를 한 번에 입력해주세요.");
		A = true;
		String numbers;
		numbers = scan.next();
		while(A) {
			if(numbers.length() != N) {
				System.out.println(N + "개의 숫자를 입력해주세요.");
				numbers = scan.next();
			} else {
				A = false;
			}
		}
		
		int sum=0;
		for(int i=0 ; i<N ; i++) {
			sum = sum + numbers.charAt(i)-'0';
		}
		
		System.out.println(sum);
		
		
		scan.close();
	}
}
