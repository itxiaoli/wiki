package cn.itxiaoli.controller;

import cn.itxiaoli.req.EbookReq;
import cn.itxiaoli.resp.CommonResp;
import cn.itxiaoli.resp.EbookResp;
import cn.itxiaoli.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaoli
 * @className EbookController
 * @description:
 * @date 2021/12/13 20:55
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/findAll")
    public CommonResp findAll(EbookReq req) {
        List<EbookResp> list = ebookService.findAll(req);
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        resp.setContent(list);
        resp.setMessage("响应成功");
        return resp;
    }

}
