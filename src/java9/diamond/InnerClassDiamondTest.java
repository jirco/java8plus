package java9.diamond;

/**
 * @author jirco
 * @date 2022/10/8 10:40
 */
public class InnerClassDiamondTest {

    public static void main(String[] args) {
        // 对于匿名内部类，这里的<>内不用写Integer了，之前的版本需要写
        new AbstractHandler<>(1) {
            @Override
            public void handle() {
                System.out.println(content);
            }
        }.handle();

        new AbstractHandler<>("abc") {
            @Override
            public void handle() {
                System.out.println(content);
            }
        }.handle();
    }
}
