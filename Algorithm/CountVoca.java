import java.util.Scanner;
import java.util.StringTokenizer;

public class CountVoca {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String phrase = scan.nextLine();
		
		StringTokenizer st = new StringTokenizer(phrase, " ");
		int num = st.countTokens();
		System.out.println("단어의 개수: " + num);
		
		
		scan.close();
	}

}
