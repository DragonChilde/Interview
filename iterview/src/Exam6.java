/**
 * @author Lee
 * @create 2019/2/15 16:10
 */
public class Exam6 {

    public static void main(String[] args) {
        int f = f(4);
        System.out.println(f);

        int f2 = f2(4);
        System.out.println(f2);
    }

    public static int f(int n){
        if(n<1){
            throw new IllegalArgumentException();
        }
        if(n==1||n==2){
            return n;
        }
        return f(n-1)+f(n-2);
    }

    public static int f2(int n){
        if(n<1){
            throw new IllegalArgumentException();
        }
        if(n==1||n==2){
            return n;
        }

        int one = 2;
        int two = 1;
        int sum = 0;
        for (int i = 3; i <=n ; i++) {
            sum = one+two;
            two = one;
            one = sum;
        }
        return sum;
    }
}
