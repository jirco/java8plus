package java9.optional;

import java.util.Optional;

/**
 * @author jirco
 */
public class PresentTest {

    public static void main(String[] args) {

        String a = null;

        // 和 orElse 不同，这个没有返回值
        // 适用于：用不到if条件的判断
        Optional.ofNullable(a)
            .ifPresentOrElse(str -> System.out.println(str + "exist"), () -> System.out.println("not exist"));

        // 和上面那个类似，只是没else
        Optional.ofNullable(a).ifPresent(str -> System.out.println(str + "exist2"));

    }
}
