package cn.springcloud.book.service.impl;

import cn.springcloud.book.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * @author shannon
 */
@Component
public class UserServiceFallback implements IUserService {
    /**
     * 出错则调用该方法返回友好错误
     *
     * @param username
     * @return
     */
    @Override
    public String getUser(String username) {
        return "The user does not exist in this system, please confirm username";
    }
}
