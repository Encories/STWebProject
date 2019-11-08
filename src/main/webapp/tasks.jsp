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

<h1>Find task</h1><br/>
<form method="get" action="">

    <label>Start Date: <input type="date" name="startDate"> </label><br>
    <label>End Date: <input type="date" name="endDate"></label><br>

    <label>Start Date: <input type="text" name="startDate"> </label><br>
    <label>End Date: <input type="text" name="endDate"></label><br>
    <label>Assignee: <select name="asegnee">
        <c:forEach var="items" items="${tasks}">
            <option value="1">${items.assignee}</option>
        </c:forEach>
    </select></label><br>
    <label>Period:
        <select name="period">
            <option value="1">Last Quarter</option>
            <option value="2">Last Month</option>
            <option value="3">Current Quarter to Date</option>
            <option value="3">Current Month to Date</option>
            <option value="3">Current Week to Date</option>
        </select>
    </label><br>
    <input type="submit" value="Submit">


</form>


</body>
</html>
