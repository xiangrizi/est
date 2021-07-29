package cn.est.mapper;
import  cn.est.pojo.Model;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ModelMapper {

	public Model getModelById(@Param(value = "id") Long id);

	public List<Model>	getModelListByMap(Map<String,Object> param);

	public Integer getModelCountByMap(Map<String,Object> param);

	public Integer insertModel(Model model);

	public Integer updateModel(Model model);

	public Integer deleteModelById(@Param(value = "id") Long id);

	public Integer batchDeleteModel(Map<String,List<String>> params);

}
