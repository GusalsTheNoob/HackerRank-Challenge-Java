// "Java Stdin and Stdout" Challenge

import java.util.*;

public class StdInOut {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {System.out.println(scan.nextInt());}
        scan.close();
    }
}

/*
<느낀 점>

1. 실제 터미널에서는 원하는 모양이 안 나온다는 것을 발견. 주의.

2. package 문제는 src에서 파일 디렉토리 문제로 발생하는 경우가 대다수.

3. Scanner.hasNextInt()가 사용되는 경우가 있음.
이게 발동되면 일단 입력 대기가 발생하고, 입력이 될 경우에 nextInt에 입력한 값이 배정되는 신기한 메소드.

4. try를 이용해서 scanner.close()를 생략하는 방법이 있음
try (Scanner scan = new Scanner(System.in)) {
    while (scan.hasNext()) {
        System.out.println(scan.nextInt());
    }
}
(citation: aurelius0523 https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/forum)

*/