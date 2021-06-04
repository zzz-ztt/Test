package com.zzz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hero {

    private Integer id;
    private String cnName;
    private String enName;
    private String alias;
    private Integer sex;
    private String price;
    private String gps;
    private String place;

}
