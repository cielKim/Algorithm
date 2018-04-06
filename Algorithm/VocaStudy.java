import java.util.Scanner;

public class VocaStudy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String voca = scan.next();
		String VOCA = voca.toLowerCase();
		int num [] = new int [26];
		char vocas [] = new char [voca.length()];
		char alpha [] = {'A', 'B', 'C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int result = 0;
		int max = num[0];
		int maxx = 0; 
		int b = 0;
		boolean a = false;
		for(int i=0 ; i<voca.length() ; i++) {
			vocas[i] = VOCA.charAt(i);
			result = vocas[i] - 'a';
			num[result]++;
			if(max < num[result]) {
				max = num[result];
				maxx = result;
				
			}
		}
		
		for(int i=0 ; i<26 ; i++) {
			if(max == num[i]) {
				b++;
				if( b>1) {
					a=true;
				}
			}
		}
		if(a == true) {
			System.out.println("?");
		} else {
			System.out.println(alpha[maxx]);
		}
		

		
		
		scan.close();
	}
}
