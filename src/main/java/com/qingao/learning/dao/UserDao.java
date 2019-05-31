package com.qingao.learning.dao;

import com.qingao.learning.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author qingao
 * @mail gao.qin@linkedcare.cn
 * @date 2019/5/31 13:50
 **/
@Repository
public interface UserDao extends JpaRepository<User,Long> {

    User findByName(String name);
}
