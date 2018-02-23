import java.util.Scanner;

public class OX {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int C = scan.nextInt();
		int cnt = 1;
		int cnt2 = 0;
		int no = 0;
		for(int i=0 ; i<=C ; i++) {
			String s = scan.nextLine();
			char [] ox = s.toCharArray();
			for(int j=0 ; j<ox.length ; j++) {
				if(ox[j] == 'O') {
					no++;
					cnt = 1*no;
					cnt2 = cnt2+cnt;
				} else if (ox[j] == 'X') {
					cnt = 0;
					no = 0;
				}
			}
			if(i!=0)
				System.out.println(cnt2);
				cnt2 = 0;
				no = 0;
				cnt = 0;
		}
		scan.close();
	}

}
