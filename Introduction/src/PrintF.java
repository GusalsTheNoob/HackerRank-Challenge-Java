// "Java Output Formatting" Challenge

import java.util.Scanner;

public class PrintF {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");
        sc.close();
    }
}

/*
<느낀 점>

1. formatting에 대한 지식을 물어본 문제인데, 아직 숙련이 부족하다는 게 명확하게 드러남. 그나저나 매우 간편하고 좋은 방법인듯!
참고할만한 링크: http://tcpschool.com/c/c_intro_printf

2. Scanner.close()를 자꾸 까먹는 경향이 있는 듯.

*/