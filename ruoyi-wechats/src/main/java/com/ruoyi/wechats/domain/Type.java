package com.ruoyi.wechats.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 美容的类型 美发 美甲 保养表 sys_type
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
public class Type extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 技能类型id */
	private Long pkTid;
	/** 类别名称 */
	private String typeName;
	/**  */
	private Long createId;
	/**  */
	private Long updateId;

	public void setPkTid(Long pkTid) 
	{
		this.pkTid = pkTid;
	}

	public Long getPkTid() 
	{
		return pkTid;
	}
	public void setTypeName(String typeName) 
	{
		this.typeName = typeName;
	}

	public String getTypeName() 
	{
		return typeName;
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
            .append("pkTid", getPkTid())
            .append("typeName", getTypeName())
            .append("createTime", getCreateTime())
            .append("createId", getCreateId())
            .append("updateId", getUpdateId())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
