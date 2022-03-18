package com.bobeneba.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ios
 * @version 1.0
 * @ClassName User
 * @Description: TODO
 * @date 2022/3/14 下午8:00
 */
@Data
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;
}
