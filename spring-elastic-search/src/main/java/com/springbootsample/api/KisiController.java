package com.springbootsample.api;

import com.springbootsample.entity.Kisi;
import com.springbootsample.repository.KisiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/kisi")
public class KisiController {
    private final  KisiRepository kisiRepository;

    @PostConstruct
    public void init(){
        Kisi kisi=new Kisi();
        kisi.setAd("Semiha");
        kisi.setSoyad("Aydin");
        kisi.setAdres("Ankara");
        kisi.setId("SSS01");
        kisi.setDogumTarihi(Calendar.getInstance().getTime());
        kisiRepository.save(kisi);
    }

    @GetMapping("/{search}")
    public ResponseEntity<List<Kisi>> getKisi(@PathVariable String search) {
        List<Kisi> kisiler=kisiRepository.getByCustomQuery(search);
        return ResponseEntity.ok(kisiler);
    }
}
