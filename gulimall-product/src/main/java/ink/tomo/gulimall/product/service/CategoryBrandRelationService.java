package ink.tomo.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.tomo.common.utils.PageUtils;
import ink.tomo.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author tomo
 * @email tomotsune@foxmail.com
 * @date 2021-06-20 20:17:13
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

