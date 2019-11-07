<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello!</h1>

<c:forEach var="items" items="${tasks}">

    ${items.id}
    ${items.summary}
    ${items.startDate}
    ${items.endDate}
    ${items.assignee}


   </c:forEach>


</body>
</html>
