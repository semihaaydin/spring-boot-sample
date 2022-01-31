package com.springbootsample;


import com.springbootsample.entity.User;
import com.springbootsample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/kullanici")
public class UserApi {
    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init(){
        User user=new User();
        user.setId("1");
        user.setFirstName("Semiha");
        user.setLastName("Aydin");
        userRepository.save(user);
    }

    @PostMapping
    public ResponseEntity<User> add(@RequestBody User user){
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllList(){
        return ResponseEntity.ok(userRepository.findAll());
    }
}
