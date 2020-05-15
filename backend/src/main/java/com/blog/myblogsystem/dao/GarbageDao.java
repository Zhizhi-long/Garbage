package com.blog.myblogsystem.dao;

import com.blog.myblogsystem.entity.Garbage;
import com.blog.myblogsystem.entity.User;
import com.sun.management.GarbageCollectorMXBean;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface GarbageDao {
    //返回垃圾品类信息
     List<Garbage> getGarbage(Garbage garbage);
//    void DeleteUser(User user);
//    void UpdateUser(User user);
//    void insertUser(User user);
//    List<User> getUser(User user);
//
//    @Select("select * from User where ID=#{ID} and password=#{password}")
//    List<User> passwordCheck(User user);
}
