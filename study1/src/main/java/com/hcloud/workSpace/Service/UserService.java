package com.hcloud.workSpace.Service;

import com.hcloud.workSpace.Mapper.UserMapper;
import com.hcloud.workSpace.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/3/20.
 */
@Service
public class UserService {

   @Autowired
   private  UserMapper userMapper;

    public User findById(Long id){
        return userMapper.findById(id);
    }
}
