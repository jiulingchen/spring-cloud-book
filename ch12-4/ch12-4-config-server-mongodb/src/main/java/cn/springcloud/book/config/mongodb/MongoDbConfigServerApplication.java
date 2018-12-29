package cn.springcloud.book.config.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.mongodb.EnableMongoConfigServer;

/**
 * @author shannon
 */
@SpringBootApplication
@EnableMongoConfigServer
public class MongoDbConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MongoDbConfigServerApplication.class, args);
    }
}
