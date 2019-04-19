<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome Swabhav Techlabs Batch 4</h1>
<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>
		<s:iterator value="students">
			<tr>
				<td><s:property value="firstName" /></td>
				<td><s:property value="lastName" /></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>