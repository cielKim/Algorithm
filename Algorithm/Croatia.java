import java.util.Scanner;

public class Croatia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String voca = scan.nextLine();

		String croatia[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		for (int i = 0; i < 8; i++) {
			voca = voca.replace(croatia[i], "1");
		}
		System.out.println(voca.length());

		/*
		 * //c= ->1 String a = voca.replaceAll("c=", "1"); //c- ->2 String b =
		 * a.replaceAll("c-", "2"); //dz= ->3 String c = b.replaceAll("dz=", "3"); //d-
		 * ->4 String d = c.replaceAll("d-", "4"); //lj ->5 String e =
		 * d.replaceAll("lj", "5"); //nj ->6 String f = e.replaceAll("nj", "6"); //s=
		 * ->7 String g = f.replaceAll("s=", "7"); //z= ->8 String h =
		 * g.replaceAll("z=", "8");
		 * 
		 * System.out.println(h.length());
		 */

		scan.close();
	}

}
