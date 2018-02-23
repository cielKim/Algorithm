import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		boolean YN = true;
		while(YN) {
			if(N>=0 && N<=12) {
				YN = false;
			} else {
				System.out.println("다시입력해주세요");
				N = scan.nextInt();
			}
		}
		int b = 1;
		for(int i=N ; i>0 ; i--) {
			b = b*i;
		}
		System.out.println(b);
		scan.close();
		
	}
}
