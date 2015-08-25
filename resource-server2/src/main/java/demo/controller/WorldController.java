package demo.controller;

import demo.client.Server1Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by iCoderc on 2015/8/25.
 */
@RestController
public class WorldController {
    @Autowired
    Server1Client client;

    @RequestMapping("/")
    public String hello() {
        return client.sayHello() + " world";
    }
}
