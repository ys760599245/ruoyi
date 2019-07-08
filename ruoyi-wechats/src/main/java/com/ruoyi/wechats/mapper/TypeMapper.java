package com.ruoyi.wechats.mapper;


import com.ruoyi.wechats.domain.Type;

import java.util.List;

/**
 * 美容的类型 美发 美甲 保养 数据层
 *
 * @author ruoyi
 * @date 2019-07-05
 */
public interface TypeMapper {
    /**
     * 查询美容的类型 美发 美甲 保养信息
     *
     * @param pkTid 美容的类型 美发 美甲 保养ID
     * @return 美容的类型 美发 美甲 保养信息
     */
    public Type selectTypeById(Long pkTid);

    /**
     * 查询美容的类型 美发 美甲 保养列表
     *
     * @param type 美容的类型 美发 美甲 保养信息
     * @return 美容的类型 美发 美甲 保养集合
     */
    public List<Type> selectTypeList(Type type);

    /**
     * 新增美容的类型 美发 美甲 保养
     *
     * @param type 美容的类型 美发 美甲 保养信息
     * @return 结果
     */
    public int insertType(Type type);

    /**
     * 修改美容的类型 美发 美甲 保养
     *
     * @param type 美容的类型 美发 美甲 保养信息
     * @return 结果
     */
    public int updateType(Type type);

    /**
     * 删除美容的类型 美发 美甲 保养
     *
     * @param pkTid 美容的类型 美发 美甲 保养ID
     * @return 结果
     */
    public int deleteTypeById(Long pkTid);

    /**
     * 批量删除美容的类型 美发 美甲 保养
     *
     * @param pkTids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTypeByIds(String[] pkTids);

}