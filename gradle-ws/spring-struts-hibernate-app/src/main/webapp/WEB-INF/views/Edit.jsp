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
<h1 align="center">Edit Student Details</h1>
<s:form action="editAction">
		<s:hidden name="postBack" value="true"></s:hidden>
		<s:textfield name="student.id" label="ID" readonly="true"></s:textfield>
		<s:textfield name="student.firstName" label="First Name"></s:textfield>
		<s:textfield name="student.lastName" label="Last Name"></s:textfield>
		<s:submit name = "submit" value="Edit"></s:submit>
	</s:form>
</body>
</html>