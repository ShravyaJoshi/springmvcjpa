<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="fo" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<fo:form action="adddata" method="post" modelAttribute="my">
<tr>
<td> Mobile ID</td>
<td>
<fo:input path="mobileId"/>
</tr>
<tr>
<td>Mobile name</td>
<td>
<fo:input path="mobileName"/>

</tr>
<tr>
<td>Mobile price</td>
<td>
<fo:input path="mobilePrice"/>
</tr>
<tr>
<td>Mobile category</td>
<td><fo:select path="mobileCategory" items="${cato}"></fo:select>
</td>
</tr>
<tr>
<td> online    </td>
<td>
<fo:radiobutton path="option" value="yes" />yes
<fo:radiobutton path="option" value="no"/>no
</tr>
<tr>
<td>
<input type="submit" value="addMobile"/></td>
</tr>
</fo:form>


</table>

</body>
</html>