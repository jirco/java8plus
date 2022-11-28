package java9.deprecated;

/**
 * @author jirco
 * @date 2022/10/8 10:25
 */
public class NewDeprecatedTest {

    @Deprecated(since = "java 9", forRemoval = true)
    public void test() {
        // Deprecated新加了两个参数：since  forRemoval
        // 没实际功能，仅javadoc说明方便
    }
}
