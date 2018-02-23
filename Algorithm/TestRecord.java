import java.util.Scanner;

public class TestRecord {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int Score = scan.nextInt();
		boolean A = true;
		
		while(A) {
			if(Score<0 || Score>100) {
				System.out.println("다시 입력해주세요");
				Score = scan.nextInt();
			} else {
				A = false;
			}
		}
		
		switch(Score/10) {
		case 10:
		case 9: System.out.println("A"); break;
		case 8: System.out.println("B"); break;
		case 7: System.out.println("C"); break;
		case 6: System.out.println("D"); break;
		default: System.out.println("F"); 
			
		}
		
		scan.close();
	}

}
