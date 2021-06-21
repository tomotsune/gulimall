package ink.tomo.gulimall.product.dao;

import ink.tomo.gulimall.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author tomo
 * @email tomotsune@foxmail.com
 * @date 2021-06-20 20:17:11
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
