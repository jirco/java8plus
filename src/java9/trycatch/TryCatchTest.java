package java9.trycatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * @author jirco
 * @date 2022/10/8 9:37
 */
public class TryCatchTest {

    public static void main(String[] args) throws IOException {
        System.err.println(readData("test"));
    }

    // 已经有一个资源是 final 或等效于 final 变量,
    // 您可以在 try-with-resources 语句中使用该变量，而无需在 try-with-resources 语句中声明一个新变量。
    static String readData(String message) throws IOException {
        // 变量需要继承AutoCloseable
        Reader inputString = new StringReader(message);
        BufferedReader br = new BufferedReader(inputString);
        // jdk 7的写法：重新声明变量  try (BufferedReader br1 = br)
        try (br) {
            return br.readLine();
        }
    }
}
