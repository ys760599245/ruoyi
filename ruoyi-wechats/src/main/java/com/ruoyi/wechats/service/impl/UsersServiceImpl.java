package com.ruoyi.wechats.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.system.domain.Users;
import com.ruoyi.system.mapper.UsersMapper;
import com.ruoyi.system.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 美容的顾客 服务层实现
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
@Service
public class UsersServiceImpl implements IUsersService 
{
	@Autowired
	private UsersMapper usersMapper;

	/**
     * 查询美容的顾客信息
     * 
     * @param pkId 美容的顾客ID
     * @return 美容的顾客信息
     */
    @Override
	public Users selectUsersById(Long pkId)
	{
	    return usersMapper.selectUsersById(pkId);
	}
	
	/**
     * 查询美容的顾客列表
     * 
     * @param users 美容的顾客信息
     * @return 美容的顾客集合
     */
	@Override
	public List<Users> selectUsersList(Users users)
	{
	    return usersMapper.selectUsersList(users);
	}
	
    /**
     * 新增美容的顾客
     * 
     * @param users 美容的顾客信息
     * @return 结果
     */
	@Override
	public int insertUsers(Users users)
	{
	    return usersMapper.insertUsers(users);
	}
	
	/**
     * 修改美容的顾客
     * 
     * @param users 美容的顾客信息
     * @return 结果
     */
	@Override
	public int updateUsers(Users users)
	{
	    return usersMapper.updateUsers(users);
	}

	/**
     * 删除美容的顾客对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteUsersByIds(String ids)
	{
		return usersMapper.deleteUsersByIds(Convert.toStrArray(ids));
	}
	
}
