package com.ruoyi.wechats.service;


import com.ruoyi.wechats.domain.Employee;

import java.util.List;

/**
 * 美容店雇员 服务层
 *
 * @author ruoyi
 * @date 2019-07-05
 */
public interface IEmployeeService {
    /**
     * 查询美容店雇员信息
     *
     * @param pkEid 美容店雇员ID
     * @return 美容店雇员信息
     */
    public Employee selectEmployeeById(Long pkEid);

    /**
     * 查询美容店雇员列表
     *
     * @param employee 美容店雇员信息
     * @return 美容店雇员集合
     */
    public List<Employee> selectEmployeeList(Employee employee);

    /**
     * 新增美容店雇员
     *
     * @param employee 美容店雇员信息
     * @return 结果
     */
    public int insertEmployee(Employee employee);

    /**
     * 修改美容店雇员
     *
     * @param employee 美容店雇员信息
     * @return 结果
     */
    public int updateEmployee(Employee employee);

    /**
     * 删除美容店雇员信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteEmployeeByIds(String ids);

}
