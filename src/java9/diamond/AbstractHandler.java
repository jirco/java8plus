package java9.diamond;

/**
 * @author jirco
 * @date 2022/10/8 10:41
 */
abstract public class AbstractHandler<T> {

    public T content;

    public AbstractHandler(T content) {
        this.content = content;
    }

    abstract void handle();

}
