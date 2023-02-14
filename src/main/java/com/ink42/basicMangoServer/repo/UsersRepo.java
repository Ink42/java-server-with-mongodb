package com.ink42.basicMangoServer.repo;

import com.ink42.basicMangoServer.entity.userClass;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersRepo extends MongoRepository<userClass,String > {
    userClass findByUserName(String userName);
}
