package cn.est.pojo;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
/**
 *   维修订单流水信息
 */
public class MaintainOrderFlow implements Serializable {
    // 
    private Long id;
    // 订单编号
    private String orderNo;
    // 订单状态（1:预约下单,2:支付定金,3:后台确认,4:实物质检,5:用户确认检查结果,6:维修完成,7:用户确认维修结果,8:支付尾款,9:用户取消,10结束）
    private Integer orderStatus;
    // 订单状态说明
    private String orderStatusDesc;
    // 操作人id
    private Long operationUId;
    // 操作人姓名
    private String operationName;
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
    public void setOrderNo (String  orderNo){
        this.orderNo=orderNo;
    }
    public  String getOrderNo(){
        return this.orderNo;
    }
    public void setOrderStatus (Integer  orderStatus){
        this.orderStatus=orderStatus;
    }
    public  Integer getOrderStatus(){
        return this.orderStatus;
    }
    public void setOrderStatusDesc (String  orderStatusDesc){
        this.orderStatusDesc=orderStatusDesc;
    }
    public  String getOrderStatusDesc(){
        return this.orderStatusDesc;
    }
    public void setOperationUId (Long  operationUId){
        this.operationUId=operationUId;
    }
    public  Long getOperationUId(){
        return this.operationUId;
    }
    public void setOperationName (String  operationName){
        this.operationName=operationName;
    }
    public  String getOperationName(){
        return this.operationName;
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
