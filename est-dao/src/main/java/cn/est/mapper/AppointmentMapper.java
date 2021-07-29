package cn.est.mapper;
import  cn.est.pojo.Appointment;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface AppointmentMapper {

	public Appointment getAppointmentById(@Param(value = "id") Long id);

	public List<Appointment>	getAppointmentListByMap(Map<String,Object> param);

	public Integer getAppointmentCountByMap(Map<String,Object> param);

	public Integer insertAppointment(Appointment appointment);

	public Integer updateAppointment(Appointment appointment);

	public Integer deleteAppointmentById(@Param(value = "id") Long id);

	public Integer batchDeleteAppointment(Map<String,List<String>> params);

}
