package xyz.blueskyan.gulimall.ware.dao;

import xyz.blueskyan.gulimall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author blueskyan
 * @email yanshijie224@foxmail.com
 * @date 2022-08-31 17:04:18
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
