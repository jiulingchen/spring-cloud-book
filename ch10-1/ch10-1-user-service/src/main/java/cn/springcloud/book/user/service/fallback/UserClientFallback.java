package cn.springcloud.book.user.service.fallback;

import cn.springcloud.book.user.service.dataservice.DataService;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements DataService {

    @Override
    public String getDefaultUser() {
        return new String("get getDefaultUser failed");
    }

    @Override
    public String getContextUserId() {
        return new String("get getContextUserId failed");
    }
}
