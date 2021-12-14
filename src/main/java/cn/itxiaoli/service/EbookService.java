package cn.itxiaoli.service;

import cn.itxiaoli.domain.Ebook;
import cn.itxiaoli.domain.EbookExample;
import cn.itxiaoli.mapper.EbookMapper;
import cn.itxiaoli.req.EbookReq;
import cn.itxiaoli.resp.EbookResp;
import cn.itxiaoli.utils.CopyUtil;
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


    public List<EbookResp> findAll(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        return CopyUtil.copyList(ebookList, EbookResp.class);
    }
}
