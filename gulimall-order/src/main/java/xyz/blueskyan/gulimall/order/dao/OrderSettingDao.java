package xyz.blueskyan.gulimall.order.dao;

import xyz.blueskyan.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author blueskyan
 * @email yanshijie224@foxmail.com
 * @date 2022-08-31 16:59:30
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
