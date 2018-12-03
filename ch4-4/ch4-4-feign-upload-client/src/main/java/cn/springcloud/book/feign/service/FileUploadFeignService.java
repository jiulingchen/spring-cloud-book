package cn.springcloud.book.feign.service;

import cn.springcloud.book.feign.config.FeignMultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE;

/**
 * @author shannon
 */
@FeignClient(value = "feign-file-server", configuration = FeignMultipartSupportConfig.class)
public interface FileUploadFeignService {
    /**
     * 1.produces,consumes必填
     * 2.注意区分@RequestPart和RequestParam，不要将
     *
     * @param file
     * @return
     * @RequestPart(value="file")写成@RequestParam(value="file")
     */
    @RequestMapping(method = RequestMethod.POST, value = "/uploadFile/server",
            produces = {APPLICATION_JSON_UTF8_VALUE},
            consumes = {MULTIPART_FORM_DATA_VALUE})
    public String fileUpload(@RequestPart(value = "file") MultipartFile file);
}
