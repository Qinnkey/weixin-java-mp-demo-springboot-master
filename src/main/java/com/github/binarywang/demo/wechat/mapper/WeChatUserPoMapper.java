package com.github.binarywang.demo.wechat.mapper;

import org.apache.ibatis.annotations.Param;

import com.github.binarywang.demo.wechat.po.WeChatUserPo;
import com.github.binarywang.demo.wechat.utils.MyMapper;

public interface WeChatUserPoMapper extends MyMapper<WeChatUserPo> {

	void addOne(WeChatUserPo userPo);

	void updateUserStatus(@Param("openId")String openId, @Param("type")String type);
}