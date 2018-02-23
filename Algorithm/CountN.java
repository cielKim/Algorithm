import java.util.*;

public class CountN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = scan.nextInt();
		for(int i=1 ; i<=N ; i++) {
			sb.append(i + "\n");
		}
		
		System.out.println(sb);
		
		scan.close();
	}

}
