package com.ruoyi.wechats.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.system.domain.Headline;
import com.ruoyi.system.mapper.HeadlineMapper;
import com.ruoyi.system.service.IHeadlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 美容店头条 服务层实现
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
@Service
public class HeadlineServiceImpl implements IHeadlineService 
{
	@Autowired
	private HeadlineMapper headlineMapper;

	/**
     * 查询美容店头条信息
     * 
     * @param lineId 美容店头条ID
     * @return 美容店头条信息
     */
    @Override
	public Headline selectHeadlineById(Integer lineId)
	{
	    return headlineMapper.selectHeadlineById(lineId);
	}
	
	/**
     * 查询美容店头条列表
     * 
     * @param headline 美容店头条信息
     * @return 美容店头条集合
     */
	@Override
	public List<Headline> selectHeadlineList(Headline headline)
	{
	    return headlineMapper.selectHeadlineList(headline);
	}
	
    /**
     * 新增美容店头条
     * 
     * @param headline 美容店头条信息
     * @return 结果
     */
	@Override
	public int insertHeadline(Headline headline)
	{
	    return headlineMapper.insertHeadline(headline);
	}
	
	/**
     * 修改美容店头条
     * 
     * @param headline 美容店头条信息
     * @return 结果
     */
	@Override
	public int updateHeadline(Headline headline)
	{
	    return headlineMapper.updateHeadline(headline);
	}

	/**
     * 删除美容店头条对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteHeadlineByIds(String ids)
	{
		return headlineMapper.deleteHeadlineByIds(Convert.toStrArray(ids));
	}
	
}
