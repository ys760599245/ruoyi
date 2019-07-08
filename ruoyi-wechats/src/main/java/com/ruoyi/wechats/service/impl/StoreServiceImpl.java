package com.ruoyi.wechats.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.system.domain.Store;
import com.ruoyi.system.mapper.StoreMapper;
import com.ruoyi.system.service.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 美容店配置 服务层实现
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
@Service
public class StoreServiceImpl implements IStoreService 
{
	@Autowired
	private StoreMapper storeMapper;

	/**
     * 查询美容店配置信息
     * 
     * @param pkSid 美容店配置ID
     * @return 美容店配置信息
     */
    @Override
	public Store selectStoreById(Long pkSid)
	{
	    return storeMapper.selectStoreById(pkSid);
	}
	
	/**
     * 查询美容店配置列表
     * 
     * @param store 美容店配置信息
     * @return 美容店配置集合
     */
	@Override
	public List<Store> selectStoreList(Store store)
	{
	    return storeMapper.selectStoreList(store);
	}
	
    /**
     * 新增美容店配置
     * 
     * @param store 美容店配置信息
     * @return 结果
     */
	@Override
	public int insertStore(Store store)
	{
	    return storeMapper.insertStore(store);
	}
	
	/**
     * 修改美容店配置
     * 
     * @param store 美容店配置信息
     * @return 结果
     */
	@Override
	public int updateStore(Store store)
	{
	    return storeMapper.updateStore(store);
	}

	/**
     * 删除美容店配置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteStoreByIds(String ids)
	{
		return storeMapper.deleteStoreByIds(Convert.toStrArray(ids));
	}
	
}
