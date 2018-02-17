<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 05.02.2018
  Time: 9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="../css/style.css" rel="stylesheet">

</head>
<body>

    <div class="box">Hello, <span class="child"></span> !</div>
    <script>
        var anotherName = localStorage.getItem("name");
        document.querySelector('.child').innerHTML= anotherName;
    </script>
</body>
</html>
