package ink.tomo.gulimall.product.dao;

import ink.tomo.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tomo
 * @email tomotsune@foxmail.com
 * @date 2021-06-20 20:17:13
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
