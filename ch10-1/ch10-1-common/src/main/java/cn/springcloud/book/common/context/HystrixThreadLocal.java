package cn.springcloud.book.common.context;

/**
 * @author shannon
 */
public class HystrixThreadLocal {
    public static ThreadLocal<String> threadLocal = new ThreadLocal<>();
}
