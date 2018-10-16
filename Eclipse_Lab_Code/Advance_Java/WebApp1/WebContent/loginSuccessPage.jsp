<%@page import="com.cg.project.beans.Associate"%>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<font color="olive" size="7"> <%-- <%
 	Associate associate = (Associate) request.getAttribute("associate");
 	out.println("Welcome " + associate.getAssociateId());
	%> --%> 
		<%-- <%
 		Associate associate = (Associate) request.getAttribute("associate");
		%> 
		Welcome <%=associate.getAttributeId()%> --%>
		Welcome ${requestScope.associate.associateId}
		</font>
	</div>
</body>
</html>