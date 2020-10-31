package com.paul.common.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @GetMapping(value = "/common")
    public String common(){
        return "common";
    }
}
