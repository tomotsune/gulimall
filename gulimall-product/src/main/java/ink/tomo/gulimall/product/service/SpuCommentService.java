package ink.tomo.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.tomo.common.utils.PageUtils;
import ink.tomo.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author tomo
 * @email tomotsune@foxmail.com
 * @date 2021-06-20 20:17:11
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

