import java.util.concurrent.*;

/**
 * @author Lee
 * @create 2019/2/13 10:01
 */
public class TestMain {
    public static void main(String[] args) {
       int i =1; //1
       i = i++; //1 2
       int j = i++; //1 2
       int k = i + ++i * i++; //运算符优先级++ > *
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);


        System.out.println(Single01.getSINGLE());
        System.out.println(Single02.SINNGLE);
        Single03 single = Single03.SINGLE;
        System.out.println(single.getTest());
        k-=i;
        System.out.println(k);


        Callable callable = new Callable<Single04>() {
            @Override
            public Single04 call() throws Exception {
                return Single04.getINSTANCE();
            }
        };
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Single04> submit01 = es.submit(callable);
        Future<Single04> submit02 = es.submit(callable);


        try {
            submit01.get();
            submit02.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println(submit01);
        System.out.println(submit02);
        System.out.println(submit01.equals(submit02));

        es.shutdown();


        Single05 single0501 = Single05.getINSTANCE();
        Single05 single0502 = Single05.getINSTANCE();
        System.out.println(single0501.equals(single0502));

        Single06 instance = Single06.getINSTANCE();
        System.out.println(instance);
    }
}
