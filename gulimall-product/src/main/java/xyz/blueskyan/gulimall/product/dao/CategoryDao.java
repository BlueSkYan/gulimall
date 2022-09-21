package xyz.blueskyan.gulimall.product.dao;

import xyz.blueskyan.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author blueskyan
 * @email yanshijie224@foxmail.com
 * @date 2022-08-31 14:57:47
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
