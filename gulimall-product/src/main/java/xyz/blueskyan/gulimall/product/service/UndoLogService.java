package xyz.blueskyan.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.blueskyan.common.utils.PageUtils;
import xyz.blueskyan.gulimall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author blueskyan
 * @email yanshijie224@foxmail.com
 * @date 2022-10-02 21:56:51
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

