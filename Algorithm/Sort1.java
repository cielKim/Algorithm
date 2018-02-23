import java.util.Scanner;

public class Sort1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요: ");
		int N = scan.nextInt();
		System.out.println("받은 숫자는<" + N + ">입니다.");
		boolean YN = true;
		
		System.out.println(N + "개의 숫자를 입력해 주세요.");
		
		while(YN) {
			if(N<1 || N>1000) {
				System.out.println("다시 입력해주세요");
				N = scan.nextInt();
			} else {
				YN = false;
			}
		}
		
		int [] array = new int [N];
		int temp = 0;
		int Number = 0;
		
		
		for(int i=0; i<N ; i++) {
			Number = scan.nextInt();
			array[i] = Number;
		}
		
		for(int i=0 ; i<array.length-1 ; i++) {
			for(int j=0 ; j<array.length-1 ; j++) {
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		int prev = array[0];
		
		System.out.print(prev + " ");
		for(int i=1 ; i<array.length ; i++) {
			if(prev != array[i]) {
				System.out.print(array[i] + " ");
				prev = array[i];
				
			}
			
		}
		
		
		scan.close();
	}
}
