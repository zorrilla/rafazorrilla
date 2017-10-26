<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/style.css" rel="stylesheet" type"text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Testo</h1>
<form action="OperacionesServlet" method="post">
<label>Input a number:</label>
<input type="text" name="txtnumber1"/>
<br>
<label>Input another number:</label>
<input type="text" name="txtnumber2"/>
<input type="submit" value="oprerar"/>

</form>
<table>
<thead><th>Usuarios</th><th>Contraseña</th></thead>
<tbody>
<%for(int i=1; i<=1000; i++)
{
	out.println("<tr><td>input type=\"text\"name=\"admin"+i+"\"placeholder=admi</td><td>admin"+i+"<td></tr>");
						
}
%>
</tbody>
</table>

</body>
</html>