package com.ruoyi.wechats.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.wechats.domain.Type;
import com.ruoyi.wechats.mapper.TypeMapper;
import com.ruoyi.wechats.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 美容的类型 美发 美甲 保养 服务层实现
 *
 * @author ruoyi
 * @date 2019-07-05
 */
@Service
public class TypeServiceImpl implements ITypeService {
    @Autowired
    private TypeMapper typeMapper;

    /**
     * 查询美容的类型 美发 美甲 保养信息
     *
     * @param pkTid 美容的类型 美发 美甲 保养ID
     * @return 美容的类型 美发 美甲 保养信息
     */
    @Override
    public Type selectTypeById(Long pkTid) {
        return typeMapper.selectTypeById(pkTid);
    }

    /**
     * 查询美容的类型 美发 美甲 保养列表
     *
     * @param type 美容的类型 美发 美甲 保养信息
     * @return 美容的类型 美发 美甲 保养集合
     */
    @Override
    public List<Type> selectTypeList(Type type) {
        return typeMapper.selectTypeList(type);
    }

    /**
     * 新增美容的类型 美发 美甲 保养
     *
     * @param type 美容的类型 美发 美甲 保养信息
     * @return 结果
     */
    @Override
    public int insertType(Type type) {
        return typeMapper.insertType(type);
    }

    /**
     * 修改美容的类型 美发 美甲 保养
     *
     * @param type 美容的类型 美发 美甲 保养信息
     * @return 结果
     */
    @Override
    public int updateType(Type type) {
        return typeMapper.updateType(type);
    }

    /**
     * 删除美容的类型 美发 美甲 保养对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTypeByIds(String ids) {
        return typeMapper.deleteTypeByIds(Convert.toStrArray(ids));
    }

}
