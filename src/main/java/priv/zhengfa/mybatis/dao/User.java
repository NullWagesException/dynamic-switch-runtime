package priv.zhengfa.mybatis.dao;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private Date createTime;
    private Date updateTime;

    public User() {
    }

}
