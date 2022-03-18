package com.bobeneba.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ios
 * @version 1.0
 * @ClassName Student
 * @Description: TODO
 * @date 2022/3/17 下午4:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;
    private Teacher teacher;

}
