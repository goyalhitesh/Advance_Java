<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<%
		String errorMessage = (String) request.getAttribute("errorMessage");
	%>
	<div>
	<font color="red"><%=errorMessage %></font>
	</div>
</body>
</html>