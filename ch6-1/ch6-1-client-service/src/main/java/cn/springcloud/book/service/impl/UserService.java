package cn.springcloud.book.service.impl;

import cn.springcloud.book.service.IUserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

/**
 * @author shannon
 */
@Component
public class UserService implements IUserService {
    @Override
    @HystrixCommand(fallbackMethod = "defaultUser")
    public String getUser(String username) throws Exception {
        if (username.equals("spring")) {
            return "This is real user";
        } else {
            throw new Exception();
        }
    }

    /**
     * 出错则调用该方法返回友好错误
     *
     * @param username
     * @return
     */
    public String defaultUser(String username) {
        return "The user does not exits in this system";
    }
}
