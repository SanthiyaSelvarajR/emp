<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1>Register Here!!!</h1>
<br>
<from actio="insert" method="post" modelAttribute="emp">
   Name:<input type="text" name="name" required><br><br>
   RollNo:<input type="text" name="rollno" required><br><br>
   <input type="hidden" name="id">
   <input type="submit" value="submit">
</from>
<a href="login" ><button>login</button></a>
<a href="update" ><button>update</button></a>
</center>
</body>
</html>