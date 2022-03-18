package bobeneba;

import com.bobeneba.dao.UserDao;
import com.bobeneba.pojo.User;
import com.bobeneba.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ios
 * @version 1.0
 * @ClassName UserDaoTest
 * @Description: TODO
 * @date 2022/3/14 下午9:14
 */
public class UserDaoTest {

    @Test
    public void test(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.getUserList();
        for(User user:userList){
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void getUserById(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();

    }

    @Test
    public void addUser(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int result = mapper.addUser(new User(10, "dengtao", "123"));
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void addMapUser(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("userId",8);
        map.put("userName","hello");
        map.put("passWord","2344556");
        int result = mapper.addMapUser(map);
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int result = mapper.updateUser(new User(6, "hhah", "123"));
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int result = mapper.deleteUser(6);
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }

}
