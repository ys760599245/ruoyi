package com.ruoyi.wechats.mapper;

import com.ruoyi.wechats.domain.Skill;

import java.util.List;

/**
 * 雇员技能 数据层
 *
 * @author ruoyi
 * @date 2019-07-05
 */
public interface SkillMapper {
    /**
     * 查询雇员技能信息
     *
     * @param pkSkillId 雇员技能ID
     * @return 雇员技能信息
     */
    public Skill selectSkillById(Long pkSkillId);

    /**
     * 查询雇员技能列表
     *
     * @param skill 雇员技能信息
     * @return 雇员技能集合
     */
    public List<Skill> selectSkillList(Skill skill);

    /**
     * 新增雇员技能
     *
     * @param skill 雇员技能信息
     * @return 结果
     */
    public int insertSkill(Skill skill);

    /**
     * 修改雇员技能
     *
     * @param skill 雇员技能信息
     * @return 结果
     */
    public int updateSkill(Skill skill);

    /**
     * 删除雇员技能
     *
     * @param pkSkillId 雇员技能ID
     * @return 结果
     */
    public int deleteSkillById(Long pkSkillId);

    /**
     * 批量删除雇员技能
     *
     * @param pkSkillIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSkillByIds(String[] pkSkillIds);

}