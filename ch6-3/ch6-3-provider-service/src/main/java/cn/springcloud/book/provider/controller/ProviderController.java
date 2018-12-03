package cn.springcloud.book.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shannon
 */
@RestController
public class ProviderController {
    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/getDashboard")
    public List<String> getDashboard() {
        List<String> provider = new ArrayList<>();
        provider.add("hystrix dashboard");
        return provider;
    }

    @GetMapping("/getHelloService")
    public String getHelloService() {
        return consumerService.getHelloServiceData();
    }
}
