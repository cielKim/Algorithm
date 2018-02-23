import java.util.*;

public class Queue1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayDeque<Integer> que = new ArrayDeque<Integer>();
		int N = scan.nextInt();
		for(int i=0 ; i<=N ; i++) {
			String phrase = scan.nextLine();
			if(phrase.equals("pop")) {
				if(que.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println("pop: " + que.poll());
				}
			}else if(phrase.equals("size")) {
				System.out.println(que.size());
			}else if(phrase.equals("empty")) {
				if(que.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			}else if(phrase.equals("front")) {
				if(que.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println("front: " + que.peek() );
				}
			}else if(phrase.equals("back")) {
				if(que.isEmpty()) {
					System.out.println("-1");
				} else {
					que.getLast();
					System.out.println("back: " +que.getLast());
				}
			}else if(phrase.split(" ").length == 2) {
				String voca [] = phrase.split(" ");
				int B = Integer.parseInt(voca[1]);
				que.offer(B);
				System.out.println("push: " + B );
			}
		}
		
		scan.close();
	}

}
