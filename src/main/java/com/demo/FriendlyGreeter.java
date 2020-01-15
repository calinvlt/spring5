package com.demo;

import org.springframework.stereotype.Component;

@Component
public class FriendlyGreeter implements GreeterInterface {
    @Override
    public String greet() {
        return "Friendly greeting";
    }
}
