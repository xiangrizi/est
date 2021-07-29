package cn.est.mapper;
import  cn.est.pojo.Brand;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface BrandMapper {

	public Brand getBrandById(@Param(value = "id") Long id);

	public List<Brand>	getBrandListByMap(Map<String,Object> param);

	public Integer getBrandCountByMap(Map<String,Object> param);

	public Integer insertBrand(Brand brand);

	public Integer updateBrand(Brand brand);

	public Integer deleteBrandById(@Param(value = "id") Long id);

	public Integer batchDeleteBrand(Map<String,List<String>> params);

}
