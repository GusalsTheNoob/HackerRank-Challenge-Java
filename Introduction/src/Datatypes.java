import java.util.*;

class Datatypes{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        System.out.println(Long.MAX_VALUE < Double.MAX_VALUE);

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)System.out.println("* byte");
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}

/* 
<느낀 점>

1. Math.pow()의 최대 단점은 결과가 double로 나온다는 점. 찾아본 결과 double의 최댓값이 long보다도 크다!!
2. double에서 long으로의 변환은 소숫점 버림으로 생각하면 된다. Math.pow()를 잘못 쓰면 문제가 발생할 수도 있는 이유.
3. Byte, Short, Integer, Long이라는 Class가 있다는 점을 배움!

4. try ~ catch ~ catch 구문
5. Exception e는 Exception 객체의 instance인 e를 parameter로 사용한다는 뜻.

*/