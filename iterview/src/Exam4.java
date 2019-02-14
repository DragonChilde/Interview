import java.util.Arrays;

/**
 * @author Lee
 * @create 2019/2/14 14:52
 */
public class Exam4 {
    public static void main(String[] args) {

        //形参会在栈里生成一块区域
        int i = 1;//参数放在栈里
        String str ="hello";//字符串参数放在方法区
        Integer num = 2;//包装类参数放在堆里
        int[]   arr = {1,2,3,4,5};//数组放在堆里
        MyData my = new MyData();//对面放在堆里

        //调用方法会在栈里生成一块区域
        change(i,str,num,arr,my);



        System.out.println(i); //1

        //字符串和包装类不可变
        System.out.println(str);//hello
        System.out.println(num);//2


        System.out.println(Arrays.toString(arr));//[2,2,3,4,5]
        System.out.println(my.a);//11


    }

    public static void change(int j,String s,Integer n,int[]a ,MyData m){
        j +=1;
        s +="world";
        n +=1;
        a[0] +=1;
        m.a +=1;
    }
}

class MyData{
    int a =10;
}
