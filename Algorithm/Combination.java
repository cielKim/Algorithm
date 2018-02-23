import java.math.BigInteger;
import java.util.Scanner;

public class Combination {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = 0;
		boolean YN = true;
		while(YN) {
			if(5>n || n>100) {
				System.out.println("다시 입력해주세요");
				n = scan.nextInt();
			} else { 
				YN = false;
				m = scan.nextInt();
				YN = true;
				while(YN) {
					if(m>=5 && m<=100 && m<=n) {
						YN = false;
					} else {
						System.out.println("다시 입력해주세요");
						m = scan.nextInt();
					}
				}
			}
		}
		
		System.out.println("n : " + n);
		System.out.println("m : " + m);
		//100 50에 대해서 100891344545564193334812497256를 출력하시면 됩니다.
		
		//n에 대한 팩토리얼 만들기 
		int N = 1;
		for(int i=n ; i>0 ; i-- ) {
			N = N*i;
			
		}
		if(n == 100) {
		//	BigInteger biginteger = new BigInteger(N);
			
		}
		System.out.println("N : " + N);
		
		//m에 대한 팩토리얼 만들기
		int M = 1;
		for(int i=m ; i>0 ; i--) {
			M = M*i;
		}
		System.out.println("M : " + M);
		
		
		int r = n-m;
		if(n==m) {
			r = 1;
		}
		//r에대한 팩토리얼 만들기
		int R = 1;
		for(int i=r ; i>0 ; i--) {
			R = R*i;
		}
		System.out.println("R : " + R);
		
		int C = N/(M*R);
		System.out.println(C);
		
		scan.close();
	}
}
