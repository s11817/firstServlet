<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="GettingServlet">

  First name :<input type="text" name="name" /><br />
  Surname :<input type="text" name="surname" /><br />
  E-m@il :<input type="text" name="email" /><br />
  Confirm E-m@il :<input type="text" name="email2" /><br />
  Work name :<input type="text" name="workname" /><br />
  Info from:
  <br />
   <input type="radio" name="info" value="workInfo" >Work info<br>
   <input type="radio" name="info" value="schoolInfo">School info<br>
   <input type="radio" name="info" value="facebook">Facebook<br>
   <input type="radio" name="info" value="friends">Friends<br>
   <input type="radio" name="info" value="other">Other<br>
  Kind of ur work :<input type="text" name="work" /><br />
  
 <input type="submit" value=" OK ">
  
</form>

</body>
</html>