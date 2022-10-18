package xyz.blueskyan.gulimall.product.dao;

import xyz.blueskyan.gulimall.product.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author blueskyan
 * @email yanshijie224@foxmail.com
 * @date 2022-10-02 21:56:51
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
