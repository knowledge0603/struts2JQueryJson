//��ʼ����ҳ��ʱ
$(document).ready(function(){
	//Ϊ��ȡ����ֵ�İ�ťע����굥���¼�
	$("#getMessage").click(function(){
		$.getJSON("jsontest!returnMessage.action",function(data){
			//ͨ��.���������Դ�data.message�л��Action��message��ֵ
			$("#message").html("<font color='red'>"+data.message+"</font>");
		});
	});
	//Ϊ��ȡUserInfo����ť�����굥���¼�
	$("#getUserInfo").click(function(){
		$.getJSON("jsontest!returnUserInfo.action",function(data){
			//�����ʾ���е�����
			$("#message").html("");
			//Ϊ��ʾ����ӻ�ȡ��������
			//��ȡ�����������data.userInfo.����
			$("#message").append("<div><font color='red'>�û�ID��"+data.userInfo.userId+"</font></div>")
					     .append("<div><font color='red'>�û�����"+data.userInfo.userName+"</font></div>")
					     .append("<div><font color='red'>���룺"+data.userInfo.password+"</font></div>")
		});
	});
	//Ϊ��ȡList����ť�����굥���¼�
	$("#getList").click(function(){
		$.getJSON("jsontest!returnList.action",function(data){
			//�����ʾ���е�����
			$("#message").html("");
			//ʹ��jQuery�е�each(data,function(){});����
			//��data.userInfosList��ȡUserInfo�������value֮��
			$.each(data.userInfosList,function(i,value){
				$("#message").append("<div>��"+(i+1)+"���û���</div>")
						 .append("<div><font color='red'>�û�ID��"+value.userId+"</font></div>")
					     .append("<div><font color='red'>�û�����"+value.userName+"</font></div>")
					     .append("<div><font color='red'>���룺"+value.password+"</font></div>");
			});
		});
	});
	//Ϊ��ȡMap����ť�����굥���¼�
	$("#getMap").click(function(){
		$.getJSON("jsontest!returnMap.action",function(data){
			//�����ʾ���е�����
			$("#message").html("");
			//ʹ��jQuery�е�each(data,function(){});����
			//��data.userInfosList��ȡUserInfo�������value֮��
			//keyֵΪMap�ļ�ֵ
			
			$.each(data.userInfosMap,function(key,value){
				$("#message").append("<div><font color='red'>�û�ID��"+value.userId+"</font></div>")
					     .append("<div><font color='red'>�û�����"+value.userName+"</font></div>")
					     .append("<div><font color='red'>���룺"+value.password+"</font></div>");
			});
		});
	});
	//����������ͱ������
	$("#regRe").click(function(){
		//�ѱ������ݽ������л�
		var params = $("form").serialize();
		//ʹ��jQuery�е�$.ajax({});Ajax����
		$.ajax({
			url:"jsontest!gainUserInfo.action",
			type:"POST",
			data:params,
			dataType:"json",
			success:function(data){
				//�����ʾ���е�����
			$("#message").html("");
			//Ϊ��ʾ����ӻ�ȡ��������
			//��ȡ�����������data.userInfo.����		
			$("#message").append("<div><font color='red'>�û�ID��"+data.userInfo.userId+"</font></div>")
		     .append("<div><font color='red'>�û�����"+data.userInfo.userName+"</font></div>")
		     .append("<div><font color='red'>���룺"+data.userInfo.password+"</font></div>")
					    
			}
		});
	});
});
