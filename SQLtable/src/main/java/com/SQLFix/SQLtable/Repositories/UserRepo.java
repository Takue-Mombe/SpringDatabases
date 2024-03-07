package com.SQLFix.SQLtable.Repositories;

import com.SQLFix.SQLtable.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity,String> {

}
