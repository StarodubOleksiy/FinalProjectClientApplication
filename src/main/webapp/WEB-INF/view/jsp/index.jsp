<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
    <title></title>
</head>
<body>
<h1>Ласкаво просимо в наш ресторан - ...!!!</h1>
<h1>Адреса: місто Львів Вулиця Любінська. </h1>
<h1>Контактний телефон : 123-456-789-0</h1>
<h1>Електронна пошта:restoran@mail</h1>

<div id="menu" >
    <nav>
        <ul>
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


<div id="right">
<form method="POST" action="findByWord">
    <table>
        <tr><th><h2>Пошук</h2></th></tr>
        <tr>
            <td>Введіть назву страви :</td>
            <td><input type="text" name="name"/></td>

        </tr>
          <tr>
            <td colspan="2"><input type="submit"></td>
        </tr>
    </table>
</form>


<table style="align-items: center" class="dish">
    ${der}
    <tr>
        <td><a href="/dish?dishName=${finddish.name}">${finddish.name}</a></td>
    </tr>
</table>

</div>
</body>
</html>
