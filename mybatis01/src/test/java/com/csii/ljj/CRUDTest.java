package com.csii.ljj;

import com.csii.ljj.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CRUDTest {
    private static final Logger logger = LoggerFactory.getLogger(CRUDTest.class);
    @Test

    public void selectAllTest() throws IOException {
        logger.info("------------------------selectAllTest Begin------------------------------");
        // 1. 读取文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        // 2. 获取回话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 3. 获取回话
        SqlSession sqlSession =sqlSessionFactory.openSession();
//        List<Users> users = sqlSession.selectList("com.csii.ljj.pojo.Users.selectAll");
        Users users = new Users();
        users.setUserid(12);
//       int i=  sqlSession.selectOne("com.csii.ljj.pojo.Users.selectOne",users);
         Map map = sqlSession.selectMap("com.csii.ljj.pojo.Users.selectAll","userid");
        System.out.println(map);
//        System.out.println("i= "+i);
        //4. 关闭回话
//        for (Users user:users) {
//            System.out.println(user);
//        }
        sqlSession.close();

        logger.info("------------------------selectAllTest End------------------------------");
    }

    @Test
    public void TsetInsert() throws IOException {
        // 3. 获取回话
        SqlSession sqlSession = this.getSqlSession();
        Users user = new Users();
        user.setUserName("HH");
        user.setUserage(23);
        // 4. 插入操作
        sqlSession.insert("com.csii.ljj.pojo.Users.insertUser",user);
//        sqlSession.commit();
        sqlSession.close();
    }


    public SqlSession getSqlSession() throws IOException {
        // 1. 读取文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        // 2. 获取回话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 3. 获取回话并返回
        return sqlSessionFactory.openSession();
    }
}
