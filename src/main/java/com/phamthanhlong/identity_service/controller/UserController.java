package com.phamthanhlong.identity_service.controller;

import com.phamthanhlong.identity_service.dto.request.UserCreationRequest;
import com.phamthanhlong.identity_service.dto.request.UserUpdateRequest;
import com.phamthanhlong.identity_service.entity.User;
import com.phamthanhlong.identity_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    User createUser(@RequestBody UserCreationRequest request) {
        return userService.createUser(request);
    }

    @GetMapping
    List<User> showusers() {
        return userService.showUsers();
    }

    @GetMapping("/{userId}")
    User showUser(@PathVariable("userId") String userId) {
        return userService.showUser(userId);
    }

    @PutMapping("/{userId}")
    User updateUser(@PathVariable("userId") String userId,@RequestBody UserUpdateRequest request){
        return userService.updateUser(userId,request);
    }
    @DeleteMapping("/{userId}")
    void deleteUser(@PathVariable("userId") String userId) {
         userService.deleteUser(userId);
    }


}
