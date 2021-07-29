package cn.est.mapper;
import  cn.est.pojo.MalfunctionOptions;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface MalfunctionOptionsMapper {

	public MalfunctionOptions getMalfunctionOptionsById(@Param(value = "id") Long id);

	public List<MalfunctionOptions>	getMalfunctionOptionsListByMap(Map<String,Object> param);

	public Integer getMalfunctionOptionsCountByMap(Map<String,Object> param);

	public Integer insertMalfunctionOptions(MalfunctionOptions malfunctionOptions);

	public Integer updateMalfunctionOptions(MalfunctionOptions malfunctionOptions);

	public Integer deleteMalfunctionOptionsById(@Param(value = "id") Long id);

	public Integer batchDeleteMalfunctionOptions(Map<String,List<String>> params);

}
