package luckyweb.seagull.spring.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import luckyweb.seagull.spring.entity.PlanFlowCheck;

/**
 * =================================================================
 * 这是一个受限制的自由软件！您不能在任何未经允许的前提下对程序代码进行修改和用于商业用途；也不允许对程序代码修改后以任何形式任何目的的再发布。
 * 为了尊重作者的劳动成果，LuckyFrame关键版权信息严禁篡改
 * 有任何疑问欢迎联系作者讨论。 QQ:1573584944  seagull1985
 * =================================================================
 * 
 * @author seagull
 */
@Transactional(rollbackFor = Exception.class)
public interface PlanFlowCheckDao {
	/**
	 * 增加流程检查计划
	 * @param pfc
	 * @return
	 * @throws Exception
	 */
	public int add(PlanFlowCheck pfc) throws Exception;
	/**
	 * 修改流程检查计划
	 * @param pfc
	 * @throws Exception
	 */
	public void modify(PlanFlowCheck pfc) throws Exception;
	/**
	 * 删除流程检查计划
	 * @param id
	 * @throws Exception
	 */
	public void delete(int id) throws Exception;
	/**
	 * 获取流程检查计划实体
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public PlanFlowCheck load(int id) throws Exception;
	/**
	 * 流程检查计划分页
	 * @param hql
	 * @param value
	 * @param offset
	 * @param pageSize
	 * @return
	 */
	public List findByPage(final String hql, final Object value,final int offset, final int pageSize);
	/**
	 * 流程检查计划分页条数
	 * @param pfc
	 * @param hql
	 * @return
	 */
	public int findRows(PlanFlowCheck pfc,String hql);
	/**
	 * 流程检查计划列表
	 * @param hql
	 * @return
	 * @throws Exception
	 */
	public List<PlanFlowCheck> list(String hql) throws Exception;
}
