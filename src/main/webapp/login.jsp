 
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
		<h1 style="text-align: center;">Login</h1>
      <s:form action="loginprocess">  
        <s:textfield name="username" label="Name"></s:textfield>  
        <s:password name="userpass" label="Password"></s:password>  
        <s:submit value="login"></s:submit>  
      </s:form>      
         <a  href="forget.jsp">forget</a>
       </div>
</body>
</html> 