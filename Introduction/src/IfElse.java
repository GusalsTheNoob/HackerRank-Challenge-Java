// "Java If-Else" Challenge

import java.util.*;

public class IfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println((N % 2 == 0)&&(N<6 || N>20) ? "Not Weird" : "Weird");
        scanner.close();
    }
}

/*
<느낀 점>

1. Ternary Operator의 힘은 Python에서든 Java에서든 강력하다!

2. scanner.skip()의 parameter는 regex expression인 거 같은데 추후에 공부가 더 필요할 듯하다.

*/