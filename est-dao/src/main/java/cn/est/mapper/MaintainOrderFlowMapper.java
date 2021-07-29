package cn.est.mapper;
import  cn.est.pojo.MaintainOrderFlow;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface MaintainOrderFlowMapper {

	public MaintainOrderFlow getMaintainOrderFlowById(@Param(value = "id") Long id);

	public List<MaintainOrderFlow>	getMaintainOrderFlowListByMap(Map<String,Object> param);

	public Integer getMaintainOrderFlowCountByMap(Map<String,Object> param);

	public Integer insertMaintainOrderFlow(MaintainOrderFlow maintainOrderFlow);

	public Integer updateMaintainOrderFlow(MaintainOrderFlow maintainOrderFlow);

	public Integer deleteMaintainOrderFlowById(@Param(value = "id") Long id);

	public Integer batchDeleteMaintainOrderFlow(Map<String,List<String>> params);

}
