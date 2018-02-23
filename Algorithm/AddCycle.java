import java.util.Scanner;

public class AddCycle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(); //첫 숫자 받기
		int M = N;
		int cnt = 0; //while문 몇 번 도는지 확인하기
		int N2 = 0; //while문을 돈 숫자
		int a = 0;
		int b = 0;
		int c = 0;
		String snum; //char로 바꾸기 위한 string 변환
		String snum2;
		char num [] = new char[4];
		boolean YN = true;
		
		while(YN) {
			if(N>=0 && N<10) {
				//1자리 수 들어왔을 때
				snum = Integer.toString(N);
				num[0] = '0';
				num[1] = snum.charAt(0);
				a = 0;
				b = snum.charAt(0)-'0';
				c = a + b;
				String C = String.valueOf(c);
				if(c>=0 && c<10) {
					num[2] = '0';
					num[3] = C.charAt(0);
				} 
				char num2 [] = {num[1], num[3]};
				snum2 = String.valueOf(num2);
				N2 = Integer.parseInt(snum2);
				cnt++;
				if(N2 != M) {
					N = N2;
				} else {
					YN = false;
				}
			} else if(N>=10 && N<100) {
				//2자리 수 들어왔을 때
				snum = Integer.toString(N); //한 자리씩 배열에 넣어주기 위한 String 형변환
				num[0] = snum.charAt(0);
				num[1] = snum.charAt(1);
				a = snum.charAt(0)-'0';
				b = snum.charAt(1)-'0';
				c = a + b;
				String C = String.valueOf(c);
				if(c>=0 && c<10) {
					num[2] = '0';
					num[3] = C.charAt(0);
				} else {
					num[2] = C.charAt(0);
					num[3] = C.charAt(1);
							
				}
				char num2 [] = {num[1], num[3]};
				snum2 = String.valueOf(num2);
				N2 = Integer.parseInt(snum2);
				cnt++;
				if(N2 != M) {
					N = N2;
				} else {
					YN = false;
				}
			}
			
			
		}
		System.out.println(cnt);
		scan.close();
	}
}
