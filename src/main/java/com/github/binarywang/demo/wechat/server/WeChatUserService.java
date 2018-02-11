package com.github.binarywang.demo.wechat.server;

import com.github.binarywang.demo.wechat.po.WeChatUserPo;

/** 
* @author qinkai 
* @date 2018年2月7日
*/

public interface WeChatUserService {

	void addOne(WeChatUserPo userPo);

	void updateUserStatus(String openId, String string);

	WeChatUserPo selectOne(String openId);

}
