import java.util.Scanner;


public class Dmajor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array [] = new int [8];
		int asc = 0;
		int dsc = 0;
		
		for(int i=0 ; i<8 ; i++) {
			array[i] = scan.nextInt();
 		}
		/*int i = 0;
		while(i<7)
			if(array[i]<array[i+1]) {
				asc++;
				i++;
				
			}
			else if(array[i]>array[i+1]) {
				dsc++;
				i++;
			} 
		
		if(asc == 7) {
			System.out.println("ascending");
		} else if(dsc == 7) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
		*/
		
		int ascending = 0;
		int descending = 0;
		for (int i = 0; i < 7; i++) {
		   if (array[i] < array[i+1]) {
		         ascending = 1;
		   } else {
		         descending = 1;
		   }
		}
		if (ascending==1 && descending == 1) {
		   System.out.println("mixed");
		} else if(ascending == 1) {
		   System.out.println("ascending");
		} else {
		   System.out.println("descending");
		}
		scan.close();
	}

}
