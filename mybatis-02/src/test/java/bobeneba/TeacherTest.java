package bobeneba;

import com.bobeneba.dao.StudentMapper;
import com.bobeneba.dao.TeacherMapper;
import com.bobeneba.dao.UserDao;
import com.bobeneba.pojo.Student;
import com.bobeneba.pojo.Teacher;
import com.bobeneba.pojo.TeacherA;
import com.bobeneba.pojo.User;
import com.bobeneba.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ios
 * @version 1.0
 * @ClassName TeacherTest
 * @Description: TODO
 * @date 2022/3/17 下午4:59
 */
public class TeacherTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
    }
    @Test
    public void getStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for(Student student1:student)
        System.out.println(student1);
    }
    @Test
    public void getTeacherA(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<TeacherA> teacherA = mapper.getTeacherA();
        for(TeacherA teacherA1:teacherA)
            System.out.println(teacherA1);
    }

    @Test
    public void getTeacherB(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        TeacherA teacherA = mapper.getTeacherB(1);

        System.out.println(teacherA);
    }

}
