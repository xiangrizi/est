package cn.est.mapper;
import  cn.est.pojo.BrandClassifyRelation;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface BrandClassifyRelationMapper {

	BrandClassifyRelation getBrandClassifyRelationById(@Param(value = "id") Long id);

	List<BrandClassifyRelation>	getBrandClassifyRelationListByMap(Map<String, Object> param);

	Integer getBrandClassifyRelationCountByMap(Map<String, Object> param);

	Integer insertBrandClassifyRelation(BrandClassifyRelation brandClassifyRelation);

	Integer updateBrandClassifyRelation(BrandClassifyRelation brandClassifyRelation);

	Integer deleteBrandClassifyRelationById(@Param(value = "id") Long id);

	Integer batchDeleteBrandClassifyRelation(Map<String, List<String>> params);

}
