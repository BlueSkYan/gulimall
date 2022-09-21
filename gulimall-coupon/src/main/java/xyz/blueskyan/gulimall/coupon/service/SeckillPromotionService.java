package xyz.blueskyan.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.blueskyan.common.utils.PageUtils;
import xyz.blueskyan.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author blueskyan
 * @email yanshijie224@foxmail.com
 * @date 2022-08-31 16:46:13
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

