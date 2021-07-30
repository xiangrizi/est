package cn.est.mapper;
import cn.est.dto.EvaluteDTO;
import cn.est.dto.MalfunctionDTO;
import cn.est.pojo.Evaluate;
import  cn.est.pojo.Malfunction;
import cn.est.pojo.MalfunctionOptions;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MalfunctionMapper {

	/**
	 *  根据商品id查询评估维度信息
	 * @param modelId 商品型号id
	 * @return 评估维度信息列表
	 */
	List<MalfunctionDTO> getByModelId(@Param(value = "modelId") Long modelId);

	Malfunction getMalfunctionById(@Param(value = "id") Long id);

	List<Malfunction>	getMalfunctionListByMap(Map<String, Object> param);

	Integer getMalfunctionCountByMap(Map<String, Object> param);

	Integer insertMalfunction(Malfunction malfunction);

	Integer updateMalfunction(Malfunction malfunction);

	Integer deleteMalfunctionById(@Param(value = "id") Long id);

	Integer batchDeleteMalfunction(Map<String, List<String>> params);

}
