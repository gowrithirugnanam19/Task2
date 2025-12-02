<%@page import="java.util.List"%>
<%@page import="com.example.web.bean.EmployeeBean"%>
<html>
	<body bgcolor="pink">
		<table border="4">
			<tr><th>Employee ID</th><th>Employee Name</th><th>Employee Salary</th></tr>
		<%List<EmployeeBean> all=(List<EmployeeBean>)request.getAttribute("allEmp");
			for(EmployeeBean e:all)
			{%>
				
			   <tr><td><%=e.getEid()%></td><td><%=e.getEname()%></td><td><%=e.getEsalary()%></td></tr>
			   
			<%}%>
			</table>
		</body>
</html>