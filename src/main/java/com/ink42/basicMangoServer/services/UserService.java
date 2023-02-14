package com.ink42.basicMangoServer.services;


import com.ink42.basicMangoServer.entity.userClass;
import com.ink42.basicMangoServer.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
   UsersRepo usersRepo;

public userClass storeUserData(userClass user){
    return usersRepo.save(user);
}


public  userClass fetchUsingUserName(String userName){
    return usersRepo.findByUserName(userName);
}

public List<userClass> fetchAllUsers(){
    return usersRepo.findAll();
}
public  void clearUsingUserName(String userName){
    usersRepo.deleteById(userName);
}
public void clearDB(){
    usersRepo.deleteAll();
}
}
