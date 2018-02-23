import java.util.Scanner;

public class star1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		boolean YN = true;
		
		while(YN) {
			if(N<1 || N>100) {
				System.out.println("다시 입력해주세요");
				N = scan.nextInt();
			} else {
				YN = false;
			}
		}
		
		for(int i=0; i<N ; i++) {
			for(int j=-1 ; j<i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		scan.close();
	}

}
