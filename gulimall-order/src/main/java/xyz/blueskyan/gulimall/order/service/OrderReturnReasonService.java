package xyz.blueskyan.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.blueskyan.common.utils.PageUtils;
import xyz.blueskyan.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * ้่ดงๅๅ 
 *
 * @author blueskyan
 * @email yanshijie224@foxmail.com
 * @date 2022-08-31 16:59:30
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

