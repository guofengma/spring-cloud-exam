package com.huawei.l00379880.userservice.dao;


import com.huawei.l00379880.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by fangzhipeng on 2017/5/27.
 */

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
