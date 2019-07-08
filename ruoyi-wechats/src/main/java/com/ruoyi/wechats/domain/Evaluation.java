package com.ruoyi.wechats.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 美容店的反馈建议表 sys_evaluation
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
public class Evaluation extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 订单评价ID */
	private Long pkEvId;
	/** 评价描述 */
	private String mark;
	/** 订单表 */
	private String fkOid;
	/** 评价等级 */
	private Integer level;
	/**  */
	private Long createId;
	/**  */
	private Long updateId;

	public void setPkEvId(Long pkEvId) 
	{
		this.pkEvId = pkEvId;
	}

	public Long getPkEvId() 
	{
		return pkEvId;
	}
	public void setMark(String mark) 
	{
		this.mark = mark;
	}

	public String getMark() 
	{
		return mark;
	}
	public void setFkOid(String fkOid) 
	{
		this.fkOid = fkOid;
	}

	public String getFkOid() 
	{
		return fkOid;
	}
	public void setLevel(Integer level) 
	{
		this.level = level;
	}

	public Integer getLevel() 
	{
		return level;
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
            .append("pkEvId", getPkEvId())
            .append("mark", getMark())
            .append("fkOid", getFkOid())
            .append("level", getLevel())
            .append("createId", getCreateId())
            .append("updateId", getUpdateId())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .toString();
    }
}
