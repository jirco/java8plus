package java9.stream;

import java.util.stream.Stream;

/**
 * @author jirco
 * @date 2022/10/8 10:09
 */
public class DropWhileTest {

    public static void main(String[] args) {
        // dropWhile, 执行Predicate = false 之后的, 包括端点
        long len = Stream.of(1, 2, 3, 0, 4, 5, 6, 7, 8)
                .dropWhile(i -> i != 0)
                .count();
        System.err.println(len); // 6, 0之后有5个元素+0本身
    }
}
