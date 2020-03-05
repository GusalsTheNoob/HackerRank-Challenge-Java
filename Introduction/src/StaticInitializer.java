import java.util.*;

public class StaticInitializer {

    final static Scanner scanner = new Scanner(System.in);
    private static int B;
    private static int H;
    private static boolean flag;

    static {
        try {
            B = scanner.nextInt();
            H = scanner.nextInt();
            scanner.close();
            flag = ((B>0) && (H>0));
            Exception e = new Exception("Breadth and height must be positive");
            if (!flag) throw e;     
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    } 

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
        
    }//end of main

}//end of class

/* 
<느낀 점>

1. 각종 선언 관련 키워드에 대한 숙련 부족이 느껴졌던 케이스.
2. 단순 변수 선언: (final) (private) (static) datatype name = value;
3. 오브젝트 변수 선언: (final) (private) (static) Class name = new constructor()
4. Static Initialization: static {--code here--} (*복잡한 initialization에 이용됨)
5. Constructor: public class Class (params) {--code here--}
6. Method: public (static) (void) name (params) {--code here--}

7. try ~ catch 구문의 제대로된 사용법을 체험했다.
8. try 내부에서 Exception 인스턴스를 정의하고 throw하면 catch 부분으로 이동함
9. Exception 인스턴스의 정의는 try 내부에서 이루어져야 함. 그렇지 않을 경우 중복정의 오류가 발생.
10. Exception 내용의 출력은 .getMessege(), .toString(), .printStackTrace()으로 내용을 불러오고 println() 해서 출력까지 해주어야 함.

*/