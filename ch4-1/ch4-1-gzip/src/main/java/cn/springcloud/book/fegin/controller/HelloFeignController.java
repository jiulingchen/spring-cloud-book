package cn.springcloud.book.fegin.controller;

import cn.springcloud.book.fegin.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shannon
 */
@RestController
public class HelloFeignController {
    @Autowired
    private HelloFeignService helloFeignService;

    /**
     * 服务消费者对位提供的服务
     *
     * @param queryStr
     * @return
     */
    @GetMapping(value = "/search/github")
    public ResponseEntity<byte[]> searchGithubRepoByStr(@RequestParam("str") String queryStr) {
        return helloFeignService.searchRepo(queryStr);
    }
}
