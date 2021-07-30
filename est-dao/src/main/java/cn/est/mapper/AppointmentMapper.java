package cn.est.mapper;
import  cn.est.pojo.Appointment;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface AppointmentMapper {

	Appointment getAppointmentById(@Param(value = "id") Long id);

	List<Appointment>	getAppointmentListByMap(Map<String, Object> param);

	Integer getAppointmentCountByMap(Map<String, Object> param);

	Integer insertAppointment(Appointment appointment);

	Integer updateAppointment(Appointment appointment);

	Integer deleteAppointmentById(@Param(value = "id") Long id);

	Integer batchDeleteAppointment(Map<String, List<String>> params);

}
