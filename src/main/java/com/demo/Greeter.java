package com.demo;

import org.springframework.stereotype.Component;

@Component(value = "greeter1")
public class Greeter implements GreeterInterface {

    @Override
    public String greet() {
        return "greeter hello";
    }
}
