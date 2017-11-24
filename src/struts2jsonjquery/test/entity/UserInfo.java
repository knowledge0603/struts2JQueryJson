package struts2jsonjquery.test.entity;

import java.io.Serializable;
/**
 * <p>
 * 	用户实体类
 * </p>
 */
public class UserInfo implements Serializable {

	private static final long serialVersionUID = 3952189513312630860L;
	
	private int userId;
	private String userName;
	private String password;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
