package cn.springcloud.book.hello.service.dataservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author shannon
 */
@FeignClient(name = "sc-provider-service")
public interface ProviderService {
    @RequestMapping(value = "/getDashboard",method = RequestMethod.GET)
    public List<String> getProviderData();
}
