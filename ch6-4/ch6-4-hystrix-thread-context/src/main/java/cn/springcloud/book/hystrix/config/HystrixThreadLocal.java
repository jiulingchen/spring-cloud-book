package cn.springcloud.book.hystrix.config;

/**
 * @author shannon
 */
public class HystrixThreadLocal {
    public static ThreadLocal<String> threadLocal=new ThreadLocal<>();
}
