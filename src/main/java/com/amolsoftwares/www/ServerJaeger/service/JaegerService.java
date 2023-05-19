package com.amolsoftwares.www.ServerJaeger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JaegerService {

    @Autowired
    RestTemplate restTemplate;

    public String get(Integer id) {
        return restTemplate
                .getForObject("http://numberapi.com/"+id, String.class);
    }
}
