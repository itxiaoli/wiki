package cn.itxiaoli.mapper;
import cn.itxiaoli.domain.Test;

import java.util.List;

/**
 * @author xiaoli
 * @className TestMapper
 * @description:
 * @date 2021/12/15 1:03
 */
public interface TestMapper {

    List<Test> findAll();

}
