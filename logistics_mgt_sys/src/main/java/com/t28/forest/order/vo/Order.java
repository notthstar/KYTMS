/**
 * @description 订单管理
 * @author lcy
 * @create 2019/11/1
 * @since 1.0.0
 */
package com.t28.forest.order.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.sql.Date;

public class Order {
    @TableId(value = "ID", type = IdType.AUTO)
    private String id;

    private String organizatilName;

    @TableField("CODE")
    private String code;

    @TableField("RELATEBILL1")
    private String relatebill1;

    @TableField("RELATEBILL2")
    private String relatebill2;

    @TableField("TIME")
    private Date time;

    @TableField("STATUS")
    private Integer status;

    @TableField("COSTOMER_TYPE")
    private Integer costomerType;

    @TableField("IS_TAKE")
    private Integer isTake;

    @TableField("COSTOMER_NAME")
    private String costomerName;

    @TableField("FEE_TYEP")
    private Integer feeTyep;

    @TableField("IS_INOUTCOME")
    private Integer isInoutcome;

    private String zone7Name;

    private String zone9Name;

    @TableField("HANDOVER_TYPE")
    private Integer handoverType;

    private String orderproduNAME;

    private Integer sumAmount;

    @TableField("NUMBER")
    private Integer number;

    @TableField("WEIGHT")
    private Double weight;

    @TableField("VOLUME")
    private Double volume;

    @TableField("JZ_WEIGHT")
    private Double jzWeight;

    @TableField("FACT_ARRIVE_TIME")
    private Date factArriveTime;

    @TableField("COSTOMER_IS_EXCEED")
    private Integer costomerIsExceed;

    @TableField("SALE_PERSION")
    private String salePersion;

    @TableField("TRANSPORT_PRO")
    private Integer transportPro;

    @TableField("IS_BACK")
    private Integer isBack;

    @TableField("BACK_NUMBER")
    private Integer backNumber;

    private String zonestorer4Name;

    @TableField("ORDER_MILEAGE")
    private Double orderMileage;

    @TableField("DESCRIPTION")
    private String description;

    @TableField("CREATE_NAME")
    private String createName;

    @TableField("CREATE_TIME")
    private Date createTime;

    @TableField("MODIFY_NAME")
    private String modifyName;

    @TableField("MODIFY_TIME")
    private Date modifyTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganizatilName() {
        return organizatilName;
    }

    public void setOrganizatilName(String organizatilName) {
        this.organizatilName = organizatilName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRelatebill1() {
        return relatebill1;
    }

    public void setRelatebill1(String relatebill1) {
        this.relatebill1 = relatebill1;
    }

    public String getRelatebill2() {
        return relatebill2;
    }

    public void setRelatebill2(String relatebill2) {
        this.relatebill2 = relatebill2;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCostomerType() {
        return costomerType;
    }

    public void setCostomerType(Integer costomerType) {
        this.costomerType = costomerType;
    }

    public Integer getIsTake() {
        return isTake;
    }

    public void setIsTake(Integer isTake) {
        this.isTake = isTake;
    }

    public String getCostomerName() {
        return costomerName;
    }

    public void setCostomerName(String costomerName) {
        this.costomerName = costomerName;
    }

    public Integer getFeeTyep() {
        return feeTyep;
    }

    public void setFeeTyep(Integer feeTyep) {
        this.feeTyep = feeTyep;
    }

    public Integer getIsInoutcome() {
        return isInoutcome;
    }

    public void setIsInoutcome(Integer isInoutcome) {
        this.isInoutcome = isInoutcome;
    }

    public String getZone7Name() {
        return zone7Name;
    }

    public void setZone7Name(String zone7Name) {
        this.zone7Name = zone7Name;
    }

    public String getZone9Name() {
        return zone9Name;
    }

    public void setZone9Name(String zone9Name) {
        this.zone9Name = zone9Name;
    }

    public Integer getHandoverType() {
        return handoverType;
    }

    public void setHandoverType(Integer handoverType) {
        this.handoverType = handoverType;
    }

    public String getOrderproduNAME() {
        return orderproduNAME;
    }

    public void setOrderproduNAME(String orderproduNAME) {
        this.orderproduNAME = orderproduNAME;
    }

    public Integer getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(Integer sumAmount) {
        this.sumAmount = sumAmount;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getJzWeight() {
        return jzWeight;
    }

    public void setJzWeight(Double jzWeight) {
        this.jzWeight = jzWeight;
    }

    public Date getFactArriveTime() {
        return factArriveTime;
    }

    public void setFactArriveTime(Date factArriveTime) {
        this.factArriveTime = factArriveTime;
    }

    public Integer getCostomerIsExceed() {
        return costomerIsExceed;
    }

    public void setCostomerIsExceed(Integer costomerIsExceed) {
        this.costomerIsExceed = costomerIsExceed;
    }

    public String getSalePersion() {
        return salePersion;
    }

    public void setSalePersion(String salePersion) {
        this.salePersion = salePersion;
    }

    public Integer getTransportPro() {
        return transportPro;
    }

    public void setTransportPro(Integer transportPro) {
        this.transportPro = transportPro;
    }

    public Integer getIsBack() {
        return isBack;
    }

    public void setIsBack(Integer isBack) {
        this.isBack = isBack;
    }

    public Integer getBackNumber() {
        return backNumber;
    }

    public void setBackNumber(Integer backNumber) {
        this.backNumber = backNumber;
    }

    public String getZonestorer4Name() {
        return zonestorer4Name;
    }

    public void setZonestorer4Name(String zonestorer4Name) {
        this.zonestorer4Name = zonestorer4Name;
    }

    public Double getOrderMileage() {
        return orderMileage;
    }

    public void setOrderMileage(Double orderMileage) {
        this.orderMileage = orderMileage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyName() {
        return modifyName;
    }

    public void setModifyName(String modifyName) {
        this.modifyName = modifyName;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", organizatilName='" + organizatilName + '\'' +
                ", code='" + code + '\'' +
                ", relatebill1='" + relatebill1 + '\'' +
                ", relatebill2='" + relatebill2 + '\'' +
                ", time=" + time +
                ", status=" + status +
                ", costomerType=" + costomerType +
                ", isTake=" + isTake +
                ", costomerName='" + costomerName + '\'' +
                ", feeTyep=" + feeTyep +
                ", isInoutcome=" + isInoutcome +
                ", zone7Name='" + zone7Name + '\'' +
                ", zone9Name='" + zone9Name + '\'' +
                ", handoverType=" + handoverType +
                ", orderproduNAME='" + orderproduNAME + '\'' +
                ", sumAmount=" + sumAmount +
                ", number=" + number +
                ", weight=" + weight +
                ", volume=" + volume +
                ", jzWeight=" + jzWeight +
                ", factArriveTime=" + factArriveTime +
                ", costomerIsExceed=" + costomerIsExceed +
                ", salePersion='" + salePersion + '\'' +
                ", transportPro=" + transportPro +
                ", isBack=" + isBack +
                ", backNumber=" + backNumber +
                ", zonestorer4Name='" + zonestorer4Name + '\'' +
                ", orderMileage=" + orderMileage +
                ", description='" + description + '\'' +
                ", createName='" + createName + '\'' +
                ", createTime=" + createTime +
                ", modifyName='" + modifyName + '\'' +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
