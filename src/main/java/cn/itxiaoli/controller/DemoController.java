package cn.itxiaoli.controller;

import cn.itxiaoli.domain.Demo;
import cn.itxiaoli.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaoli
 * @className DemoController
 * @description:
 * @date 2021/12/13 20:55
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping("/findAll")
    public List<Demo> findAll(){
        return demoService.findAll();
    }

}
