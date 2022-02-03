package com.springbootsample;


import com.springbootsample.entity.Kisi;
import com.springbootsample.repository.KisiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/kullanici")
public class KisiApi {
    @Autowired
    private KisiRepository userRepository;

    @PostConstruct
    public void init(){
        Kisi user=new Kisi();
        user.setId("1");
        user.setAd("Semiha");
        user.setSoyad("Aydin");
        userRepository.save(user);
    }

    @PostMapping
    public ResponseEntity<Kisi> add(@RequestBody Kisi user){
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping
    public ResponseEntity<List<Kisi>> getAllList(){
        return ResponseEntity.ok(userRepository.findAll());
    }
}
