import java.util.Scanner;

public class Sequence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		StringBuilder sb = new StringBuilder();

		int array [] = new int [N];
		for(int i=0 ; i<N ; i++) {
			array[i] = scan.nextInt();
			if(array[i]<X) {
				sb.append(array[i] + " ");
			}
		}
		
		System.out.println(sb);
		scan.close();
	}
}
