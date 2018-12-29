package cn.springcloud.book.common.intercepter;

import cn.springcloud.book.common.context.UserContextHolder;
import cn.springcloud.book.common.util.HttpConvertUtil;
import cn.springcloud.book.common.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author shannon
 */
public class UserContextInterceptor implements HandlerInterceptor {
    private static final Logger log = LoggerFactory.getLogger(UserContextInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user = new User(HttpConvertUtil.httpRequestToMap(request));
        if (StringUtils.isEmpty(user.getUserId()) && StringUtils.isEmpty(user.getUserName())) {
            log.error("the user is null, please access from gateway or check user info");
            return false;
        }
        UserContextHolder.set(user);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//DOING NOTHING
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        UserContextHolder.shutdown();
    }
}
