import java.util.Scanner;

public class FindA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String S = scan.nextLine();
		char A [] = S.toCharArray();
		char B [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int idx = -1;
		for(int i=0 ; i<B.length ; i++) {
			for(int j=0 ; j<S.length() ; j++) {
				if(A[j] == B[i]) {
					System.out.println(A[j] + " : " + j);
					idx = j;
				} 
			}
			sb.append(idx + " ");
			idx = -1;
		}
		System.out.println(sb);
		
		scan.close();
		
	}
}
