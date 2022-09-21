package xyz.blueskyan.gulimall.coupon.dao;

import xyz.blueskyan.gulimall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author blueskyan
 * @email yanshijie224@foxmail.com
 * @date 2022-08-31 16:46:13
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
