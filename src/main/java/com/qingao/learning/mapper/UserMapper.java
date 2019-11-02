package com.qingao.learning.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qingao.learning.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author qingao
 * @date 2019/10/29 11:18
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
