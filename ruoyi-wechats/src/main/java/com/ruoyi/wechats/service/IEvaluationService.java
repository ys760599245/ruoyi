package com.ruoyi.wechats.service;

import com.ruoyi.system.domain.Evaluation;

import java.util.List;

/**
 * 美容店的反馈建议 服务层
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
public interface IEvaluationService 
{
	/**
     * 查询美容店的反馈建议信息
     * 
     * @param pkEvId 美容店的反馈建议ID
     * @return 美容店的反馈建议信息
     */
	public Evaluation selectEvaluationById(Long pkEvId);
	
	/**
     * 查询美容店的反馈建议列表
     * 
     * @param evaluation 美容店的反馈建议信息
     * @return 美容店的反馈建议集合
     */
	public List<Evaluation> selectEvaluationList(Evaluation evaluation);
	
	/**
     * 新增美容店的反馈建议
     * 
     * @param evaluation 美容店的反馈建议信息
     * @return 结果
     */
	public int insertEvaluation(Evaluation evaluation);
	
	/**
     * 修改美容店的反馈建议
     * 
     * @param evaluation 美容店的反馈建议信息
     * @return 结果
     */
	public int updateEvaluation(Evaluation evaluation);
		
	/**
     * 删除美容店的反馈建议信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteEvaluationByIds(String ids);
	
}
