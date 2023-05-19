package com.amolsoftwares.www.ServerJaeger.controller;

import com.amolsoftwares.www.ServerJaeger.service.JaegerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/jaeger/server")
public class JaegerController {

    @Autowired
    JaegerService jaegerService;

    @GetMapping("/{id}")
    public String get(@PathVariable("id") Integer id) {
        return jaegerService.get(id);
    }
}