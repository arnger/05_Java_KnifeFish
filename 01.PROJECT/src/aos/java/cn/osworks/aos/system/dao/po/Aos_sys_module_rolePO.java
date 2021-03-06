package cn.osworks.aos.system.dao.po;

import cn.osworks.aos.core.typewrap.PO;

/**
 * <b>功能模块-角色关联表[aos_sys_module_role]数据持久化对象</b>
 * <p>
 * 注意:此文件由AOS平台自动生成-禁止手工修改。
 * </p>
 * 
 * @author AHei
 * @date 2015-12-22 22:10:31
 */
public class Aos_sys_module_rolePO extends PO {

	private static final long serialVersionUID = 1L;

	/**
	 * 流水号
	 */
	private String id_;
	
	/**
	 *  角色流水号
	 */
	private String role_id_;
	
	/**
	 * 功能模块流水号
	 */
	private String module_id_;
	
	/**
	 * 权限类型
	 */
	private String grant_type_;
	
	/**
	 * 授权时间
	 */
	private String operate_time_;
	
	/**
	 * 授权人流水号
	 */
	private String operator_id_;
	

	/**
	 * 流水号
	 * 
	 * @return id_
	 */
	public String getId_() {
		return id_;
	}
	
	/**
	 *  角色流水号
	 * 
	 * @return role_id_
	 */
	public String getRole_id_() {
		return role_id_;
	}
	
	/**
	 * 功能模块流水号
	 * 
	 * @return module_id_
	 */
	public String getModule_id_() {
		return module_id_;
	}
	
	/**
	 * 权限类型
	 * 
	 * @return grant_type_
	 */
	public String getGrant_type_() {
		return grant_type_;
	}
	
	/**
	 * 授权时间
	 * 
	 * @return operate_time_
	 */
	public String getOperate_time_() {
		return operate_time_;
	}
	
	/**
	 * 授权人流水号
	 * 
	 * @return operator_id_
	 */
	public String getOperator_id_() {
		return operator_id_;
	}
	

	/**
	 * 流水号
	 * 
	 * @param id_
	 */
	public void setId_(String id_) {
		this.id_ = id_;
	}
	
	/**
	 *  角色流水号
	 * 
	 * @param role_id_
	 */
	public void setRole_id_(String role_id_) {
		this.role_id_ = role_id_;
	}
	
	/**
	 * 功能模块流水号
	 * 
	 * @param module_id_
	 */
	public void setModule_id_(String module_id_) {
		this.module_id_ = module_id_;
	}
	
	/**
	 * 权限类型
	 * 
	 * @param grant_type_
	 */
	public void setGrant_type_(String grant_type_) {
		this.grant_type_ = grant_type_;
	}
	
	/**
	 * 授权时间
	 * 
	 * @param operate_time_
	 */
	public void setOperate_time_(String operate_time_) {
		this.operate_time_ = operate_time_;
	}
	
	/**
	 * 授权人流水号
	 * 
	 * @param operator_id_
	 */
	public void setOperator_id_(String operator_id_) {
		this.operator_id_ = operator_id_;
	}
	

}