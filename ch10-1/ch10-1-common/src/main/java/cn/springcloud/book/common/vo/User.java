package cn.springcloud.book.common.vo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户对象
 *
 * @author shannon
 */
public class User implements Serializable {

    public final static String CONTEXT_KEY_USERID = "x-customs-user";
    private static final long serialVersionUID = 6061919782574320999L;
    /**
     * 用户ID
     */
    private String userId;

    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public User() {
    }

    public User(Map<String, String> headers) {
        userId = headers.get(CONTEXT_KEY_USERID);
    }

    /**
     * 将user对象转换成为http对象头
     *
     * @return http头键值对
     */
    public Map<String, String> toHttpsHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put(CONTEXT_KEY_USERID, userId);
        return headers;
    }
}
