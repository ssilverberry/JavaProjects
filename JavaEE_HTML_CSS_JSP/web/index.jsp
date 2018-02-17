<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 01.02.2018
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Your hobby</title>
    <link href="css/style.css" rel="stylesheet" >
    <script>
      var request = new XMLHttpRequest();
      function searchInfo() {
          var name = document.userNameForm.username.value;
          localStorage.setItem("name", name);
          var url = "pages/processor.jsp?val=" + name;
          try {
              request.onreadystatechange = function () {
                  if (request.readyState==4){
                      var respText = request.responseText;
                      document.getElementById('spanid').innerHTML=respText;
                  }
              }
          } catch (e) {
              alert("Unable to connect to server");
          }
          request.open("GET", url, true);
          request.send();
      }
    </script>
  </head>

  <body>
  <div>
    <p class="imagep">
        <img src="images/hello.gif">
    </p>
    <form class="form" name="userNameForm" action="pages/main.jsp" method="post">
      <label>
        Enter your name:
        <input class="inputf" type="text" name="username" value="" size="20" id="user-name-label"
               onkeyup="searchInfo()">
        <input class="inputs"type="submit" value="Accept">
      </label>
    </form>
    <div id="spanid"></div>
  </div>
  </body>
</html>
