<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: JOMEIJER
  Date: 11-11-12
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>The advice</title>
</head>
<body>
  <h1>Beer Recommendations JSP</h1>
  <p>
    <ul>
    <%
      List brands = (List)request.getAttribute("brands");
      Iterator it = brands.iterator();
      while(it.hasNext()) {
        out.print("<li>try: "+it.next()+"</li>");
      }
    %>
    </ul>
  </p>
</body>
</html>