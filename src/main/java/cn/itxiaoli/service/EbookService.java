package cn.itxiaoli.service;

import cn.itxiaoli.domain.Ebook;
import cn.itxiaoli.domain.EbookExample;
import cn.itxiaoli.mapper.EbookMapper;
import cn.itxiaoli.req.EbookReq;
import cn.itxiaoli.resp.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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


    public List<EbookResp> findAll(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        List<EbookResp> respList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook, ebookResp);
            respList.add(ebookResp);
        }
        return respList;
    }
}
