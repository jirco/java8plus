package java10;

import java.util.List;

/**
 * @author jirco
 */
public class Variable {
    public static void main(String[] args) {
        var str = "string";
        var num = 12;
//      通过等号右边来判断类型，以下右边无法判断类型的都会报错
//        var err1 = null;
//        var err2;
        var result = str + num;
        System.err.println(result);

        // 这个不行
//        List<var> list = List.of(str, num);
        // 这个可以
        var list = List.of(str, num);

    }


}
