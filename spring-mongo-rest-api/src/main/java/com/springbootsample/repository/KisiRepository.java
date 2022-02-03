package com.springbootsample.repository;

import com.springbootsample.entity.Kisi;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KisiRepository extends MongoRepository<Kisi,String> {

}
