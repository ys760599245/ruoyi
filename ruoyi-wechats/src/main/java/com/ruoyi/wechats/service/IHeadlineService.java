package com.ruoyi.wechats.service;

import com.ruoyi.system.domain.Headline;

import java.util.List;

/**
 * 美容店头条 服务层
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
public interface IHeadlineService 
{
	/**
     * 查询美容店头条信息
     * 
     * @param lineId 美容店头条ID
     * @return 美容店头条信息
     */
	public Headline selectHeadlineById(Integer lineId);
	
	/**
     * 查询美容店头条列表
     * 
     * @param headline 美容店头条信息
     * @return 美容店头条集合
     */
	public List<Headline> selectHeadlineList(Headline headline);
	
	/**
     * 新增美容店头条
     * 
     * @param headline 美容店头条信息
     * @return 结果
     */
	public int insertHeadline(Headline headline);
	
	/**
     * 修改美容店头条
     * 
     * @param headline 美容店头条信息
     * @return 结果
     */
	public int updateHeadline(Headline headline);
		
	/**
     * 删除美容店头条信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteHeadlineByIds(String ids);
	
}
