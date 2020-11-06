package priv.zhengfa.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import priv.zhengfa.mybatis.dao.User;
import priv.zhengfa.mybatis.dao.UserMapper;
import priv.zhengfa.mybatis.service.UserService;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(Integer id) {
        userMapper.selectByid(id);
        return userMapper.selectByid(id);
    }
}
