package com.ruoyi.wechats.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.system.domain.Order;
import com.ruoyi.system.mapper.OrderMapper;
import com.ruoyi.system.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 美容订单 服务层实现
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
@Service
public class OrderServiceImpl implements IOrderService 
{
	@Autowired
	private OrderMapper orderMapper;

	/**
     * 查询美容订单信息
     * 
     * @param pkOid 美容订单ID
     * @return 美容订单信息
     */
    @Override
	public Order selectOrderById(Long pkOid)
	{
	    return orderMapper.selectOrderById(pkOid);
	}
	
	/**
     * 查询美容订单列表
     * 
     * @param order 美容订单信息
     * @return 美容订单集合
     */
	@Override
	public List<Order> selectOrderList(Order order)
	{
	    return orderMapper.selectOrderList(order);
	}
	
    /**
     * 新增美容订单
     * 
     * @param order 美容订单信息
     * @return 结果
     */
	@Override
	public int insertOrder(Order order)
	{
	    return orderMapper.insertOrder(order);
	}
	
	/**
     * 修改美容订单
     * 
     * @param order 美容订单信息
     * @return 结果
     */
	@Override
	public int updateOrder(Order order)
	{
	    return orderMapper.updateOrder(order);
	}

	/**
     * 删除美容订单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteOrderByIds(String ids)
	{
		return orderMapper.deleteOrderByIds(Convert.toStrArray(ids));
	}
	
}
