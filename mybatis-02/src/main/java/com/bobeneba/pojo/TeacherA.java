package com.bobeneba.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author ios
 * @version 1.0
 * @ClassName TeacherA
 * @Description: TODO
 * @date 2022/3/17 下午10:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherA {
    private int id;
    private String name;
    private List<StudentA> student;

}
