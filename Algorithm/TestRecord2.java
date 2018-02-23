import java.text.DecimalFormat;
import java.util.Scanner;

public class TestRecord2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		double array[] = new double [N];
		double M = array[0];
		for(int i=0 ; i<N ; i++) {
			array[i] = scan.nextInt();
			if(M < array[i]) {
				M = array[i];
			}
		}
		double a = 0;
		for(int i=0 ; i<N ; i++) {
			array[i] = (array[i]/M)*100;
			a+=array[i];
		}
		DecimalFormat form = new DecimalFormat("#.##");
		System.out.println(form.format(a/N));
		System.out.println(a/N);
		scan.close();
	}

}
