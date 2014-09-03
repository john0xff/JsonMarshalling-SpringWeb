<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>home page of jquery data sources app</h3> <br>

	<!-- dynamic way -->
	<h4>get source files in dynamic way (ajax/XHR) - from data base and draw chart based at this data</h4>
	<a href='${ pageContext.request.contextPath }/dynamicJson'>dynamic Json chart</a><br>
	
	<h4>get raw source files in dynamic way - database</h4>
	<a href='${ pageContext.request.contextPath }/dynamicJsonFile'>dynamic Json file - database</a><br>

	<h4>get raw source files in dynamic way - generated from array of Strings</h4>
	<a href='${ pageContext.request.contextPath }/dynamicJsonFileArray'>dynamic Json file - plain object</a><br>

	<!-- static way -->
	<h4>get source files in static way (ajax/XHR) - from files existed on server and draw chart based at this data</h4>
	<a href='${ pageContext.request.contextPath }/staticJson'>static Json chart</a><br>
	
	<h4>get raw source files in static way</h4>
	<a href='${ pageContext.request.contextPath }/res/chartjqx/chartJson/data.json'>static XML file</a><br>

</body>
</html>