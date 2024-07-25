package com.example.crudexample.mapper;

import com.example.crudexample.domain.User;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from users ")
    List<User> findAll();

    @Select("select * from users where id = #{id}")
    User findById(Long id);

    @Insert("insert into users (name,email) values (#{name},#{email})")
    void insert(User user);

    @Update("update users set name=#{name},email =#{email}  where id = #{id}")
    void update(User user);

    @Delete("delete from users where id=#{id}")
    void delete(Long id);

}
