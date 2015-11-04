<%--
  Created by IntelliJ IDEA.
  User: asimsangram
  Date: 11/4/15
  Time: 10:51 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
    <table>
        <thead>
            <tr>
                <th>S.N.</th>
                <th>Book Name</th>
                <th>Author</th>
                <th>Borrowed Date</th>
                <th>Returned Date</th>
                <th>Fine Paid</th>
            </tr>
        </thead>
        <tbody>
            <g:each in="${history}" var="item" status="i">
                <tr>
                    <td>${i + 1}</td>
                    <td>${item.key.book.name}</td>
                    <td>${item.key.book.author}</td>
                    <td>${item.key.borrowedDate}</td>
                    <td>${item.key.returnedDate}</td>
                    <td></td>
                </tr>
            </g:each>
        </tbody>
    </table>
</body>
</html>