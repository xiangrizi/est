package cn.est.mapper;
import  cn.est.pojo.BrandClassifyRelation;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface BrandClassifyRelationMapper {

	public BrandClassifyRelation getBrandClassifyRelationById(@Param(value = "id") Long id);

	public List<BrandClassifyRelation>	getBrandClassifyRelationListByMap(Map<String,Object> param);

	public Integer getBrandClassifyRelationCountByMap(Map<String,Object> param);

	public Integer insertBrandClassifyRelation(BrandClassifyRelation brandClassifyRelation);

	public Integer updateBrandClassifyRelation(BrandClassifyRelation brandClassifyRelation);

	public Integer deleteBrandClassifyRelationById(@Param(value = "id") Long id);

	public Integer batchDeleteBrandClassifyRelation(Map<String,List<String>> params);

}
