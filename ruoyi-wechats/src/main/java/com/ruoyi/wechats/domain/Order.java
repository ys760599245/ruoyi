package com.ruoyi.wechats.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 美容订单表 sys_order
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
public class Order extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 订单表ID */
	private Long pkOid;
	/** 用户ID */
	private Long fkUid;
	/** 预约服务{技能名字(英文):价格} */
	private String skillJson;
	/** 预约时间 */
	private Date reserveTime;
	/** 预约服务员工 */
	private Date fkEid;
	/** 消费总价 */
	private Date totalPrice;
	/**  */
	private Long createId;
	/**  */
	private Long updateId;

	public void setPkOid(Long pkOid) 
	{
		this.pkOid = pkOid;
	}

	public Long getPkOid() 
	{
		return pkOid;
	}
	public void setFkUid(Long fkUid) 
	{
		this.fkUid = fkUid;
	}

	public Long getFkUid() 
	{
		return fkUid;
	}
	public void setSkillJson(String skillJson) 
	{
		this.skillJson = skillJson;
	}

	public String getSkillJson() 
	{
		return skillJson;
	}
	public void setReserveTime(Date reserveTime) 
	{
		this.reserveTime = reserveTime;
	}

	public Date getReserveTime() 
	{
		return reserveTime;
	}
	public void setFkEid(Date fkEid) 
	{
		this.fkEid = fkEid;
	}

	public Date getFkEid() 
	{
		return fkEid;
	}
	public void setTotalPrice(Date totalPrice) 
	{
		this.totalPrice = totalPrice;
	}

	public Date getTotalPrice() 
	{
		return totalPrice;
	}
	public void setCreateId(Long createId) 
	{
		this.createId = createId;
	}

	public Long getCreateId() 
	{
		return createId;
	}
	public void setUpdateId(Long updateId) 
	{
		this.updateId = updateId;
	}

	public Long getUpdateId() 
	{
		return updateId;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkOid", getPkOid())
            .append("createTime", getCreateTime())
            .append("fkUid", getFkUid())
            .append("skillJson", getSkillJson())
            .append("reserveTime", getReserveTime())
            .append("fkEid", getFkEid())
            .append("totalPrice", getTotalPrice())
            .append("createId", getCreateId())
            .append("updateId", getUpdateId())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
