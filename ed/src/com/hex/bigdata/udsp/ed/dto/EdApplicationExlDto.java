package com.hex.bigdata.udsp.ed.dto;

import com.hex.bigdata.udsp.ed.model.EdApplication;

/**
 * Created by jc.zhao
 * Date:2018/1/6
 * Time:21:51
 */
public class EdApplicationExlDto {

    private String pkId;

    private String interfaceId;

    private String name;

    private String describe;

    private Long maxNum;

    private String delFlg;

    private String crtUser;

    private String crtTime;

    private String uptUser;

    private String uptTime;

    private String note;

    private String interfaceCode;

    private String interfaceName;

    private String isCheck;

    public String getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(String isCheck) {
        this.isCheck = isCheck;
    }

    public String getPkId() {
        return pkId;
    }

    public void setPkId(String pkId) {
        this.pkId = pkId;
    }

    public String getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Long getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Long maxNum) {
        this.maxNum = maxNum;
    }

    public String getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg;
    }

    public String getCrtUser() {
        return crtUser;
    }

    public void setCrtUser(String crtUser) {
        this.crtUser = crtUser;
    }

    public String getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(String crtTime) {
        this.crtTime = crtTime;
    }

    public String getUptUser() {
        return uptUser;
    }

    public void setUptUser(String uptUser) {
        this.uptUser = uptUser;
    }

    public String getUptTime() {
        return uptTime;
    }

    public void setUptTime(String uptTime) {
        this.uptTime = uptTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getInterfaceCode() {
        return interfaceCode;
    }

    public void setInterfaceCode(String interfaceCode) {
        this.interfaceCode = interfaceCode;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }
}
