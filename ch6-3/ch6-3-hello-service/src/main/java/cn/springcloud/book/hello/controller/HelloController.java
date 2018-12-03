package cn.springcloud.book.hello.controller;

import cn.springcloud.book.hello.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shannon
 */
@RestController
public class HelloController {
    @Autowired
    IHelloService userService;

    @GetMapping("/getProviderData")
    public List<String> getProviderData() {
        return userService.getProviderData();
    }

    @RequestMapping(value = "/helloService", method = RequestMethod.GET)
    public String getHelloServiceData() {
        return "hello Service";
    }
}
