package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private GreeterInterface greeter1;

    @Autowired
    @Qualifier(value = "friendlyGreeter")
    private GreeterInterface friendly;

    @Autowired(required = false)
    private NotABean notABean;

    @RequestMapping("/hello")
    public String hello() {
        return greeter1.greet();
    }

    @RequestMapping("/hellofriendly")
    public String helloFriendly() {
        return friendly.greet();
    }
}
