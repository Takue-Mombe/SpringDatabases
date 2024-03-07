package com.SQLFix.SQLtable.Controller;

import com.SQLFix.SQLtable.Model.UserEntity;
import com.SQLFix.SQLtable.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

    private final UserService userService;
    @Autowired
    public StudentController(UserService userService){
        this.userService=userService;
    }
    @PostMapping("/saveEntity")
    public void saveEntity(@RequestBody UserEntity userEntity){
        userService.saveEntity(userEntity);
    }


}
