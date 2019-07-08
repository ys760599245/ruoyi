package com.ruoyi.wechats.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.wechats.domain.Employee;
import com.ruoyi.wechats.mapper.EmployeeMapper;
import com.ruoyi.wechats.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 美容店雇员 服务层实现
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService
{
	@Autowired
	private EmployeeMapper employeeMapper;

	/**
     * 查询美容店雇员信息
     * 
     * @param pkEid 美容店雇员ID
     * @return 美容店雇员信息
     */
    @Override
	public Employee selectEmployeeById(Long pkEid)
	{
	    return employeeMapper.selectEmployeeById(pkEid);
	}
	
	/**
     * 查询美容店雇员列表
     * 
     * @param employee 美容店雇员信息
     * @return 美容店雇员集合
     */
	@Override
	public List<Employee> selectEmployeeList(Employee employee)
	{
	    return employeeMapper.selectEmployeeList(employee);
	}
	
    /**
     * 新增美容店雇员
     * 
     * @param employee 美容店雇员信息
     * @return 结果
     */
	@Override
	public int insertEmployee(Employee employee)
	{
	    return employeeMapper.insertEmployee(employee);
	}
	
	/**
     * 修改美容店雇员
     * 
     * @param employee 美容店雇员信息
     * @return 结果
     */
	@Override
	public int updateEmployee(Employee employee)
	{
	    return employeeMapper.updateEmployee(employee);
	}

	/**
     * 删除美容店雇员对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteEmployeeByIds(String ids)
	{
		return employeeMapper.deleteEmployeeByIds(Convert.toStrArray(ids));
	}
	
}
