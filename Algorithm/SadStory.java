import java.util.Scanner;

public class SadStory {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int C = scan.nextInt(); //케이스 숫자
		int S = 0; //학생숫자
		double score = 0;
		double pg = 0;
		double bj = 0;
		double good = 0;
		for(int i=0 ; i<C ; i++) {
			 S = scan.nextInt();
			 double scores [] = new double[S];
			 for(int j=0 ; j<S ; j++) {
				 scores[j] = scan.nextDouble();//학생마다 점수 받음
				 score = score + scores[j];
			 }
			 //평균
			 pg = score/S;
			 System.out.println("평균: " + pg);
			 for(int k=0 ; k<S ; k++) {
				 if(scores[k]>pg) {
					 good++;
				 }
			 }
			 // 평균 점수를 넘는 아이들의 비중을 구해야해 =>평균점수 넘는 아이들의 숫자를 구해야해
			 bj = (good/S)*100;
			 System.out.printf("%.03f%%\n", bj);
			 pg = 0;
			 good = 0;
			 bj = 0;
			 score = 0;
		}
		scan.close();
	}

}
