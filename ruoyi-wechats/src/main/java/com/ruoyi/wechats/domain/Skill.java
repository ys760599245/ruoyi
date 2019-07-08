package com.ruoyi.wechats.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * 雇员技能表 sys_skill
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
public class Skill extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 技能id */
	private Long pkSkillId;
	/** 技能名字 */
	private String skillName;
	/** 价格 */
	private BigDecimal price;
	/** 技能类型Id */
	private Long fkTid;
	/** 技能状态 */
	private Integer status;
	/**  */
	private Long createId;
	/**  */
	private Long updateId;

	public void setPkSkillId(Long pkSkillId) 
	{
		this.pkSkillId = pkSkillId;
	}

	public Long getPkSkillId() 
	{
		return pkSkillId;
	}
	public void setSkillName(String skillName) 
	{
		this.skillName = skillName;
	}

	public String getSkillName() 
	{
		return skillName;
	}
	public void setPrice(BigDecimal price) 
	{
		this.price = price;
	}

	public BigDecimal getPrice() 
	{
		return price;
	}
	public void setFkTid(Long fkTid) 
	{
		this.fkTid = fkTid;
	}

	public Long getFkTid() 
	{
		return fkTid;
	}
	public void setStatus(Integer status) 
	{
		this.status = status;
	}

	public Integer getStatus() 
	{
		return status;
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
            .append("pkSkillId", getPkSkillId())
            .append("skillName", getSkillName())
            .append("price", getPrice())
            .append("fkTid", getFkTid())
            .append("createTime", getCreateTime())
            .append("status", getStatus())
            .append("createId", getCreateId())
            .append("updateId", getUpdateId())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
