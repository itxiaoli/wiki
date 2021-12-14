package cn.itxiaoli.controller;

import cn.itxiaoli.domain.Ebook;
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
    public List<Ebook> findAll(){
        return ebookService.findAll();
    }

}
