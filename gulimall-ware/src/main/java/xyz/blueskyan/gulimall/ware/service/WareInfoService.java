package xyz.blueskyan.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.blueskyan.common.utils.PageUtils;
import xyz.blueskyan.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author blueskyan
 * @email yanshijie224@foxmail.com
 * @date 2022-08-31 17:04:18
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

