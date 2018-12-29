package cn.springcloud.book.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author shannon
 */
@SpringBootApplication
@EnableConfigServer
public class DbConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DbConfigServerApplication.class, args);
    }
}
