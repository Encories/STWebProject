<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello ${name} !</h1>

<c:forEach var="items" items="${tasks}">

    ${items}

</c:forEach>


</body>
</html>
