package com.ruoyi.wechats.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 美容店配置表 sys_store
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
public class Store extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 店ID */
	private Long pkSid;
	/** 描述 */
	private Date mark;
	/** 店名字 */
	private Long sName;
	/** 店地址 */
	private String address;
	/**  */
	private Long createId;
	/**  */
	private Long updateId;

	public void setPkSid(Long pkSid) 
	{
		this.pkSid = pkSid;
	}

	public Long getPkSid() 
	{
		return pkSid;
	}
	public void setMark(Date mark) 
	{
		this.mark = mark;
	}

	public Date getMark() 
	{
		return mark;
	}
	public void setSName(Long sName) 
	{
		this.sName = sName;
	}

	public Long getSName() 
	{
		return sName;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getAddress() 
	{
		return address;
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
            .append("pkSid", getPkSid())
            .append("createTime", getCreateTime())
            .append("mark", getMark())
            .append("sName", getSName())
            .append("address", getAddress())
            .append("createId", getCreateId())
            .append("updateId", getUpdateId())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
