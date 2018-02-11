package com.github.binarywang.demo.wechat.mapper;

import org.apache.ibatis.annotations.Param;

import com.github.binarywang.demo.wechat.po.WeChatPo;
import com.github.binarywang.demo.wechat.utils.MyMapper;

public interface WeChatPoMapper extends MyMapper<WeChatPo> {

	WeChatPo findOne(@Param("content")String content);
}