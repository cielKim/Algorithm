import java.util.Scanner;

public class Voca10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String N = scan.nextLine();
		boolean YN = true;
		while(YN) {
			if(N.length()>0 && N.length()<100) {
				YN = false;
			} else {
				N = scan.nextLine();
			}
		}
		String voca;
		int startIndex = 0;
		int endIndex = 9;
		int M = 0;

		if (N.length() % 10 == 0) {
			M = N.length() / 10;
		} else if (N.length() % 10 != 0) {
			M = (N.length() / 10) + 1;
		}
		for (int i = 0; i < M; i++) {

			if (N.length() % 10 != 0 && i == (M - 1)) {
				int R = N.length() - startIndex;
				int shortEnd = startIndex + R;
				voca = N.substring(startIndex, shortEnd);
				System.out.println(voca);
			} else {
				voca = N.substring(startIndex, endIndex);
				System.out.println(voca);
			}

			if (i != (M - 1)) {
				startIndex += 10;
				endIndex += 10;
			} else if (i == (M - 1)) {
				
			} else if (N.length() % 10 != 0 && i == (M - 2)) {
				startIndex += 10;
			}
		}

		scan.close();
	}

}
