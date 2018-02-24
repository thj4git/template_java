package com.thj.model;

public class UserBalanceWithdrawRequest {
    private Long id;

    private Long userId;

    private Integer num;

    private Long bankId;

    private Integer arriveType;

    private String arriveAccount;

    private String arriveAccountName;

    private String arriveTel;

    private Integer auditStatus;

    private String auditExplain;

    private Long adminUserId;

    private Integer tax;

    private Integer payNum;

    private Integer payStatus;

    private String payMemo;

    private Long lastTime;

    private Long createTime;
    
    private BVC bvc;

    
    public BVC getBvc() {
		return bvc;
	}

	public void setBvc(BVC bvc) {
		this.bvc = bvc;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public Integer getArriveType() {
        return arriveType;
    }

    public void setArriveType(Integer arriveType) {
        this.arriveType = arriveType;
    }

    public String getArriveAccount() {
        return arriveAccount;
    }

    public void setArriveAccount(String arriveAccount) {
        this.arriveAccount = arriveAccount;
    }

    public String getArriveAccountName() {
        return arriveAccountName;
    }

    public void setArriveAccountName(String arriveAccountName) {
        this.arriveAccountName = arriveAccountName;
    }

    public String getArriveTel() {
        return arriveTel;
    }

    public void setArriveTel(String arriveTel) {
        this.arriveTel = arriveTel;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getAuditExplain() {
        return auditExplain;
    }

    public void setAuditExplain(String auditExplain) {
        this.auditExplain = auditExplain;
    }

    public Long getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(Long adminUserId) {
        this.adminUserId = adminUserId;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public Integer getPayNum() {
        return payNum;
    }

    public void setPayNum(Integer payNum) {
        this.payNum = payNum;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayMemo() {
        return payMemo;
    }

    public void setPayMemo(String payMemo) {
        this.payMemo = payMemo;
    }

    public Long getLastTime() {
        return lastTime;
    }

    public void setLastTime(Long lastTime) {
        this.lastTime = lastTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}