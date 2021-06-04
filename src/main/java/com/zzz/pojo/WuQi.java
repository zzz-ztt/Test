package com.zzz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WuQi {

    private Integer id;
    private String name;
    private String synthesis;
    private String price;
    private String reclaim;
    private String attribute;
    private String active;
    private String passive;

}
