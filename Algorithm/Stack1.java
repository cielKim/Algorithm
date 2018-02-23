import java.util.*;

public class Stack1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
			int N = scan.nextInt(); 
			String command;
			for(int i=0 ; i<=N ; i++) {
				 command = scan.nextLine();
				 if(command.equals("pop")) {
					 if(stack.empty()) {
						 System.out.println("-1");
					 } else {
						 System.out.println(stack.pop());
					 }
				 } else if(command.equals("size")) {
					 System.out.println(stack.size());
				 } else if(command.equals("empty")) {
					 if(stack.empty()) {
						 System.out.println("1");
					 } else {
						 System.out.println("0");
					 }
				 } else if(command.equals("top")) {
					 if(stack.empty()) {
						 System.out.println("-1");
					 } else {
						 System.out.println(stack.peek());
					 }
				 } else if (command.split(" ").length == 2) {
					 String vocas [] = command.split(" ");
					 int b = Integer.parseInt(vocas[1]);
					 stack.push(b);
				 }
				 
				 
			}
			
		scan.close();
	}
}
