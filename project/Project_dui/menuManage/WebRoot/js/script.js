function validate( )
 {
       var  f=document.myform;   //�û�������Ϊ��
	   if(f.userName.value=="")
	   {
	   alert("�������û���");
	   f.userName.focus();
	   return false;
	   }  
     var e=document.myform.email.value; 
     if (e.length==0)  //��ⳤ���Ƿ�Ϊ0�����Ƿ�Ϊ��
    {
      alert("�����ʼ�����Ϊ��!");
      return false;
    }
     if (e.indexOf("@",0)==-1) //����Ƿ������@������
    {
         alert("�����ʼ���ʽ����ȷ\n�������@���ţ�");
         return false;
    }
     if (e.indexOf(".",0)==-1) //����Ƿ������.������
      {
          alert("�����ʼ���ʽ����ȷ\n�������.���ţ�");
          return false;
       }
	  
	   var  p=document.myform;    //���绰�����Ƿ�Ϊ��
	   if(p.phone.value==""||isNaN(p.phone.value))
	   {
	   alert("��������ȷ����ϵ�绰");
	   p.phone.focus();
	   return false;
	   }  
	   var  a=document.myform;   //����ַ�Ƿ�Ϊ��
	   if(a.Address.value=="")
	   {
	   alert("��������ϵ��ַ");
	   a.Address.focus();
	   return false;
	   }     
	   var pass1= document.myform.password.value;  //�������
	    var pass2=document.myform.password2.value;
		if (pass1==pass2)
		{
		 if (pass1.length!=0) 
		 {
		  return true;
		 }
		 else
		  {
		    alert("���벻��Ϊ�գ�\n����������");
			 return false;
		  } 
		 }
		else
		    {
			 alert("ȷ�������������������ͬ��");
			 return false; 
			 }
}	 