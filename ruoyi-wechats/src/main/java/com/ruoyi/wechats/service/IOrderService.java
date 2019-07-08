package com.ruoyi.wechats.service;

import com.ruoyi.system.domain.Order;

import java.util.List;

/**
 * 美容订单 服务层
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
public interface IOrderService 
{
	/**
     * 查询美容订单信息
     * 
     * @param pkOid 美容订单ID
     * @return 美容订单信息
     */
	public Order selectOrderById(Long pkOid);
	
	/**
     * 查询美容订单列表
     * 
     * @param order 美容订单信息
     * @return 美容订单集合
     */
	public List<Order> selectOrderList(Order order);
	
	/**
     * 新增美容订单
     * 
     * @param order 美容订单信息
     * @return 结果
     */
	public int insertOrder(Order order);
	
	/**
     * 修改美容订单
     * 
     * @param order 美容订单信息
     * @return 结果
     */
	public int updateOrder(Order order);
		
	/**
     * 删除美容订单信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrderByIds(String ids);
	
}
