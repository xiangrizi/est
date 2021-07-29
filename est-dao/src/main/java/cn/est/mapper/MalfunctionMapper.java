package cn.est.mapper;
import  cn.est.pojo.Malfunction;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface MalfunctionMapper {

	public Malfunction getMalfunctionById(@Param(value = "id") Long id);

	public List<Malfunction>	getMalfunctionListByMap(Map<String,Object> param);

	public Integer getMalfunctionCountByMap(Map<String,Object> param);

	public Integer insertMalfunction(Malfunction malfunction);

	public Integer updateMalfunction(Malfunction malfunction);

	public Integer deleteMalfunctionById(@Param(value = "id") Long id);

	public Integer batchDeleteMalfunction(Map<String,List<String>> params);

}
