package xyz.blueskyan.gulimall.member.dao;

import xyz.blueskyan.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author blueskyan
 * @email yanshijie224@foxmail.com
 * @date 2022-08-31 16:49:20
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
