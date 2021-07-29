package cn.est.mapper;
import  cn.est.pojo.MaintainOrder;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface MaintainOrderMapper {

	public MaintainOrder getMaintainOrderById(@Param(value = "id") Long id);

	public List<MaintainOrder>	getMaintainOrderListByMap(Map<String,Object> param);

	public Integer getMaintainOrderCountByMap(Map<String,Object> param);

	public Integer insertMaintainOrder(MaintainOrder maintainOrder);

	public Integer updateMaintainOrder(MaintainOrder maintainOrder);

	public Integer deleteMaintainOrderById(@Param(value = "id") Long id);

	public Integer batchDeleteMaintainOrder(Map<String,List<String>> params);

}
