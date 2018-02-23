import java.util.Scanner;

public class PGscore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[] = new int[5];
		int sum = 0;
		for(int i=0 ; i<5 ; i++) {
			array[i] = scan.nextInt();
			if(array[i]<40) {
				array[i] = 40;
			}
			sum = sum+array[i];
		}
		
		System.out.println(sum/5);
		
		
		
		
		scan.close();
	}

}
