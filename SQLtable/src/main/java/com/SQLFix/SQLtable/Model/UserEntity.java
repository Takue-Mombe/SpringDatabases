package com.SQLFix.SQLtable.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Table(name="Students")
@Entity(name = "postgres")
public class UserEntity {
    @Id
    private String  hitmail;
    private String name;
    private String surname;
    private String username;
    private String password;

}
