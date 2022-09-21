package xyz.blueskyan.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.blueskyan.common.utils.PageUtils;
import xyz.blueskyan.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author blueskyan
 * @email yanshijie224@foxmail.com
 * @date 2022-08-31 16:49:20
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

