package com.github.binarywang.demo.wechat.server;

import com.github.binarywang.demo.wechat.po.WeChatPo;

/** 
* @author qinkai 
* @date 2017年11月17日
*/

public interface WeChatContentServer {

	// 返回匹配的内容
	WeChatPo matchContent(String content);

}
