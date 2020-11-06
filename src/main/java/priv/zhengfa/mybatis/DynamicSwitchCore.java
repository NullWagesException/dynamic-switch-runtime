package priv.zhengfa.mybatis;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.lang.reflect.Field;
import java.util.Map;
/**
 * @author zhengfa
 * @date 2020/9/14 17:07
 */
public class DynamicSwitchCore {

    public static BeanFactory beanFactory;

    public static void dynamicSwitchDataSource(String url,String name,String password){
        SqlSessionFactory sessionFactory = beanFactory.getBean(SqlSessionFactory.class);
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(name);
        dataSource.setPassword(password);
        Configuration configuration = sessionFactory.getConfiguration();
        Environment environment = configuration.getEnvironment();
        Class<? extends Environment> aClass = environment.getClass();
        try {
            Field source = aClass.getDeclaredField("dataSource");
            source.setAccessible(true);
            source.set(environment,dataSource);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
