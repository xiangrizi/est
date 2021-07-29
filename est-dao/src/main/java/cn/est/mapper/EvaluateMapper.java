package cn.est.mapper;
import  cn.est.pojo.Evaluate;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface EvaluateMapper {

	public Evaluate getEvaluateById(@Param(value = "id") Long id);

	public List<Evaluate>	getEvaluateListByMap(Map<String,Object> param);

	public Integer getEvaluateCountByMap(Map<String,Object> param);

	public Integer insertEvaluate(Evaluate evaluate);

	public Integer updateEvaluate(Evaluate evaluate);

	public Integer deleteEvaluateById(@Param(value = "id") Long id);

	public Integer batchDeleteEvaluate(Map<String,List<String>> params);

}
