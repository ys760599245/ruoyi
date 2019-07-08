package com.ruoyi.wechats.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.system.domain.Skill;
import com.ruoyi.system.mapper.SkillMapper;
import com.ruoyi.system.service.ISkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 雇员技能 服务层实现
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
@Service
public class SkillServiceImpl implements ISkillService 
{
	@Autowired
	private SkillMapper skillMapper;

	/**
     * 查询雇员技能信息
     * 
     * @param pkSkillId 雇员技能ID
     * @return 雇员技能信息
     */
    @Override
	public Skill selectSkillById(Long pkSkillId)
	{
	    return skillMapper.selectSkillById(pkSkillId);
	}
	
	/**
     * 查询雇员技能列表
     * 
     * @param skill 雇员技能信息
     * @return 雇员技能集合
     */
	@Override
	public List<Skill> selectSkillList(Skill skill)
	{
	    return skillMapper.selectSkillList(skill);
	}
	
    /**
     * 新增雇员技能
     * 
     * @param skill 雇员技能信息
     * @return 结果
     */
	@Override
	public int insertSkill(Skill skill)
	{
	    return skillMapper.insertSkill(skill);
	}
	
	/**
     * 修改雇员技能
     * 
     * @param skill 雇员技能信息
     * @return 结果
     */
	@Override
	public int updateSkill(Skill skill)
	{
	    return skillMapper.updateSkill(skill);
	}

	/**
     * 删除雇员技能对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteSkillByIds(String ids)
	{
		return skillMapper.deleteSkillByIds(Convert.toStrArray(ids));
	}
	
}
