/**
 * @author Lee
 * @create 2019/2/14 11:24
 */

/*
有main方法的类会先进行加载
按顺序先调用静态方法
* 1 private static int j = method();
* 2  static {
        System.out.println("6");
    }
其次会按以下顺序调用
   super
   test();
   非静态方法
   构造方法

  非静态代码前会先调用this,this在构造器init表示正在创建对象,因此先创建SON对象
  (这里实际是用了对象的多态)
* */
public class Son extends Father {

    private int i = test();
    private static int j = method();

    static {
        System.out.println("6");
    }
    Son(){
        System.out.println("7");
    }
    {
        System.out.println("8");
    }
    public int test(){
        System.out.println("9");
        return 1;
    }

    public static int method(){
        System.out.println("10");
        return 1;
    }



    public static void main(String[] args) {
         // Son s1 = new Son();
//        System.out.println();
//        Son s2 = new Son();

        Father f = new Son();

        f.test();
    }
}
