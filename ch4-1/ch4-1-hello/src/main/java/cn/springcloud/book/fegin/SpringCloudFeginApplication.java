package cn.springcloud.book.fegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author shannon
 */
@SpringBootApplication
@EnableFeignClients
public class SpringCloudFeginApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeginApplication.class, args);
    }
}
