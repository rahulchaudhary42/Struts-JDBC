 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title >Registration Form</title>
</head>
<body style="background-color: lightyellow;">
 <div style=" border: 4px solid;
    width: 287px;
    padding: 7px;
    margin-left: 35%;
    margin-top: 13%;">
		<h1 style="text-align: center;">Login</h1>
      <s:form action="forgetprocess">  
        <s:textfield name="username" label="Name"></s:textfield>  
        <s:password name="password" label="Password"></s:password> 
        <s:password name="confirmPassword" label="ConPassword"></s:password>   
        <s:submit value="login"></s:submit>  
      </s:form>      
       </div>
</body>
</html> 