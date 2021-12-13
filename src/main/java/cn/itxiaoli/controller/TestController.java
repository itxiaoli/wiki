package cn.itxiaoli.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoli
 * @className TestController
 * @description:
 * @date 2021/12/13 20:55
 */
@RestController
public class TestController {


    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
