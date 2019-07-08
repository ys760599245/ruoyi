package com.ruoyi.wechats.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 美容店雇员表 sys_employee
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
public class Employee extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 员工ID */
	private Long pkEid;
	/**  */
	private String name;
	/** 员工所在店铺ID */
	private Long fkSid;
	/** 0离开1正常3休息 */
	private Integer status;
	/** json格式存储员工技能[skill:{1,2,3,4}:] 对应技能表ID */
	private String skill;
	/** 员工描述 */
	private String mark;
	/** 图片地址 */
	private String image;
	/**  */
	private Long createId;
	/**  */
	private Long updateId;

	public void setPkEid(Long pkEid) 
	{
		this.pkEid = pkEid;
	}

	public Long getPkEid() 
	{
		return pkEid;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setFkSid(Long fkSid) 
	{
		this.fkSid = fkSid;
	}

	public Long getFkSid() 
	{
		return fkSid;
	}
	public void setStatus(Integer status) 
	{
		this.status = status;
	}

	public Integer getStatus() 
	{
		return status;
	}
	public void setSkill(String skill) 
	{
		this.skill = skill;
	}

	public String getSkill() 
	{
		return skill;
	}
	public void setMark(String mark) 
	{
		this.mark = mark;
	}

	public String getMark() 
	{
		return mark;
	}
	public void setImage(String image) 
	{
		this.image = image;
	}

	public String getImage() 
	{
		return image;
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
            .append("pkEid", getPkEid())
            .append("name", getName())
            .append("fkSid", getFkSid())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("skill", getSkill())
            .append("mark", getMark())
            .append("image", getImage())
            .append("createId", getCreateId())
            .append("updateId", getUpdateId())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
