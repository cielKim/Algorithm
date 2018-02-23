import java.util.Scanner;

public class AsciiCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(scan.next().charAt(0)-'0'+'0');
		scan.close();
	}

}
