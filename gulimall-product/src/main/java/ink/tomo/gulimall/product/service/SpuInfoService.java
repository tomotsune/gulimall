package ink.tomo.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.tomo.common.utils.PageUtils;
import ink.tomo.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author tomo
 * @email tomotsune@foxmail.com
 * @date 2021-06-20 20:17:11
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

