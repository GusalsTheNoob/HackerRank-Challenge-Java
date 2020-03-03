import java.util.Scanner;

public class StdInOut2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt(); //1
        double d = scan.nextDouble(); //2
        scan.nextLine(); //here 3
        String s = scan.nextLine(); //
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

/*
<느낀 점>

1. token과 line의 차이점을 확실히 알아야 함."here" 부분을 알아서 넣을 수 있을 정도로 숙련이 돼야 함!
token은 whitespace(제외)를 기준으로 구분됨.
nextLine은 line을 받는데, line의 기준은 enter(제외)를 기준으로 구분됨.
1[42]2[\n3.1415]3[\n]4[Welcome to HackerRank's Java tutorials!]

*/