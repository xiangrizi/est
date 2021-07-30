package cn.est.mapper;
import  cn.est.pojo.Evaluate;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface EvaluateMapper {

	Evaluate getEvaluateById(@Param(value = "id") Long id);

	List<Evaluate>	getEvaluateListByMap(Map<String, Object> param);

	Integer getEvaluateCountByMap(Map<String, Object> param);

	Integer insert(Evaluate evaluate);

	Integer updateEvaluate(Evaluate evaluate);

	Integer deleteEvaluateById(@Param(value = "id") Long id);

	Integer batchDeleteEvaluate(Map<String, List<String>> params);

}
