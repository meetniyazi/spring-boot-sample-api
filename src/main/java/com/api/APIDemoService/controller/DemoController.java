package com.api.APIDemoService.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@RestController
@Slf4j
public class DemoController {

    @GetMapping("sample/api/{param}")
    public String getDemo(@PathVariable("param")String param){
        log.info("api with param :: {}",param);
        log.error("demos with param -error {}",param);
        return "API "+param;
    }

    @GetMapping("/demo/api/")
    public String getDemo2(){
        log.info("demos hello world");
        log.error("demos hello");
        return "Demo API welcome";
    }

}
