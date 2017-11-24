package struts2jsonjquery.test.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import struts2jsonjquery.test.entity.UserInfo;

import com.opensymphony.xwork2.ActionSupport;

public class JsonJqueryStruts2Action extends ActionSupport {

	private static final long serialVersionUID = 3518833679938898354L;
	
	private String message;		//ʹ��json���ص���ֵ
	private UserInfo userInfo; 		//ʹ��json���ض���
	private List<UserInfo> userInfosList;		//ʹ��josn����List����
	private Map<String,UserInfo> userInfosMap; 	//ʹ��json����Map����
	//Ϊ����ĵ������ṩget��Set����
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
	 * 	���ص���ֵ
	 * <p>
	 * @return
	 */
	public String returnMessage(){
		System.out.println("�ɹ����ص�������");
		this.message = "�ɹ����ص���ֵ";
		return "message";
	}
	/**
	 * <p>
	 * 	����UserInfo����
	 * </p>
	 * @return
	 */
	public String returnUserInfo(){
		userInfo = new UserInfo();
		userInfo.setUserId(10000);
		userInfo.setUserName("����");
		userInfo.setPassword("000000");
		return "userInfo";
	}
	/**
	 * <p>
	 * 	����List����
	 * </p>
	 * @return
	 */
	public String returnList(){
		userInfosList = new ArrayList<UserInfo>();
		UserInfo u1 = new UserInfo();
		u1.setUserId(10000);
		u1.setUserName("����");
		u1.setPassword("000000");
		UserInfo u2 = new UserInfo();
		u2.setUserId(10001);
		u2.setUserName("����");
		u2.setPassword("111111");
		UserInfo u3 = new UserInfo();
		u3.setUserId(10002);
		u3.setUserName("����");
		u3.setPassword("222222");
		UserInfo u4 = new UserInfo();
		u4.setUserId(10003);
		u4.setUserName("����");
		u4.setPassword("333333");
		userInfosList.add(u1);
		userInfosList.add(u2);
		userInfosList.add(u3);
		userInfosList.add(u4);
		return "list";
	}
	/**
	 * <p>
	 * 	����Map����
	 * </p>
	 * @return
	 */
	public String returnMap(){
		userInfosMap = new HashMap<String,UserInfo>();
		UserInfo u1 = new UserInfo();
		u1.setUserId(10000);
		u1.setUserName("����");
		u1.setPassword("000000");
		UserInfo u2 = new UserInfo();
		u2.setUserId(10001);
		u2.setUserName("����");
		u2.setPassword("111111");
		UserInfo u3 = new UserInfo();
		u3.setUserId(10002);
		u3.setUserName("����");
		u3.setPassword("222222");
		UserInfo u4 = new UserInfo();
		u4.setUserId(10003);
		u4.setUserName("����");
		u4.setPassword("333333");
		userInfosMap.put(u1.getUserId()+"", u1);
		userInfosMap.put(u2.getUserId()+"", u2);
		userInfosMap.put(u3.getUserId()+"", u3);
		userInfosMap.put(u4.getUserId()+"", u4);
		return "map";
	}
	/**
	 * <p>
	 * 	��ö���Ҳ����ͨ������ö���(�첽��)
	 * </P>
	 * @return
	 */
	public String gainUserInfo(){
		System.out.println("�û�ID��"+userInfo.getUserId());
		System.out.println("�û�����"+userInfo.getUserName());
		System.out.println("���룺"+userInfo.getPassword());
		
		return "userInfo";
	}
	/**
	 * ��õ���ֵ�Ͳ���д�˺�ƽ��һ��
	 */

}
