package xyz.blueskyan.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.blueskyan.common.utils.PageUtils;
import xyz.blueskyan.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author blueskyan
 * @email yanshijie224@foxmail.com
 * @date 2022-08-31 16:49:20
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

