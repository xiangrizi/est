package cn.est.mapper;
import  cn.est.pojo.Users;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface UsersMapper {

	public Users getUsersById(@Param(value = "id") Long id);

	public List<Users>	getUsersListByMap(Map<String,Object> param);

	public Integer getUsersCountByMap(Map<String,Object> param);

	public Integer insertUsers(Users users);

	public Integer updateUsers(Users users);

	public Integer deleteUsersById(@Param(value = "id") Long id);

	public Integer batchDeleteUsers(Map<String,List<String>> params);

}
