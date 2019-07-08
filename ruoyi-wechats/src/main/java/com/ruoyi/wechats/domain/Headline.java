package com.ruoyi.wechats.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 美容店头条表 sys_headline
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
public class Headline extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 头条主键 */
	private Integer lineId;
	/** 头条名字 */
	private String lineName;
	/** 头条链接 */
	private String lineLink;
	/** 头条图片 */
	private String lineImg;
	/** 头条创建时间 */
	private Date lineCreatedata;
	/** 头条的权重 {1,2,3} 权重越高就靠前 */
	private Integer linePriority;
	/** 启用1 废弃 0 */
	private Integer enableStatus;
	/** 创建人的id */
	private Integer createUser;

	public void setLineId(Integer lineId) 
	{
		this.lineId = lineId;
	}

	public Integer getLineId() 
	{
		return lineId;
	}
	public void setLineName(String lineName) 
	{
		this.lineName = lineName;
	}

	public String getLineName() 
	{
		return lineName;
	}
	public void setLineLink(String lineLink) 
	{
		this.lineLink = lineLink;
	}

	public String getLineLink() 
	{
		return lineLink;
	}
	public void setLineImg(String lineImg) 
	{
		this.lineImg = lineImg;
	}

	public String getLineImg() 
	{
		return lineImg;
	}
	public void setLineCreatedata(Date lineCreatedata) 
	{
		this.lineCreatedata = lineCreatedata;
	}

	public Date getLineCreatedata() 
	{
		return lineCreatedata;
	}
	public void setLinePriority(Integer linePriority) 
	{
		this.linePriority = linePriority;
	}

	public Integer getLinePriority() 
	{
		return linePriority;
	}
	public void setEnableStatus(Integer enableStatus) 
	{
		this.enableStatus = enableStatus;
	}

	public Integer getEnableStatus() 
	{
		return enableStatus;
	}
	public void setCreateUser(Integer createUser) 
	{
		this.createUser = createUser;
	}

	public Integer getCreateUser() 
	{
		return createUser;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("lineId", getLineId())
            .append("lineName", getLineName())
            .append("lineLink", getLineLink())
            .append("lineImg", getLineImg())
            .append("lineCreatedata", getLineCreatedata())
            .append("linePriority", getLinePriority())
            .append("enableStatus", getEnableStatus())
            .append("createUser", getCreateUser())
            .toString();
    }
}
