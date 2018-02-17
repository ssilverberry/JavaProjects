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
    <div class="lorem">
        <b>НАВЕДИТЕ КУРСОР НА ЗЕЛЕНЫЙ БЛОК СПРАВА ВВЕРХУ</b><br>
        <b><i>Lorem ipsum</i></b> dolor sit amet, consectetur adipisicing elit. Aliquid, commodi dolores explicabo nisi nulla omnis praesentium quaerat reiciendis sunt tenetur vel voluptatem. Beatae illo maiores maxime porro repudiandae veritatis voluptatem?
    </div>
    <div class="lorem second_lorem">
        <b><i>Lorem ipsum</i></b> dolor sit amet, consectetur adipisicing elit. Aliquid, commodi dolores explicabo nisi nulla omnis praesentium quaerat reiciendis sunt tenetur vel voluptatem. Beatae illo maiores maxime porro repudiandae veritatis voluptatem?
    </div>
    <div class="lorem third_lorem">
        <b><i>Lorem ipsum</i></b> dolor sit amet, consectetur adipisicing elit. Aliquid, commodi dolores explicabo nisi nulla omnis praesentium quaerat reiciendis sunt tenetur vel voluptatem. Beatae illo maiores maxime porro repudiandae veritatis voluptatem?
    </div>
    <script>
        var anotherName = localStorage.getItem("name");
        document.querySelector('.child').innerHTML= anotherName;
    </script>
</body>
</html>
