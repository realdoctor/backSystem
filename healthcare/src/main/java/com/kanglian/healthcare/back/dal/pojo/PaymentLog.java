package com.kanglian.healthcare.back.dal.pojo;

import java.util.Date;
import com.easyway.business.framework.pojo.BasePojo;

public class PaymentLog extends BasePojo {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String orderNo;
	private String from;
    private Integer userId;
	private Integer toUser;
	private String type;
	private Double money;
	private String mark;
	private String message;
	private String status;
    private Date addTime;
	private Date lastUpdateDtime;
	private String userName;
	private String toUserName;
	private String userPicUrl;
	private String toUserPicUrl;
    public String getUserPicUrl() {
        return userPicUrl;
    }
    public void setUserPicUrl(String userPicUrl) {
        this.userPicUrl = userPicUrl;
    }
    public String getToUserPicUrl() {
        return toUserPicUrl;
    }
    public void setToUserPicUrl(String toUserPicUrl) {
        this.toUserPicUrl = toUserPicUrl;
    }
    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getToUser() {
		return toUser;
	}
	public void setToUser(Integer toUser) {
		this.toUser = toUser;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public Date getLastUpdateDtime() {
		return lastUpdateDtime;
	}
	public void setLastUpdateDtime(Date lastUpdateDtime) {
		this.lastUpdateDtime = lastUpdateDtime;
	}
	public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getToUserName() {
        return toUserName;
    }
}
