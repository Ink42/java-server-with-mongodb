package com.ink42.basicMangoServer.controller;

import com.ink42.basicMangoServer.entity.userClass;
import com.ink42.basicMangoServer.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/user")
public class userController {
    @Autowired
    UserService userService;


    @PostMapping
    public userClass storeUserData(userClass user){
        return userService.storeUserData(user);
    }

    @GetMapping("/{userName}")
    public  userClass fetchUsingUserName(@PathVariable  String userName){
        return userService.fetchUsingUserName(userName);
    }
    @GetMapping
    public List<userClass> fetchAllUsers(){
        return userService.fetchAllUsers();
    }
    @DeleteMapping
    public  void clearUsingUserName(String userName){
        userService.clearUsingUserName(userName);
    }
    @DeleteMapping
    public void clearDB(){
        userService.clearDB();
    }
}
