package cn.est.mapper;
import  cn.est.pojo.PayOrder;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface PayOrderMapper {

	public PayOrder getPayOrderById(@Param(value = "id") Long id);

	public List<PayOrder>	getPayOrderListByMap(Map<String,Object> param);

	public Integer getPayOrderCountByMap(Map<String,Object> param);

	public Integer insertPayOrder(PayOrder payOrder);

	public Integer updatePayOrder(PayOrder payOrder);

	public Integer deletePayOrderById(@Param(value = "id") Long id);

	public Integer batchDeletePayOrder(Map<String,List<String>> params);

}
