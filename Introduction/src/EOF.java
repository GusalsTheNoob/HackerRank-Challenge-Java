import java.util.*;

public class EOF {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 1;
        while (scanner.hasNext()) {
            System.out.println(i++ + " " + scanner.nextLine());
        }
    }
}

/* 
<느낀 점>

1. Scanner.hasnext()의 활용!
2. Scanner 부를 때 습관이 아직도 안 되어 있다니...

*/