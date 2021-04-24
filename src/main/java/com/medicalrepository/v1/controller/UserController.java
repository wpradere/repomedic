package com.medicalrepository.v1.controller;


import com.medicalrepository.v1.entity.User;
import com.medicalrepository.v1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/all")
    public List<User> findall(){
        return userService.findAll();
    }


    @PostMapping("/user/")
    public User saveCuenta (@RequestBody User user){
        userService.save(user);
        return user;
    }

    @DeleteMapping("/delete-user/{id}")
    public String delete ( @PathVariable Long id){
        String resp;

        User cuentaEntidad= userService.findOne(id);
        if (cuentaEntidad !=null){
            userService.delete(id);
            resp = "done";
        }else {
            resp = "no exist";
        }
        return resp;
    }

    @PutMapping("/update-user/")
    public User update(@RequestBody User user){
        userService.save(user);
        return  user;


    }
}
