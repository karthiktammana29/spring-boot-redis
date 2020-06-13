package com.kst.springbootredis.repository;

import com.kst.springbootredis.model.Details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class DetailsRepository {
    @Autowired
    private RedisTemplate<String, String> redisTemplate = new RedisTemplate<>();

    public String findOne(String Id){
        return redisTemplate.opsForValue().get(Id);
    }

    public void save(Details details){
        redisTemplate.opsForValue().set(details.getId(), details.getName());
    }



}
