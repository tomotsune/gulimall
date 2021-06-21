package ink.tomo.gulimall.product.dao;

import ink.tomo.gulimall.product.entity.ProductAttrValueEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * spu属性值
 * 
 * @author tomo
 * @email tomotsune@foxmail.com
 * @date 2021-06-20 20:17:12
 */
@Mapper
public interface ProductAttrValueDao extends BaseMapper<ProductAttrValueEntity> {
	
}
