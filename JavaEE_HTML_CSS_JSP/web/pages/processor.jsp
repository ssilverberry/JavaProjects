<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 12.02.2018
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Server</title>
</head>
<body>

<%
    List<String> bd = new ArrayList<String>();
    bd.add("Olya");
    bd.add("Pasha");
    bd.add("Karina");
    bd.add("Roman");
    bd.add("Oleg");
    bd.add("Rodion");
    bd.add("Lesha");
    bd.add("Lena");

    String name = request.getParameter("val");
    if (name == null || name.trim().equals("")){
        out.print("<p>Please enter name: </p>");
    } else {
        List<String> tempList = new ArrayList<String>();
        for (String temp: bd) {
            if (temp.startsWith(name)){
                tempList.add(temp);
            }
        }
        if (tempList.isEmpty()){
            out.print("<p>Please enter name: </p>");
        } else {
            out.print("<ol>");
            for (String temp: tempList) {
                out.print("<li>" + temp + "</li>");
            }
            out.print("</ol>");
        }
    }
%>

</body>
</html>
