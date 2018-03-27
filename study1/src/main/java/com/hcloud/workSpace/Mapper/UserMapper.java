package com.hcloud.workSpace.Mapper;

import com.hcloud.workSpace.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2018/3/20.
 */
@Mapper
public interface UserMapper {
    User findById(@Param("id") Long id);
}
