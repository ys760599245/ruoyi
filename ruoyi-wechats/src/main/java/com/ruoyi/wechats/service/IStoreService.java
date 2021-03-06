package com.ruoyi.wechats.service;

import com.ruoyi.system.domain.Store;

import java.util.List;

/**
 * 美容店配置 服务层
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
public interface IStoreService 
{
	/**
     * 查询美容店配置信息
     * 
     * @param pkSid 美容店配置ID
     * @return 美容店配置信息
     */
	public Store selectStoreById(Long pkSid);
	
	/**
     * 查询美容店配置列表
     * 
     * @param store 美容店配置信息
     * @return 美容店配置集合
     */
	public List<Store> selectStoreList(Store store);
	
	/**
     * 新增美容店配置
     * 
     * @param store 美容店配置信息
     * @return 结果
     */
	public int insertStore(Store store);
	
	/**
     * 修改美容店配置
     * 
     * @param store 美容店配置信息
     * @return 结果
     */
	public int updateStore(Store store);
		
	/**
     * 删除美容店配置信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteStoreByIds(String ids);
	
}
