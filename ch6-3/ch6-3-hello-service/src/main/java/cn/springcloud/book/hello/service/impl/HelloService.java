package cn.springcloud.book.hello.service.impl;

import cn.springcloud.book.hello.service.IHelloService;
import cn.springcloud.book.hello.service.dataservice.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author shannon
 */
@Component
public class HelloService implements IHelloService {
    @Autowired
    private ProviderService dataService;

    @Override
    public List<String> getProviderData() {
        return dataService.getProviderData();
    }
}
