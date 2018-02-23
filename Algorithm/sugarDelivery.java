import java.util.Scanner;

public class sugarDelivery {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N;
		boolean A = true;

		N = scan.nextInt();
		while (A) {
			if (N < 3 || N > 5000) {
				System.out.println("다시 입력해주세요.");
				N = scan.nextInt();
			} else {
				A = false;
			}
		}

		int z = 0;
		int Y = N / 5;
		for (int i = 0; i <= Y ; i++) {
			if (N - 5 * i >= 0 && (N - 5 * i) % 3 == 0) {
				z = i;
			}
		}

		int B = N -(5 * z);
		int C = B / 3;
		int D = B % 3;
		if (D == 0) {
			System.out.println("5kg : " + z + "  3kg : " + C);

		} else if (D != 0) {
			System.out.println("-1");
		}

	}

}
