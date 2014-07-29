function validate( )
 {
       var  f=document.myform;   //用户名不能为空
	   if(f.userName.value=="")
	   {
	   alert("请输入用户名");
	   f.userName.focus();
	   return false;
	   }  
     var e=document.myform.email.value; 
     if (e.length==0)  //检测长度是否为0，即是否为空
    {
      alert("电子邮件不能为空!");
      return false;
    }
     if (e.indexOf("@",0)==-1) //检测是否包含”@”符号
    {
         alert("电子邮件格式不正确\n必须包含@符号！");
         return false;
    }
     if (e.indexOf(".",0)==-1) //检测是否包含”.”符号
      {
          alert("电子邮件格式不正确\n必须包含.符号！");
          return false;
       }
	  
	   var  p=document.myform;    //检测电话号码是否为空
	   if(p.phone.value==""||isNaN(p.phone.value))
	   {
	   alert("请输入正确的联系电话");
	   p.phone.focus();
	   return false;
	   }  
	   var  a=document.myform;   //检测地址是否为空
	   if(a.Address.value=="")
	   {
	   alert("请输入联系地址");
	   a.Address.focus();
	   return false;
	   }     
	   var pass1= document.myform.password.value;  //检测密码
	    var pass2=document.myform.password2.value;
		if (pass1==pass2)
		{
		 if (pass1.length!=0) 
		 {
		  return true;
		 }
		 else
		  {
		    alert("密码不能为空！\n请输入密码");
			 return false;
		  } 
		 }
		else
		    {
			 alert("确认码必须和输入的密码相同！");
			 return false; 
			 }
}	 