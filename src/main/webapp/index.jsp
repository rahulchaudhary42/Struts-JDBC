 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title >Registration Form</title>
</head>
<body style="background-color: lightyellow;">
 <div style=" border: 4px solid;
    width: 283px;
    padding: 7px;
    margin-left: 35%;
    margin-top: 13%;">
	<div >
	 
		<h1 style="text-align: center;">Register</h1>
		  
		<s:form action="register">  
          <s:textfield name="name" label="UserName"></s:textfield>  
          <s:password name="password" label="Password"></s:password>  
          <s:textfield name="email" label="Email"></s:textfield>  
          <s:textfield name="mobile" label="MobileNo"></s:textfield>
          <s:textfield name="address" label="Address"></s:textfield>
        <s:submit value="register"></s:submit>   
      </s:form> 
      <a  href="login.jsp">Login</a>
         
      
       </div>
     </div>
</body>
</html> 


 
    


 