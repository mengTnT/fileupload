<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>


<form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
    <input type="file" name="file">
    <input type="submit" value="提交">

</form>
</body>
</html>
