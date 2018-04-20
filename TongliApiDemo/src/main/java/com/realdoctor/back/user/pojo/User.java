package com.realdoctor.back.user.pojo;

import java.util.Date;

import com.easyway.business.framework.json.annotion.NotJsonData;
import com.easyway.business.framework.pojo.BasePojo;

public class User extends BasePojo {
	private static final long serialVersionUID = 1L;
	private Long userId;
	private String userName;
	private String pwd;
	private String payPwd;
	private String realName;
	private String email;
	private String mobilePhone;
	private String idCard;
	private Date addTime;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@NotJsonData
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@NotJsonData
	public String getPayPwd() {
		return payPwd;
	}
	public void setPayPwd(String payPwd) {
		this.payPwd = payPwd;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	
	/**
	 * 扩展字段
	 */
	private String verifyCode;
    
	@NotJsonData
    public String getVerifyCode() {
        return verifyCode;
    }
    
    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }
}
