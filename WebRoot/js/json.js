//初始加载页面时
$(document).ready(function(){
	//为获取单个值的按钮注册鼠标单击事件
	$("#getMessage").click(function(){
		$.getJSON("jsontest!returnMessage.action",function(data){
			//通过.操作符可以从data.message中获得Action中message的值
			$("#message").html("<font color='red'>"+data.message+"</font>");
		});
	});
	//为获取UserInfo对象按钮添加鼠标单击事件
	$("#getUserInfo").click(function(){
		$.getJSON("jsontest!returnUserInfo.action",function(data){
			//清空显示层中的数据
			$("#message").html("");
			//为显示层添加获取到的数据
			//获取对象的数据用data.userInfo.属性
			$("#message").append("<div><font color='red'>用户ID："+data.userInfo.userId+"</font></div>")
					     .append("<div><font color='red'>用户名："+data.userInfo.userName+"</font></div>")
					     .append("<div><font color='red'>密码："+data.userInfo.password+"</font></div>")
		});
	});
	//为获取List对象按钮添加鼠标单击事件
	$("#getList").click(function(){
		$.getJSON("jsontest!returnList.action",function(data){
			//清空显示层中的数据
			$("#message").html("");
			//使用jQuery中的each(data,function(){});函数
			//从data.userInfosList获取UserInfo对象放入value之中
			$.each(data.userInfosList,function(i,value){
				$("#message").append("<div>第"+(i+1)+"个用户：</div>")
						 .append("<div><font color='red'>用户ID："+value.userId+"</font></div>")
					     .append("<div><font color='red'>用户名："+value.userName+"</font></div>")
					     .append("<div><font color='red'>密码："+value.password+"</font></div>");
			});
		});
	});
	//为获取Map对象按钮添加鼠标单击事件
	$("#getMap").click(function(){
		$.getJSON("jsontest!returnMap.action",function(data){
			//清空显示层中的数据
			$("#message").html("");
			//使用jQuery中的each(data,function(){});函数
			//从data.userInfosList获取UserInfo对象放入value之中
			//key值为Map的键值
			
			$.each(data.userInfosMap,function(key,value){
				$("#message").append("<div><font color='red'>用户ID："+value.userId+"</font></div>")
					     .append("<div><font color='red'>用户名："+value.userName+"</font></div>")
					     .append("<div><font color='red'>密码："+value.password+"</font></div>");
			});
		});
	});
	//向服务器发送表达数据
	$("#regRe").click(function(){
		//把表单的数据进行序列化
		var params = $("form").serialize();
		//使用jQuery中的$.ajax({});Ajax方法
		$.ajax({
			url:"jsontest!gainUserInfo.action",
			type:"POST",
			data:params,
			dataType:"json",
			success:function(data){
				//清空显示层中的数据
			$("#message").html("");
			//为显示层添加获取到的数据
			//获取对象的数据用data.userInfo.属性		
			$("#message").append("<div><font color='red'>用户ID："+data.userInfo.userId+"</font></div>")
		     .append("<div><font color='red'>用户名："+data.userInfo.userName+"</font></div>")
		     .append("<div><font color='red'>密码："+data.userInfo.password+"</font></div>")
					    
			}
		});
	});
});
