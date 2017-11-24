package struts2jsonjquery.test.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import struts2jsonjquery.test.entity.UserInfo;

import com.opensymphony.xwork2.ActionSupport;

public class JsonJqueryStruts2Action extends ActionSupport {

	private static final long serialVersionUID = 3518833679938898354L;
	
	private String message;		//使用json返回单个值
	private UserInfo userInfo; 		//使用json返回对象
	private List<UserInfo> userInfosList;		//使用josn返回List对象
	private Map<String,UserInfo> userInfosMap; 	//使用json返回Map对象
	//为上面的的属性提供get，Set方法
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public List<UserInfo> getUserInfosList() {
		return userInfosList;
	}
	public void setUserInfosList(List<UserInfo> userInfosList) {
		this.userInfosList = userInfosList;
	}
	public Map<String, UserInfo> getUserInfosMap() {
		return userInfosMap;
	}
	public void setUserInfosMap(Map<String, UserInfo> userInfosMap) {
		this.userInfosMap = userInfosMap;
	}
	/**
	 * <p>
	 * 	返回单个值
	 * <p>
	 * @return
	 */
	public String returnMessage(){
		System.out.println("成功返回单个对象");
		this.message = "成功返回单个值";
		return "message";
	}
	/**
	 * <p>
	 * 	返回UserInfo对象
	 * </p>
	 * @return
	 */
	public String returnUserInfo(){
		userInfo = new UserInfo();
		userInfo.setUserId(10000);
		userInfo.setUserName("张三");
		userInfo.setPassword("000000");
		return "userInfo";
	}
	/**
	 * <p>
	 * 	返回List对象
	 * </p>
	 * @return
	 */
	public String returnList(){
		userInfosList = new ArrayList<UserInfo>();
		UserInfo u1 = new UserInfo();
		u1.setUserId(10000);
		u1.setUserName("张三");
		u1.setPassword("000000");
		UserInfo u2 = new UserInfo();
		u2.setUserId(10001);
		u2.setUserName("李四");
		u2.setPassword("111111");
		UserInfo u3 = new UserInfo();
		u3.setUserId(10002);
		u3.setUserName("王五");
		u3.setPassword("222222");
		UserInfo u4 = new UserInfo();
		u4.setUserId(10003);
		u4.setUserName("赵六");
		u4.setPassword("333333");
		userInfosList.add(u1);
		userInfosList.add(u2);
		userInfosList.add(u3);
		userInfosList.add(u4);
		return "list";
	}
	/**
	 * <p>
	 * 	返回Map对象
	 * </p>
	 * @return
	 */
	public String returnMap(){
		userInfosMap = new HashMap<String,UserInfo>();
		UserInfo u1 = new UserInfo();
		u1.setUserId(10000);
		u1.setUserName("张三");
		u1.setPassword("000000");
		UserInfo u2 = new UserInfo();
		u2.setUserId(10001);
		u2.setUserName("李四");
		u2.setPassword("111111");
		UserInfo u3 = new UserInfo();
		u3.setUserId(10002);
		u3.setUserName("王五");
		u3.setPassword("222222");
		UserInfo u4 = new UserInfo();
		u4.setUserId(10003);
		u4.setUserName("赵六");
		u4.setPassword("333333");
		userInfosMap.put(u1.getUserId()+"", u1);
		userInfosMap.put(u2.getUserId()+"", u2);
		userInfosMap.put(u3.getUserId()+"", u3);
		userInfosMap.put(u4.getUserId()+"", u4);
		return "map";
	}
	/**
	 * <p>
	 * 	获得对象，也就是通过表达获得对象(异步的)
	 * </P>
	 * @return
	 */
	public String gainUserInfo(){
		System.out.println("用户ID："+userInfo.getUserId());
		System.out.println("用户名："+userInfo.getUserName());
		System.out.println("密码："+userInfo.getPassword());
		
		return "userInfo";
	}
	/**
	 * 获得单个值就不用写了和平常一样
	 */

}
