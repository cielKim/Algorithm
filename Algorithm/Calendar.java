import java.util.Scanner;

public class Calendar {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int Month = scan.nextInt();
		int Day = scan.nextInt();

		int [] d = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String [] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		
		int M = 0;
		for(int i=0 ; i<Month ; i++) {
			M = M + d[i];
		}
		
		M = (M+Day-1)%7;
		
		System.out.println(day[M]);
		
		
		
		scan.close();
	}

}
