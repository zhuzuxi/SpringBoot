package com.example.springboot.Dao;

import com.example.springboot.Entity.User;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zzs
 * @since 2023-04-11
 */
@Mapper
public interface UserDao {
    @Select("select * from user")
    public ArrayList<User> getAllUsers();

    @Insert("insert into user values(#{username},#{password},#{address})")
    public void addUser(User user);


    @Delete("delete from user where username=#{username}")
    public int  deleteUser(String username);


    @Update("update user set password=#{password},address=#{address} where username=#{username}")
    public int updateUser(User user);

}
