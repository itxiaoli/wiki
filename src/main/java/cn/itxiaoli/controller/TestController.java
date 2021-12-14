package cn.itxiaoli.controller;

import cn.itxiaoli.domain.Test;
import cn.itxiaoli.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaoli
 * @className TestController
 * @description:
 * @date 2021/12/13 20:55
 */
@RestController
public class TestController {

    @Resource
    private TestService testService;


    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }


    @GetMapping("/test/findAll")
    public List<Test> findAll(){
        return testService.findAll();
    }

}
