package io.github.misterbug5.mywebsite;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Api {

    @RequestMapping(value = "test", produces = "application/json")
    public String test() {
        return "{\"response\":\"ok\", \"errors\":[]}";
    }
}
