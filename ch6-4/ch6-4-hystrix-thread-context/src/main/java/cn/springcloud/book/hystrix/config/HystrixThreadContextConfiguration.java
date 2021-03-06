package cn.springcloud.book.hystrix.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shannon
 */
@Configuration
public class HystrixThreadContextConfiguration {
    @Bean
    public SpringCloudHystrixConcurrencyStrategy springCloudHystrixConcurrencyStrategy(){
        return new SpringCloudHystrixConcurrencyStrategy();
    }
}
