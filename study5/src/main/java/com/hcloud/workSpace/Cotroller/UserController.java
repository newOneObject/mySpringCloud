package com.hcloud.workSpace.Cotroller;


import com.hcloud.workSpace.Service.UserService;
import com.hcloud.workSpace.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/3/20.
 * 服务提供者
 */
@Controller
@RequestMapping("helloSpringCloud")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    @ResponseBody
    public User findById(@PathVariable Long id){

      return userService.findById(id);
  }
}
