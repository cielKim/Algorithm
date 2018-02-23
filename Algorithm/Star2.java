import java.util.Scanner;


public class Star2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		boolean YN = true;
		
		while(YN) {
			if(N>100 || N<1) {
				System.out.println("다시 입력해주세요.");
				N = scan.nextInt();
			} else {
				YN = false;
			}
		}
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<i ; j++) {
				System.out.print(" ");
			}
			for(int k=N ; i<k ; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=0 ; i<N ; i++) {
			for(int j=N-1 ; j>i ; j--) {
				System.out.print("'");
			}
			for(int k=0 ; i+1>k ; k++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=0 ; i<N ; i++) {
			for(int j=N ; j>i ; j--) {
				System.out.print("*");
			}
			/*for(int k=i+1 ; k<i+1 ; k++) {
				System.out.print("'");
			}*/
			System.out.println();
		}
		
		scan.close();
		
	}

}
