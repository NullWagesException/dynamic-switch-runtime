package priv.zhengfa.mybatis.service;


import priv.zhengfa.mybatis.dao.User;

/**
 * @author Tommy
 * Created by Tommy on 2019/7/4
 **/
public interface UserService {
    User getUser(Integer id);

    User getUser2(Integer id);

    void registerUser(User user);
}
