package cn.est.mapper;
import  cn.est.pojo.EvaluateDetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface EvaluateDetailMapper {

	public EvaluateDetail getEvaluateDetailById(@Param(value = "id") Long id);

	public List<EvaluateDetail>	getEvaluateDetailListByMap(Map<String,Object> param);

	public Integer getEvaluateDetailCountByMap(Map<String,Object> param);

	public Integer insertEvaluateDetail(EvaluateDetail evaluateDetail);

	public Integer updateEvaluateDetail(EvaluateDetail evaluateDetail);

	public Integer deleteEvaluateDetailById(@Param(value = "id") Long id);

	public Integer batchDeleteEvaluateDetail(Map<String,List<String>> params);

}
