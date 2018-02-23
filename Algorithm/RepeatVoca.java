import java.util.Scanner;

public class RepeatVoca {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("케이스 숫자를 입력해주세요");
		StringBuilder sb = new StringBuilder();
		int C = scan.nextInt();
		int t = 0;
		String S = null;
		for(int i=0 ; i<C ; i++) {
			
			System.out.println("몇 번 반복할까요?");
			t = scan.nextInt();
			String aa = scan.nextLine();
			System.out.println(t);
			
				System.out.println("단어를 입력해주세요");
				S = scan.next();
				
				for(int j=0 ; j<S.length() ; j++) {
					char [] voca = S.toCharArray();
					for(int k=0 ; k<t ; k++) {
						sb.append(voca[j]);
					}
				}
				
			
			System.out.println(sb);
			sb.delete(0, S.length()*t);
		}
		
		
		
		scan.close();
	}

}
