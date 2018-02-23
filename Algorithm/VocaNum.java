import java.util.Scanner;
 
public class VocaNum {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String VOCA = scan.nextLine();
        boolean YN = true;
        int N = VOCA.length();
        
        
        System.out.println("글자수: " + N);
        //예외처리를 해야해! charAt()으로 하나하나 해야해!
        
        YN = true;
        char chrinput;
        while(YN) {
            for(int i=0 ; i<N ; i++) {
                chrinput = VOCA.charAt(i);
                if(chrinput >= 0x61 && chrinput <= 0x7A) {
                    YN = false;
                } else if(chrinput >= 0x41 && chrinput <= 0x5A) {
                    YN = false;
                } else if (chrinput == 0x20) {
                    YN = false;
                } else {
                    System.out.println("알파벳과 띄어쓰기만 가능합니다. 다시 입력해주세요.");
                    VOCA = scan.nextLine();
                }
                
                YN = false;
            }
            
            
        }
        
        String voca [] = VOCA.split(" ");
        int vocaN = voca.length;
        int cnt = vocaN;
        for(int i=0 ; i<voca.length ; i++) {
            if(voca[i].isEmpty()) {
                cnt = cnt-1;

            } else {
                

            }
            System.out.println("voca" + i + ": " + voca[i]);
        }
        System.out.println("총 단어개수: " + cnt);
        
        scan.close();
    }
}