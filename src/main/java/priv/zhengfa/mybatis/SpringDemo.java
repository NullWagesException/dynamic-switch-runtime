package priv.zhengfa.mybatis;

import priv.zhengfa.mybatis.dao.UserMapper;
import priv.zhengfa.mybatis.service.UserService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tommy
 * Created by Tommy on 2019/6/28
 **/
public class SpringDemo {


    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("spring.xml");
        UserMapper userMapper = context.getBean(UserMapper.class);
        System.out.println(userMapper.selectByid(1));
        DynamicSwitchCore.dynamicSwitchDataSource("123"
                ,"123","123");
        System.out.println(userMapper.selectByid(1));
        DynamicSwitchCore.dynamicSwitchDataSource("123"
                ,"123","123");
        System.out.println(userMapper.selectByid(1));
    }


}
