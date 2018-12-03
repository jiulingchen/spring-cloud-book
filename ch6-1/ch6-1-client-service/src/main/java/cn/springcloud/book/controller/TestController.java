package cn.springcloud.book.controller;

import cn.springcloud.book.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shannon
 */
@RestController
public class TestController {
    @Autowired
    public IUserService userService;

    @GetMapping("/getUser")
    public String getUser(@RequestParam String username) throws Exception {
        return userService.getUser(username);
    }
}
