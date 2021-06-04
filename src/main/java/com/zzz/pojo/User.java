package com.zzz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String username;
    private String name;
    private String password;
    private String phone;
    private String cardId;
    private Integer sex;
    private String address;

}
