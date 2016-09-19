<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div id="menu" >
  <nav>
    <ul>
      <li>
        <a href="/" >
          <span>Main page</span>
        </a>
      </li>
      <li>
        <a href="/employees" >
          <span>Наш персонал</span>
        </a>
      </li>
      <li>
        <a href="/menu" >
          <span>Меню</span>
        </a>
      </li>
      <li>
        <a href="/schema" >
          <span>Схема ресторана</span>
        </a>
      </li>
      <li>
        <a href="/contacts" >
          <span>Наші контакти</span>
        </a>
      </li>
    </ul>
  </nav>
</div>
<table style="align-items: center">
  <tr>
    <th>First Name </th>
    <th>Last Name </th>
    <th>Position</th>
    <th>Phone Number</th>
    <th>Salary</th>
  </tr>

  <tr>
    <td>${employee.name}</td>
    <td>${employee.surname}</td>
    <td>${employee.position}</td>
    <td>${employee.phoneNumber}</td>
    <td>${employee.salary}</td>

  </tr>
</table>
</body>
</html>
