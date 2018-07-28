package com.xx.bootdemo.ui;

import com.xx.bootdemo.entity.User;
import com.xx.bootdemo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/testuser")
public class UserTestController {


    @Autowired
    private UserServices userServices;

    @PostMapping("/add")
    public void add(User user) {
        this.userServices.add(user);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        this.userServices.delete(id);
    }

    @PutMapping("/update")
    public void update(User user) {
        this.userServices.update(user);
    }

    @GetMapping("/list")
    public List<User> list() {
        return this.userServices.list();
    }

    @GetMapping("/getById/{id}")
    public User getById(Integer id) {
        return this.userServices.getById(id);
    }
}
