package cn.springcloud.book.user.controller;

import cn.springcloud.book.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shannon
 */
@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/getDefaultUser")
    public String getDefaultUser() {
        return userService.getDefaultUser();
    }

    @GetMapping("/getContextUserId")
    public String getContextUserId() {
        return userService.getContextUserId();
    }

    @GetMapping("/getProviderData")
    public List<String> getProviderData() {
        return userService.getProviderData();
    }
}
