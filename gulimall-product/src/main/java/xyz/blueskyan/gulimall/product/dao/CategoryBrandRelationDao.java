package xyz.blueskyan.gulimall.product.dao;

import org.apache.ibatis.annotations.Param;
import xyz.blueskyan.gulimall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author blueskyan
 * @email yanshijie224@foxmail.com
 * @date 2022-08-31 14:57:47
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {

    void updateCategory(@Param("catId") Long catId, @Param("name") String name);
}
