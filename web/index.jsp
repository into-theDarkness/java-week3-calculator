<%--
  Created by IntelliJ IDEA.
  User: duc
  Date: 13/11/2019
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple Calculator</title>

  </head>
  <body>
  <form action="/calculate" method="post">
    <h1>Simple Calculator</h1><br>
    Calculator<br>
    First operand
    <input type="text" name ="first" placeholder="First operand"><br>
    Operator
    <select name = "operator">
      <option value="cong">+</option>
      <option value = "tru">-</option>
      <option value = "nhan">*</option>
      <option value = "chia">/</option>
    </select>
    <br>
    Second operand
    <input type = "text" name = "second" placeholder="Second operand" ><br>
    <input type="submit" value="Calculate">
  </form>
  </body>
</html>
