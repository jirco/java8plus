package java9.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jirco
 * @date 2022/9/28 17:16
 */
public class OldUnmod {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        // 用新的内部类装饰，所以还必须再写个等号来接
        list = Collections.unmodifiableList(list);
        System.err.println(list);
    }
}
