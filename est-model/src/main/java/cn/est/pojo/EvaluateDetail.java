package cn.est.pojo;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
/**
 *   评估信息详情
 */
public class EvaluateDetail implements Serializable {
    // 
    private Long id;
    // 评估信息Id
    private Long evaluateId;
    // 故障id
    private Long malfId;
    // 故障选项选项id
    private Long optionId;
    // 故障选项选项名称
    private String optionName;
    // 创建人
    private Long createdUserId;
    // 修改人
    private Long updatedUserId;
    // 创建时间
    private Date creatdTime;
    // 修改时间
    private Date updatedTime;
    // 是否删除(0:否,1:是)
    private Integer isDelete;

    // get set 方法
    public void setId (Long  id){
        this.id=id;
    }
    public  Long getId(){
        return this.id;
    }
    public void setEvaluateId (Long  evaluateId){
        this.evaluateId=evaluateId;
    }
    public  Long getEvaluateId(){
        return this.evaluateId;
    }
    public void setMalfId (Long  malfId){
        this.malfId=malfId;
    }
    public  Long getMalfId(){
        return this.malfId;
    }
    public void setOptionId (Long  optionId){
        this.optionId=optionId;
    }
    public  Long getOptionId(){
        return this.optionId;
    }
    public void setOptionName (String  optionName){
        this.optionName=optionName;
    }
    public  String getOptionName(){
        return this.optionName;
    }
    public void setCreatedUserId (Long  createdUserId){
        this.createdUserId=createdUserId;
    }
    public  Long getCreatedUserId(){
        return this.createdUserId;
    }
    public void setUpdatedUserId (Long  updatedUserId){
        this.updatedUserId=updatedUserId;
    }
    public  Long getUpdatedUserId(){
        return this.updatedUserId;
    }
    public void setCreatdTime (Date  creatdTime){
        this.creatdTime=creatdTime;
    }
    public  Date getCreatdTime(){
        return this.creatdTime;
    }
    public void setUpdatedTime (Date  updatedTime){
        this.updatedTime=updatedTime;
    }
    public  Date getUpdatedTime(){
        return this.updatedTime;
    }
    public void setIsDelete (Integer  isDelete){
        this.isDelete=isDelete;
    }
    public  Integer getIsDelete(){
        return this.isDelete;
    }
}
