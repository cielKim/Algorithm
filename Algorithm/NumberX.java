import java.text.DecimalFormat;
import java.util.Scanner;


public class NumberX {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(); //시험과목개수
		boolean YN = true;
		while(YN) {
			if(N<=1000 && N>0) {
				YN = false;
			} else {
				System.out.println("다시 입력해주세요.");
				N = scan.nextInt();
			}
		}
		YN = true;
		int [] array = new int [N];
		int M = array[0];
		for(int i=0 ; i<N ; i++) {
			array[i] = scan.nextInt();
			while(YN) {
				if(array[i]>0 || array[i]<=100) {
					YN = false;
				} else {
					System.out.println("다시 입력해주세요");
					array[i] = scan.nextInt();
				}
			}
			
			if(M<array[i]) {
				M = array[i];
			}
		}
		
		double sum = 0.00;
		
		for(int i=0 ; i<N ; i++) {
			array[i] = array[i]/M*100;
			sum += array[i];
		}
		DecimalFormat form = new DecimalFormat("#.##");
		System.out.println("새로운 평균" + form.format(sum/N));
		
		
		
		
		
		scan.close();
	}

}
