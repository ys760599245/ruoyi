package com.ruoyi.wechats.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.system.domain.Evaluation;
import com.ruoyi.system.mapper.EvaluationMapper;
import com.ruoyi.system.service.IEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 美容店的反馈建议 服务层实现
 * 
 * @author ruoyi
 * @date 2019-07-05
 */
@Service
public class EvaluationServiceImpl implements IEvaluationService 
{
	@Autowired
	private EvaluationMapper evaluationMapper;

	/**
     * 查询美容店的反馈建议信息
     * 
     * @param pkEvId 美容店的反馈建议ID
     * @return 美容店的反馈建议信息
     */
    @Override
	public Evaluation selectEvaluationById(Long pkEvId)
	{
	    return evaluationMapper.selectEvaluationById(pkEvId);
	}
	
	/**
     * 查询美容店的反馈建议列表
     * 
     * @param evaluation 美容店的反馈建议信息
     * @return 美容店的反馈建议集合
     */
	@Override
	public List<Evaluation> selectEvaluationList(Evaluation evaluation)
	{
	    return evaluationMapper.selectEvaluationList(evaluation);
	}
	
    /**
     * 新增美容店的反馈建议
     * 
     * @param evaluation 美容店的反馈建议信息
     * @return 结果
     */
	@Override
	public int insertEvaluation(Evaluation evaluation)
	{
	    return evaluationMapper.insertEvaluation(evaluation);
	}
	
	/**
     * 修改美容店的反馈建议
     * 
     * @param evaluation 美容店的反馈建议信息
     * @return 结果
     */
	@Override
	public int updateEvaluation(Evaluation evaluation)
	{
	    return evaluationMapper.updateEvaluation(evaluation);
	}

	/**
     * 删除美容店的反馈建议对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteEvaluationByIds(String ids)
	{
		return evaluationMapper.deleteEvaluationByIds(Convert.toStrArray(ids));
	}
	
}
