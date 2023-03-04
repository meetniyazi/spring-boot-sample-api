package com.api.APIDemoService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@RestController

public class DemoController {
    Logger logger = LogManager.;
    @GetMapping("/demo/api/{param}")
    public String getDemo(@PathVariable("param")String param){

        return "Demo API "+param;
    }

    @GetMapping("/demo/api/")
    public String getDemo2(){

        return "Demo API welcome";
    }

}
