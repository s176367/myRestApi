package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private static final String template = "This is user, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/User")
    public User user (@RequestParam(value = "user", defaultValue = "World") String user) {
        return new User(counter.incrementAndGet(),
                String.format((template, user));
    }

}
