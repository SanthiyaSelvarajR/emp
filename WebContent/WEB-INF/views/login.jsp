<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>login here.....</h1>
<from actio="display" method="post" modelAttribute="emp1">
   Name:<input type="text" name="name" required><br><br>
   RollNo:<input type="text" name="rollno" required><br><br>
   <input type="hidden" name="id">
   <input type="submit" value="submit">
</from><br>
<a href="display" ><button>display</button></a>
</body>
</html>