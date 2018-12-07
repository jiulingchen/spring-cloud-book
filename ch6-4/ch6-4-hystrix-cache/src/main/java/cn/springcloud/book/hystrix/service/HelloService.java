package cn.springcloud.book.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheRemove;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author shannon
 */
@Component
public class HelloService implements IHelloService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    @CacheResult
    @HystrixCommand
    public String hello(Integer id) {
        String json = restTemplate.getForObject("http://sc-provider-service/getUser/{1}", String.class, id);
        System.out.println(json);
        return json;
    }

    @Override
    @CacheResult
    @HystrixCommand(commandKey = "getUser")
    public String getUserToCommandKey(Integer id) {
        String json = restTemplate.getForObject("http://sc-provider-service/getUser/{1}", String.class, id);
        System.out.println(json);
        return json;
    }

    @Override
    @CacheRemove(commandKey = "getUser")
    @HystrixCommand
    public String updateUser(Integer id) {
        System.out.println("删除getUser缓存");
        return "update success";
    }
}
