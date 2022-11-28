package java9.future;

import java.util.Date;

/**
 * @author jirco
 * @date 2022/10/11 11:33
 */
public class Util {

    public static String func() {
        System.err.println(Thread.currentThread().getName() + " func start at " + new Date());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.err.println(Thread.currentThread().getName() + "func end at " + new Date());
        return "func return";
    }
}
