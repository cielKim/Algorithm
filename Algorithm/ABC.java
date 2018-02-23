import java.util.Scanner;

public class ABC {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = 0;
		int C = 0;
		
		boolean YN = true;
		
		while(YN) {
			if(A>100 || A<1) {
				System.out.println("다시 입력해주세요");
				A = scan.nextInt();
			} else {
				YN = false;
				B = scan.nextInt();
				YN = true;
				while(YN) {
					if(B>100 || B<1) {
						System.out.println("다시 입력해주세요");
						B = scan.nextInt();
						
					} else {
						YN = false;
						C = scan.nextInt();
						YN = true;
						while(YN) {
							if(C<1 || C>100) {
								System.out.println("다시 입력해주세요");
								C = scan.nextInt();
							} else {
								YN = false;
							}
						}
					}
				}
			}
		}
		
		System.out.println(A + " " + B + " " + C + " ");
		int temp = 0;
		
		int array[] = new int[3];
		array[0] = A;
		array[1] = B;
		array[2] = C;
		
		for(int i=0 ; i<2 ; i++) {
			for(int j=0 ; j<2 ; j++) {
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		

		
		System.out.println("1등: " + array[0] + " 3등: " + array[2]);
		
		scan.close();
	}

}
