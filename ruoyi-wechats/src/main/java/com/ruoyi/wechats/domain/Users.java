package com.ruoyi.wechats.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 美容的顾客表 sys_users
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
public class Users extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 用户主键 */
	private Long pkId;
	/**  */
	private String name;
	/**  */
	private String phone;
	/** 1是男0是女 */
	private Integer sex;
	/**  */
	private String address;
	/**  */
	private Long createId;
	/**  */
	private Long updateId;

	public void setPkId(Long pkId) 
	{
		this.pkId = pkId;
	}

	public Long getPkId() 
	{
		return pkId;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getPhone() 
	{
		return phone;
	}
	public void setSex(Integer sex) 
	{
		this.sex = sex;
	}

	public Integer getSex() 
	{
		return sex;
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
            .append("pkId", getPkId())
            .append("name", getName())
            .append("phone", getPhone())
            .append("sex", getSex())
            .append("address", getAddress())
            .append("createTime", getCreateTime())
            .append("createId", getCreateId())
            .append("updateId", getUpdateId())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
