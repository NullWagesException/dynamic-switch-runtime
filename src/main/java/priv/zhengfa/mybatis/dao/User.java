package priv.zhengfa.mybatis.dao;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Tommy
 * Created by Tommy on 2019/6/27
 **/
@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private Date createTime;
    private Date updateTime;

    public User() {
    }

}
