package cn.springcloud.book.common.util;

import cn.springcloud.book.common.vo.User;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletResponse;

/**
 * @author shannon
 */
public class AuthUtil {
    public static boolean authUser(User user, HttpServletResponse response) {
        if (StringUtils.isEmpty(user.getUserId())) {
            return false;
        } else {
            return true;
        }
    }
}
