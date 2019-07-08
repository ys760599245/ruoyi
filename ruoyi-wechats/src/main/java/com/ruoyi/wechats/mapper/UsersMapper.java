package com.ruoyi.wechats.mapper;


import com.ruoyi.wechats.domain.Users;

import java.util.List;

/**
 * 美容的顾客 数据层
 *
 * @author ruoyi
 * @date 2019-07-05
 */
public interface UsersMapper {
    /**
     * 查询美容的顾客信息
     *
     * @param pkId 美容的顾客ID
     * @return 美容的顾客信息
     */
    public Users selectUsersById(Long pkId);

    /**
     * 查询美容的顾客列表
     *
     * @param users 美容的顾客信息
     * @return 美容的顾客集合
     */
    public List<Users> selectUsersList(Users users);

    /**
     * 新增美容的顾客
     *
     * @param users 美容的顾客信息
     * @return 结果
     */
    public int insertUsers(Users users);

    /**
     * 修改美容的顾客
     *
     * @param users 美容的顾客信息
     * @return 结果
     */
    public int updateUsers(Users users);

    /**
     * 删除美容的顾客
     *
     * @param pkId 美容的顾客ID
     * @return 结果
     */
    public int deleteUsersById(Long pkId);

    /**
     * 批量删除美容的顾客
     *
     * @param pkIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteUsersByIds(String[] pkIds);

}