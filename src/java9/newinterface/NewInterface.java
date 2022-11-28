package java9.newinterface;

/**
 * 支持private的方法了
 * 接口和抽象类的语法区别越来越小咧
 *
 * @author jirco
 * @date 2022/9/28 17:54
 */
public interface NewInterface {
    // 常量还是不允许私有的哦
//    private String author = "12";

    default void func1() {
        before();
        System.err.println("func1");
    }

    // 甚至不用写default，合理
    private void before() {
        System.err.println("start");
    }
}
