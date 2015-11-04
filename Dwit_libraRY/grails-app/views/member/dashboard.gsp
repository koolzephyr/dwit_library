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

    Menu
    Search
    <sec:ifAllGranted roles="ROLE_ADMIN,ROLE_STUDENT,ROLE_FACULTY"><label>No. of Books allowed: </label></sec:ifAllGranted>

    <table>
        <th>
            <td>S.N.</td>
            <td>Book_Name</td>
            <td>Author</td>
            <sec:ifAllGranted roles="ROLE_LIBRARIAN">
                <td>Quantity</td>
            </sec:ifAllGranted>
            <td>Available Quantity</td>
            <sec:ifAllGranted roles="ROLE_ADMIN,ROLE_STUDENT,ROLE_FACULTY">
                <td>Borrowed Date</td>
                <td>Received Date</td>
            </sec:ifAllGranted>
        </th>
    </table>
</body>
</html>