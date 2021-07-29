package cn.est.mapper;
import  cn.est.pojo.Classify;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ClassifyMapper {

	public Classify getClassifyById(@Param(value = "id") Long id);

	public List<Classify>	getClassifyListByMap(Map<String,Object> param);

	public Integer getClassifyCountByMap(Map<String,Object> param);

	public Integer insertClassify(Classify classify);

	public Integer updateClassify(Classify classify);

	public Integer deleteClassifyById(@Param(value = "id") Long id);

	public Integer batchDeleteClassify(Map<String,List<String>> params);

}
