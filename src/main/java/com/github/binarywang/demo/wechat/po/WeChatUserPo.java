package com.github.binarywang.demo.wechat.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "wc_user")
public class WeChatUserPo {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 微信openid
     */
    private String openid;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 1为男性，2为女性
     */
    private String sex;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 国家
     */
    private String country;

    /**
     * 头像
     */
    private String headimgurl;

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 积分数量
     */
    @Column(name = "integral_num")
    private Long integralNum;

    /**
     * 认证状态：1-成功；2-失败
     */
    @Column(name = "auth_status")
    private String authStatus;

    /**
     * 用户状态：1-正常；2-删除
     */
    @Column(name = "user_status")
    private String userStatus;

    /**
     * 证件类型
     */
    @Column(name = "card_type")
    private String cardType;

    /**
     * 证件号
     */
    @Column(name = "card_num")
    private String cardNum;

    /**
     * 手机号
     */
    private String phone;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 备用字段1
     */
    private String standby1;

    /**
     * 备用字段2
     */
    private String standby2;

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取微信openid
     *
     * @return openid - 微信openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置微信openid
     *
     * @param openid 微信openid
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取1为男性，2为女性
     *
     * @return sex - 1为男性，2为女性
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置1为男性，2为女性
     *
     * @param sex 1为男性，2为女性
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取省
     *
     * @return province - 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省
     *
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取头像
     *
     * @return headimgurl - 头像
     */
    public String getHeadimgurl() {
        return headimgurl;
    }

    /**
     * 设置头像
     *
     * @param headimgurl 头像
     */
    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    /**
     * 获取用户姓名
     *
     * @return username - 用户姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户姓名
     *
     * @param username 用户姓名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取积分数量
     *
     * @return integral_num - 积分数量
     */
    public Long getIntegralNum() {
        return integralNum;
    }

    /**
     * 设置积分数量
     *
     * @param integralNum 积分数量
     */
    public void setIntegralNum(Long integralNum) {
        this.integralNum = integralNum;
    }

    /**
     * 获取认证状态：1-成功；2-失败
     *
     * @return auth_status - 认证状态：1-成功；2-失败
     */
    public String getAuthStatus() {
        return authStatus;
    }

    /**
     * 设置认证状态：1-成功；2-失败
     *
     * @param authStatus 认证状态：1-成功；2-失败
     */
    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
    }

    /**
     * 获取用户状态：1-正常；2-删除
     *
     * @return user_status - 用户状态：1-正常；2-删除
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * 设置用户状态：1-正常；2-删除
     *
     * @param userStatus 用户状态：1-正常；2-删除
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 获取证件类型
     *
     * @return card_type - 证件类型
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * 设置证件类型
     *
     * @param cardType 证件类型
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * 获取证件号
     *
     * @return card_num - 证件号
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * 设置证件号
     *
     * @param cardNum 证件号
     */
    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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