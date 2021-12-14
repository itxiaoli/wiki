package cn.itxiaoli.service;

import cn.itxiaoli.domain.Ebook;
import cn.itxiaoli.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaoli
 * @className EbookService
 * @description:
 * @date 2021/12/15 1:13
 */
@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;


    public List<Ebook> findAll(){
        return ebookMapper.selectByExample(null);
    }
}
