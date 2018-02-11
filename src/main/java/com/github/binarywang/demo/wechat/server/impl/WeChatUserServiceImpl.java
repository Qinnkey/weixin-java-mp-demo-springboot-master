package com.github.binarywang.demo.wechat.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.binarywang.demo.wechat.mapper.WeChatUserPoMapper;
import com.github.binarywang.demo.wechat.po.WeChatUserPo;
import com.github.binarywang.demo.wechat.server.WeChatUserService;

/** 
* @author qinkai 
* @date 2018年2月7日
*/
@Service
public class WeChatUserServiceImpl implements WeChatUserService{
	@Autowired
	private WeChatUserPoMapper userPoMapper;
	
	@Override
	public void addOne(WeChatUserPo userPo) {
		userPoMapper.insertSelective(userPo);
	}

	@Override
	public void updateUserStatus(String openId, String type) {
		userPoMapper.updateUserStatus(openId, type);
	}

	@Override
	public WeChatUserPo selectOne(String openId) {
		WeChatUserPo po = new WeChatUserPo();
		po.setOpenid(openId);
		return userPoMapper.selectOne(po);
	}

}
