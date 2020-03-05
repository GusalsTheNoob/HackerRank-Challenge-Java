import java.util.Scanner;

class Loop2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += ((int) Math.pow(2, j))*b;
                System.out.printf("%d ", sum);
            }
            System.out.println("");
        }
        in.close();
    }
}

/* 
<느낀 점>

1. Java는 제곱 표현을 Math.pow(밑, 지수)로 해야 함.
2. Math.pow()는 double을 결과로 내놓으므로 explicit type casting이 필요할 수 있음! 참고.

*/
