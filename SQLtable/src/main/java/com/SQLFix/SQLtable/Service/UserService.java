package com.SQLFix.SQLtable.Service;

import com.SQLFix.SQLtable.Model.UserEntity;
import com.SQLFix.SQLtable.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

private final UserRepo userRepo;
@Autowired
    public UserService(UserRepo userRepo1){
    this.userRepo=userRepo1;
}
public void saveEntity(UserEntity userEntity){
    userRepo.save(userEntity);
}
}
