package com.github.binarywang.demo.wechat.po;

import javax.persistence.*;

@Table(name = "wc_chat")
public class WeChatPo {
    /**
     * 自动匹配字符id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 匹配词汇
     */
    private String match;

    /**
     * 匹配内容
     */
    private String content;

    /**
     * 备用字段1
     */
    private String standby1;

    /**
     * 备用字段2
     */
    private String standby2;

    /**
     * 获取自动匹配字符id
     *
     * @return id - 自动匹配字符id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自动匹配字符id
     *
     * @param id 自动匹配字符id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取匹配词汇
     *
     * @return match - 匹配词汇
     */
    public String getMatch() {
        return match;
    }

    /**
     * 设置匹配词汇
     *
     * @param match 匹配词汇
     */
    public void setMatch(String match) {
        this.match = match;
    }

    /**
     * 获取匹配内容
     *
     * @return content - 匹配内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置匹配内容
     *
     * @param content 匹配内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取备用字段1
     *
     * @return standby1 - 备用字段1
     */
    public String getStandby1() {
        return standby1;
    }

    /**
     * 设置备用字段1
     *
     * @param standby1 备用字段1
     */
    public void setStandby1(String standby1) {
        this.standby1 = standby1;
    }

    /**
     * 获取备用字段2
     *
     * @return standby2 - 备用字段2
     */
    public String getStandby2() {
        return standby2;
    }

    /**
     * 设置备用字段2
     *
     * @param standby2 备用字段2
     */
    public void setStandby2(String standby2) {
        this.standby2 = standby2;
    }
}