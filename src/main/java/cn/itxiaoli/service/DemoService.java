package cn.itxiaoli.service;

import cn.itxiaoli.domain.Demo;
import cn.itxiaoli.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaoli
 * @className DemoService
 * @description:
 * @date 2021/12/15 1:13
 */
@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;


    public List<Demo> findAll(){
        return demoMapper.selectByExample(null);
    }
}
