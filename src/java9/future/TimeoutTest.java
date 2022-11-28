package java9.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author jirco
 * @date 2022/10/11 11:22
 */
public class TimeoutTest {

    // timeouts(超时): 超时后主线程受影响，超时线程任然会继续执行
    public static void main(String[] args) {
        try {
            System.out.println("orTimeout测试");
            CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> Util.func())
                .orTimeout(200, TimeUnit.MILLISECONDS); // 超时了就报错
            System.out.println(future.get());
        } catch (Exception e) {
            System.err.println("执行超时就抛出异常：" + e.getMessage());
        }

        try {
            System.out.println("\ncompleteOnTimeout超时测试");
            CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> Util.func())
                .completeOnTimeout("超时返回指定值",200, TimeUnit.MILLISECONDS); // 超时了就报错
            System.out.println(future.get());
        } catch (Exception e) {
            System.err.println("orTimeout执行超时就抛出异常：" + e.getMessage());
        }

        try {
            System.out.println("\ncompleteOnTimeout完成测试");
            CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> Util.func())
                .completeOnTimeout("not finish",20000, TimeUnit.MILLISECONDS); // 超时了就报错
            System.out.println(future.get());
        } catch (Exception e) {
            System.err.println("orTimeout执行超时就抛出异常：" + e.getMessage());
        }
        // 2. 提升了对子类化的支持
        // 3. 新的工厂方法
    }

}
