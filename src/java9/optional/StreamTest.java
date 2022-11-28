package java9.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author jirco
 * @date 2022/10/8 10:56
 */
public class StreamTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(null);
        list.add(3);
        list.add(4);

        // stream 方法的作用就是将 Optional 转为一个 Stream，
        // 如果该 Optional 中包含值，那么就返回包含这个值的 Stream，
        // 否则返回一个空的 Stream（Stream.empty()）。
        List<Integer> resultList = list.stream()
                .map(Optional::ofNullable)
                .flatMap(Optional::stream)
                .collect(Collectors.toList());

        // 暂时只想到一个代替.filter(!=null)的用法，还有什么时候会有多个optional呢
        System.err.println(list);
        System.err.println(resultList);
    }
}
