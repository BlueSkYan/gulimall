package xyz.blueskyan.gulimall.product.dao;

import xyz.blueskyan.gulimall.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author blueskyan
 * @email yanshijie224@foxmail.com
 * @date 2022-08-31 14:57:47
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
