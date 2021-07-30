package cn.est.mapper;
import  cn.est.pojo.MalfunctionOptions;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MalfunctionOptionsMapper {

	/**
	 * 根据条件查询评估信息
	 * @param params 条件
	 * @return 评估信息
	 */
	List<MalfunctionOptions> getByModeIdAndOptionIds(@Param("params") HashMap<Object, Object> params);

	/**
	 * 二级故障信息查询
	 * @param modelId 商品类型id
	 * @param malfId 故障id
	 * @return /
	 */
	MalfunctionOptions getByModelIdAndId(@Param(value = "modelId") Long modelId, @Param(value = "malfId") Long malfId);

	MalfunctionOptions getMalfunctionOptionsById(@Param(value = "id") Long id);

	List<MalfunctionOptions>	getMalfunctionOptionsListByMap(Map<String, Object> param);

	Integer getMalfunctionOptionsCountByMap(Map<String, Object> param);

	Integer insertMalfunctionOptions(MalfunctionOptions malfunctionOptions);

	Integer updateMalfunctionOptions(MalfunctionOptions malfunctionOptions);

	Integer deleteMalfunctionOptionsById(@Param(value = "id") Long id);

	Integer batchDeleteMalfunctionOptions(Map<String, List<String>> params);

}
