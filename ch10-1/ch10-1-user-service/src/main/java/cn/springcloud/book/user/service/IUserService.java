package cn.springcloud.book.user.service;

import java.util.List;

/**
 * @author shannon
 */
public interface IUserService {
    public String getDefaultUser();

    public String getContextUserId();

    public List<String> getProviderData();
}
