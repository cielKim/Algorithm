import java.util.Scanner;

public class DialPhone {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String num = scan.nextLine();
		int sum = 0;
		char nums [] = new char [num.length()];
		for(int i=0 ; i<num.length() ; i++) {
			//각 문자 숫자로 바꿔야하는데! 어떻게 해야 잘 했다고 소문이 날까
			// switch case로 하는게 좋을까
			//우선 한 글자씩 배열에 집어넣기
			nums[i] = num.charAt(i);
			switch(nums[i]) {
			case 'A':
			case 'B':
			case 'C':
				sum+=3;
				System.out.println("case ABC");
				break;
			case 'D':
			case 'E':
			case 'F':
				sum+=4;
				System.out.println("case DEF");
				break;
			case 'G':
			case 'H':
			case 'I':
				sum+=5;
				System.out.println("case GHI");
				break;
			case 'J':
			case 'K':
			case 'L':
				sum+=6;
				System.out.println("case JKL");
				break;
			case 'M':
			case 'N':
			case 'O':
				sum+=7;
				System.out.println("case MNO");
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				sum+=8;
				System.out.println("case PQRS");
				break;
			case 'T':
			case 'U':
			case 'V':
				sum+=9;
				System.out.println("case TUV");
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				sum+=10;
				System.out.println("case WXYZ");
				break;
			}
			
			System.out.println(i + ": " + nums[i]+ " " + sum);
		}
		System.out.println("총 : " + sum);
		
		
		scan.close();
	}
}
