package com.github.binarywang.demo.wechat.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.binarywang.demo.wechat.mapper.WeChatPoMapper;
import com.github.binarywang.demo.wechat.po.WeChatPo;
import com.github.binarywang.demo.wechat.server.WeChatContentServer;

/** 
* @author qinkai 
* @date 2017年11月17日
*/
@Service
public class WeChatContentServerImpl implements WeChatContentServer {

	@Autowired
	WeChatPoMapper weChatPoMapper;
	@Override
	public WeChatPo matchContent(String content) {
//		WeChatPo weChatPo = new WeChatPo();
//		weChatPo.setMatch(content);
		return weChatPoMapper.findOne(content);
	}

}
