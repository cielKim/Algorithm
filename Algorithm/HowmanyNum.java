import java.util.Scanner;

public class HowmanyNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		boolean YN = true;
		int D = A*B*C;
		int [] array = new int [10];
		
		while(YN) {
			int num = D%10;
			System.out.println("num " + num);
			array[num] = array[num]+1;
			D = D/10;
			System.out.println("num2 " + num);
			if(D == 0) {
				YN = false;
			}
		}
		
		for(int i=0 ; i<10 ; i++) {
			System.out.println(array[i]);
		}
		
		scan.close();
	}

}
