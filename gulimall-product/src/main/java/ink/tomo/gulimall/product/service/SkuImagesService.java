package ink.tomo.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.tomo.common.utils.PageUtils;
import ink.tomo.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author tomo
 * @email tomotsune@foxmail.com
 * @date 2021-06-20 20:17:12
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

