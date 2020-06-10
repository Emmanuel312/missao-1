package com.emmanuel.microservice.controllers;


import com.emmanuel.microservice.models.Greeting;

import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private static final String template = "Hello %s";
    private final AtomicLong counter = new AtomicLong();

    @Value("${app.key}")
    private  String appKey;

    @ApiOperation(value="Returns a greeting")
    @GetMapping()
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name)
    {
        return new Greeting(counter.incrementAndGet(), String.format(template,name));
    }

    @ApiOperation(value="Return the key of the app")
    @GetMapping("/appKey")
    public Greeting getAppKey()
    {
        return new Greeting(counter.incrementAndGet(), String.format(template,appKey));
    }

}
