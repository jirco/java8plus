package java9.stream;

import java.util.stream.IntStream;

/**
 * @author jirco
 * @date 2022/10/8 10:11
 */
public class IterateTest {

    public static void main(String[] args) {
        // 简化的fori循环
        IntStream.iterate(3, x -> x < 10, x -> x + 1).forEach(System.out::println);
    }
}
