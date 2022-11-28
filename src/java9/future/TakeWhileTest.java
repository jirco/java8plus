package java9.future;

import java.util.stream.Stream;

/**
 * @author jirco
 * @date 2022/10/8 10:07
 */
public class TakeWhileTest {

    public static void main(String[] args) {
        // 顺序执行到Predicate=false之前的， 不包括端点
        long len = Stream.of(1, 2, 3, 0, 4, 5, 6)
            .takeWhile(i -> i != 0)
            .count();
        System.err.println(len); // 3, 0之前有三个元素

        // 旧的
        len = Stream.of(1, 2, 3, 0, 4, 5, 6).skip(2).count();
        System.err.println(len); // 5，跳过前2个，还剩5个

        len = Stream.of(1, 2, 3, 0, 4, 5, 6).limit(2).count();
        System.err.println(len); // 2, 只处理前两个

    }
}
