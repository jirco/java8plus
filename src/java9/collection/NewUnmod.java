package java9.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 不可变集合变好写了！
 * 以后声明常量集合记着用这个
 *
 * @author jirco
 * @date 2022/9/28 17:39
 */
public class NewUnmod {

    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");
        Set<String> set = Set.of("A", "B", "C");
        Map<String, String> map = Map.of("A","1","B","2","C","3");

    }
}
