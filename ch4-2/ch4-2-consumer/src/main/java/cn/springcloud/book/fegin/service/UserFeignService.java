package cn.springcloud.book.fegin.service;

import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Struct;

/**
 * @author shannon
 */
@FeignClient(name = "ch2-1-provider")
public interface UserFeignService {
    @RequestMapping(value = "/feign", method = RequestMethod.GET)
    public String helloFeign();

    @RequestMapping(value = "createImagesCode")
    public Response createImageCode(@RequestParam("imageKey") Struct imageKey);
}
