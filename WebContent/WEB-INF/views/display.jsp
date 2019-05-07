<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*,com.emp.model.Emp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>display</title>
</head>
<body>
  <% 
       List<Emp> det=(List<Emp>)request.getAttribute("det");
  %>
  <table border="2">
      <tr>
           <td>Name</td>
           <td>RollNo</td>
           <td>Attendance</td>
      </tr>
      <% for(Emp t:det){ %>
      <tr>
            <td><%=t.getName()%></td>
            <td><%=t.getRollno()%></td>
            <td><%=t.getAttendance()%></td>
      </tr>
      <%} %>
  </table>
</body>
</html>