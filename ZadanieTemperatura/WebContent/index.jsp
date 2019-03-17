<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Przelicznik temperatury</title>
</head>
<body>
<form action="MyServlet" method="get">
<input type="number" min="-460" max="999" step="0.01" name="value1">
<select name="oper">
<option value="cf">Celsius -> Fahrenheit</option>
<option value="fc">Fahrenheit -> Celsius</option>
</select>
<input type="submit" value="Oblicz">
<%=(Double)request.getAttribute("result")%>
</form>


</body>
</html>