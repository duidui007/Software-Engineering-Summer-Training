function validate( )
 {
	  var  f=document.myform;  
	   if(f.MessageTopic.value=="")
	   {
	   alert("请输入留言主题");
	   f.MessageTopic.focus();
	   return false;
	   }  
	   var  f=document.myform;  
	   if(f.Message.value=="")
	   {
	   alert("请输入留言内容");
	   f.Message.focus();
	   return false;
	   }  
       var  f=document.myform;  
	   if(f.userName.value=="")
	   {
	   alert("请输入用户名");
	   f.userName.focus();
	   return false;
	   }  
 }
	   
	  
	   