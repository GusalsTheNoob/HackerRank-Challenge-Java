// "Java Loops 1" Challenge

import java.util.*;

public class Loop1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", N, i, N*i);
        }

        scanner.close();
    }
}

/* 
<느낀 점>

1. 마침 printf를 사용하는 문제가 나왔다. 익숙해지기. Python과의 미묘한 차이를 기억해야 할 듯.

*/