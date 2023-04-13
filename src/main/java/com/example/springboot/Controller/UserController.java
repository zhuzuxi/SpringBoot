package com.example.springboot.Controller;

import com.example.springboot.Dao.UserDao;
import com.example.springboot.Entity.Json;
import com.example.springboot.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserDao userDao;
//    @GetMapping
//    public void hello(){
////        return new User("zzs","zzs");
//    }

    @PostMapping
    public void addUser(User user){
        userDao.addUser(user);
    }

    @DeleteMapping("/{username}")
    public void deleteUser(@PathVariable String username){
        userDao.deleteUser(username);
    }

    @PutMapping
    public void updateUser(User user){
        userDao.updateUser(user);
    }

    @PostMapping("/test")
    public void getUser(@RequestBody User user){
        System.out.println(user);

    }

    @GetMapping("/testhot")
    public String test(){
        return "test ok";
    }

//    @GetMapping()
}
