package cn.itxiaoli.service;

import cn.itxiaoli.domain.Test;
import cn.itxiaoli.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaoli
 * @className TestService
 * @description:
 * @date 2021/12/15 1:13
 */
@Service
public class TestService {

    @Resource
    private TestMapper testMapper;


    public List<Test> findAll(){
        return testMapper.findAll();
    }
}
