import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int array [] = new int[N];
		int M = 0;
		boolean YN = true;
		for(int i=0 ; i<N ; i++) {
			array[i] = scan.nextInt();
		}
		//약수가 1과 자기 자신일 때 소수
		for(int i=0 ; i<N ; i++) {
			if(YN == false) {
				YN = true;
			}
			for(int j=2 ; j<array[i] ; j++) {
				if(array[i]%j == 0) {
					YN = false;
				} 
			}
			if(YN == true) {
				if(array[i] == 1) {
					M--;
				}
				M++;
				System.out.println("소수들 - " + array[i]);
			}
		}
		
		System.out.println("소수갯수 : " + M);
		
		scan.close();
	}

}
