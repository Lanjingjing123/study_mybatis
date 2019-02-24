package com.csii.ljj;

import static org.junit.Assert.assertTrue;

import com.csii.ljj.mapper.UsersMapper;
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
import java.util.List;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static final Logger logger = LoggerFactory.getLogger(AppTest.class);

    @Test
    public void testSelect() throws IOException {

        logger.info("------------------------selectAllTest Begin------------------------------");
        // 1. 读取文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 2. 获取回话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 3. 获取回话
        SqlSession sqlSession =sqlSessionFactory.openSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        List<Users> users = usersMapper.selectAll();
        for (Users user:users) {
            System.out.println(user);
        }
        sqlSession.close();

        logger.info("------------------------selectAllTest End------------------------------");
    }
}
