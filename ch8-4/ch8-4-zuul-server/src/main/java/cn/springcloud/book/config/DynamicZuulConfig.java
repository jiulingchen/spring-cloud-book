package cn.springcloud.book.config;

import cn.springcloud.book.DynamicZuulRouteLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shannon
 */
@Configuration
public class DynamicZuulConfig {
    @Autowired
    private ZuulProperties
            zuulProperties;

    @Autowired
    private ServerProperties serverProperties;

    @Bean
    DynamicZuulRouteLocator routeLocator() {
        DynamicZuulRouteLocator routeLocator = new DynamicZuulRouteLocator(
                serverProperties.getServlet().getServletPrefix(), zuulProperties);
        return routeLocator;
    }

}
