<%--
  Created by IntelliJ IDEA.
  User: saneel
  Date: 11/3/15
  Time: 12:15 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
    <input type="button" name="history" id="history" value="History">
    Number of allowed : <input type="text" name="allowed" id="allowed" value="${count}" disabled>
    <table>
        <thead>
            <tr>
                <th>S.No</th>
                <th>Name</th>
                <th>Author</th>
                <th>Available Quantity</th>
            </tr>
        </thead>
        <tbody>
            <g:each in="${list}" var="booklist" status="i">
                <tr>
                    <td>${i+1}</td>
                    <td>${booklist.name}</td>
                    <td>${booklist.author}</td>
                    <td>${booklist.availableQuantity}</td>
                </tr>
            </g:each>
        </tbody>
    </table>
</body>
</html>