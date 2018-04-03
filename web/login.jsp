<%--
  Created by IntelliJ IDEA.
  User: Eduardo Luis
  Date: 30/3/2018
  Time: 9:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Interfell Test</h1>

 <table>
    <form action="/RestClientProject/LoginViewServlet" method="post">
        <tr>
            <td>User:</td><td> <input type="text" name="user" value=""> </td>
        </tr>
        <tr>
            <td>Password:</td><td> <input type="text" name="password" value=""> </td>
        </tr>
        <tr>
            <td><input type="submit" name="boton" value="enviar"> </td>
        </tr>

    </form>

 </table>

</body>
</html>
