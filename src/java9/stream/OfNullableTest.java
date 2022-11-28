package java9.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author jirco
 * @date 2022/10/8 10:12
 */
public class OfNullableTest {

    public static void main(String[] args) {
        List<Integer> list = Stream.ofNullable(1)
                .map(i -> i+1)
                .collect(Collectors.toList());
        System.err.println(list);
    }
}
