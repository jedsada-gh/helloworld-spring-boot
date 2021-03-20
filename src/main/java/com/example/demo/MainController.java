package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

class User {
    private String username;
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return this.username;
    }

    public int getAge() {
        return this.age;
    }
}

@RestController
public class MainController {

    @GetMapping("/hello-world")
    public User getHelloWorld(@RequestParam(name = "username", required = true) String username) {
        return new User(username, 1);
    }
}
